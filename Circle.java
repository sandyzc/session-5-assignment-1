package com.ssignment1.Abstract;

import java.util.Scanner;

public class Circle extends Super {

	static double pie = 3.142;	
	
	public Circle(double dim1) {
		super(dim1);
		
	}

	@Override
	void findArea() {
	double area = pie*(dim1*dim1);
	System.out.println("Area of circle is "+area + " mm sq");
	}

	@Override
	void findPerimeter() {
		double perimeter = 2 * pie * dim1;
		System.out.println("Perimeter of circle is "+perimeter + " mm sq");
	}

}
