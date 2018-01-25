package kr.ac.smu.day05;

class Car{// public 을 붙일 수 없다.
	String name; //멤버변 
	int price; //멤버변수 
	
	
}//클래스 안에 있는 변수만 멤버변수 , 메소드안에 들어가있는 변수는 멤버변수가 아니다 지역변수 이다.
public class CarMain {
	
	public static void main(String[] args) {
		
		int a; // 지역변수 
		
		Car c=new Car();
		Car c2=new Car();
		
		c2.name="audi";
		c2.price=2100;
		
		System.out.println(c.name+"  "+c.price);
		
		c.name="bmw";
		c.price=3200;
		
		System.out.println(c.name+"  "+c.price);
		System.out.println(c2.name+"  "+c2.price);
	}
}
