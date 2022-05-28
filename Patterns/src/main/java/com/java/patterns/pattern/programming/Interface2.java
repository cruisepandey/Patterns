package com.java.patterns.pattern.programming;

public interface Interface2{

	public void test();
	
	default void a() {
		System.out.println("Second default method");
	}
	
	public static void b() { 
		System.out.println("Second static method");
	}
}
