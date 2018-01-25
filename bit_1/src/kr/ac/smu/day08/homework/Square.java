package kr.ac.smu.day08.homework;

public class Square extends Shape{
	private double width=r.nextInt(10)+1;;
	public double calArea() {
		
	
		return width*width;
	}
	public void print() {
		System.out.println("정사각형을 선택했습니다. ");
		System.out.println("한변의 길이: "+width+"정사각형의 넓이는: "+calArea());
	}
}
