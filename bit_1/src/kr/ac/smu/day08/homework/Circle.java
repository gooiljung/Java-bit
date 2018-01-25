package kr.ac.smu.day08.homework;

public class Circle extends Shape{
	private final double pi=3.14;
	private double radius=r.nextInt(10)+1;
	public double calArea() {
		
		return radius*radius*pi;
	}
	public void print() {
		System.out.println("원을 선택했습니다. ");
		System.out.println("반지름의 길이: "+radius+"원의 넓이는: "+calArea());
	}
}
