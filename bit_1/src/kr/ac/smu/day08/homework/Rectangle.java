package kr.ac.smu.day08.homework;

public class Rectangle extends Shape{
	private double width=r.nextInt(10)+1;
	private double height=r.nextInt(10)+1;
	@Override
	public double calArea() {
		return width*height;
	}
	public void print() {
		System.out.println("직사각형을 선택했습니다. ");
		System.out.println("밑변의 길이: "+width+"높이: "+height+"직사각형의 넓이는: "+calArea());
	}
}
