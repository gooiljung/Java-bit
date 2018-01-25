package kr.ac.smu.day08.homework;

public class Triangle extends Shape{
	private double width=r.nextInt(10)+1;
	private double height=r.nextInt(10)+1;
	public double calArea() {
		return width*height/2;
	}
	public void print() {
		System.out.println("삼각형을 선택했습니다. ");
		System.out.println("밑변 의 길이: "+width+"높이: "+height+"삼각형의 넓이는: "+calArea());
	}
}
