package com.java.patterns.pattern.programming;

public interface Interface1 {
	
	public void test();
	
	default void a() {
		System.out.println("first default method");
	}
	
	public static void b() {
		System.out.println("first static method");
	}
}
