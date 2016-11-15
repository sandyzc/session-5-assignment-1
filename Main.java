package com.ssignment1.Abstract;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Radius of circle in mm ");
		Circle cl = new Circle(s.nextDouble());
		cl.findArea();
		cl.findPerimeter();
		System.out.println();
		System.out.println("**********************************");
		
		Triangle tr = new Triangle(0, 0, 0, 0);
		System.out.println("enter the value of base of triangle in mm");
		tr.base=s.nextInt();
		System.out.println("enter the value of height of triangle in mm");
		tr.dim1=s.nextInt();
		System.out.println("enter the value of 1st side of triangle in mm");
		tr.side1=s.nextInt();
		System.out.println("enter the value of 2nd side of triangle in mm");
		tr.side2=s.nextInt();
		
		tr.findArea();
		tr.findPerimeter();
		
		System.out.println();
		System.out.println("**********************************");
		
		Recangle rc = new Recangle(0, 0);
		System.out.println("Enter the Width of Rectangle");
		rc.dim1=s.nextInt();
		System.out.println("Enter the length of Rectangle");
		rc.length=s.nextInt();
		rc.findArea();
		rc.findPerimeter();
		
	}

}
