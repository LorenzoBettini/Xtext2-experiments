package org.xtext.example.helloinferrer.runtime;

public class HelloResult<T> {
	T value;

	public HelloResult(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
