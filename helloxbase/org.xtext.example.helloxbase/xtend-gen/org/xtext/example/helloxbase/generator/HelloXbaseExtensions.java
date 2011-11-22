package org.xtext.example.helloxbase.generator;

import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.helloxbase.helloXbase.Greeting;

@SuppressWarnings("all")
public class HelloXbaseExtensions {
  public String className(final Greeting greeting) {
    String _name = greeting.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
  
  public String packageName(final Greeting greeting) {
    String _name = greeting.getName();
    String _lowerCase = _name.toLowerCase();
    return _lowerCase;
  }
}
