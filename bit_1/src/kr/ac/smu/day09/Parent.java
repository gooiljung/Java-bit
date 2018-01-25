package kr.ac.smu.day09;

public  class Parent  {
	String name="부모";
	void info() {
		System.out.println("name: "+name);
	}
	//객체 만들기
	static Parent getInstance() {
		
		return new Child01();
	}
}
