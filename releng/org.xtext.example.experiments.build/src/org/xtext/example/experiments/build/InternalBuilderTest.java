/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.example.experiments.build;

import static org.eclipse.xtext.xbase.lib.IterableExtensions.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.junit.Test;

/**
 * @author dhuebner - Initial contribution and API
 */
public class InternalBuilderTest {

	@Test
	public void test() throws CoreException {
		long maxMem = Runtime.getRuntime().maxMemory() / (1024 * 1024);
		long free = Runtime.getRuntime().freeMemory() / (1024 * 1024);
		long used = Runtime.getRuntime().totalMemory() / (1024 * 1024);
		System.out.println("Starting build. Memory max=" + maxMem + "m, total=" + used + "m, free=" + free + "m");
		ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());

		final IMarker[] markers = ResourcesPlugin.getWorkspace().getRoot()
				.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		List<String> errors = new ArrayList<String>();
		for (IMarker marker : markers) {
			String msg = MarkerUtilities.getMessage(marker);
			if (MarkerUtilities.getSeverity(marker) == IMarker.SEVERITY_ERROR) {
				errors.add(msg);
			}
		}

		List<String> top10;
		if (errors.size() > 10) {
			top10 = toList(take(errors, 10));
		} else {
			top10 = errors;
		}
		maxMem = Runtime.getRuntime().maxMemory() / (1024 * 1024);
		free = Runtime.getRuntime().freeMemory() / (1024 * 1024);
		used = Runtime.getRuntime().totalMemory() / (1024 * 1024);
		System.out.println("Finished build. Memory max=" + maxMem + "m, total=" + used + "m, free=" + free + "m");
		assertTrue("Problems found (" + top10.size() + " from " + errors.size() + "): " + join(errors, ", "),
				errors.isEmpty());
	}

}
