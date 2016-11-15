package com.ssignment1.Abstract;

public class Recangle extends Super {
	
	int length;

	public Recangle(double dim1, int length) {
		super(dim1);//will be taken as width of rectangle
		this.length = length;
	}

	@Override
	void findArea() {
		double area = length*dim1;
		System.out.println("The area of rectangle is "+area+" mm sq");
	
		
	}

	@Override
	void findPerimeter() {
		double perimeter = 2*( length+dim1);
		System.out.println("the perimeter of rectangle is "+perimeter+ " mm ");
		
	}
	

}
