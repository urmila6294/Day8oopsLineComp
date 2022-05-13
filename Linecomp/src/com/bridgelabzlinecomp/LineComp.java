package com.bridgelabzlinecomp;

import java.util.Scanner;

public class LineComp {

	public static void getInput() {
		InputLineComp line1 = new InputLineComp();// Line1Comparison
		Scanner input = new Scanner(System.in);
		System.out.println("enter the x1,y1,x2,y2 coordinate values for line1");
		line1.setX1(input.nextInt());
		line1.setY1(input.nextInt());
		line1.setX2(input.nextInt());
		line1.setY2(input.nextInt());
		System.out.println(" x1 is =" + line1.getX1() + " x2 is = " + line1.getX2() + " y1 = " + line1.getY1()
				+ " y2 = " + line1.getY2());

		InputLineComp line2 = new InputLineComp(); // Line2 Comparison
		System.out.println("enter the x1,y1,x2,y2 coordinate values for line2");
		line2.setX1(input.nextInt());
		line2.setY1(input.nextInt());
		line2.setX2(input.nextInt());
		line2.setY2(input.nextInt());
		System.out.println(" x" + " is =" + line2.getX1() + " x2 is = " + line2.getX2() + " y1 = " + line2.getY1()
				+ " y2 = " + line2.getY2());

		double length1 = calculateLength(line1.getX1(), line1.getY1(), line1.getX2(), line1.getY2());
		System.out.println("length for line1 = " + length1);

		double length2 = calculateLength(line2.getX1(), line2.getY1(), line2.getX2(), line2.getY2());
		System.out.println("length for line2 = " + length2);

		if (length1 == length2) {
			System.out.println("length1 is equal to length2");
		} else {
			System.out.println("length1 is not equal to length2");
		
		}
		
		compareTo(length1, length2);
	}

	public static double calculateLength(double x1, double y1, double x2, double y2) // Line1 is assigned
	{
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}

	public static void compareTo (double length1, double length2) {
		if (length1 == length2) {
			System.out.println("length1 is equal to length2");
		}
		
		else if (length1 > length2) {
			System.out.println("length1 is greater than length2");}
		else {
			System.out.println("length1 is lesser than length2");}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line-Comparison Program using OOPS ");
		getInput();
		
	}
}