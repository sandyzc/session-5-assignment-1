package com.ssignment1.Abstract;

public class Triangle extends Super {
	
	int base;
	int side1;
	int side2;
	public Triangle(double dim1,int base,int side1,int side2) {
		super(dim1);// dim1 is the height
		this.base = base;
		this.side1=side1;
		this.side2=side2;
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	void findArea() {
		double area = base * dim1/2;
		System.out.println("The area of Triangle is "+area + " mm sq");
	}

	@Override
	void findPerimeter() {
		double perimeter = side1+base+side2;
		System.out.println("The peremiter of Triangle is "+perimeter + " mm");
		
	}

}
