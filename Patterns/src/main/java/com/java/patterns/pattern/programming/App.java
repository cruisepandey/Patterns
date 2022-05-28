package com.java.patterns.pattern.programming;

import java.util.ArrayList;

public class App implements Interface1, Interface2
{
    public static void main( String[] args )
    {
        Interface1 i1 = new App();
        Interface2 i2 = new App();
        i1.test();
        i2.test();
        i1.a();  
    }

	@Override
	public void test() {
		System.out.println("Our own test method");
		Interface1.super.a();
		Interface1.b();
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		Interface1.super.a();
		Interface2.super.a();
		Interface2.b();
	}

}
