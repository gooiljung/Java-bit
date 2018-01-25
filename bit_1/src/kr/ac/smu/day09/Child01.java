package kr.ac.smu.day09;

public class Child01 extends Parent{
	String name="자식1";
	void study() {
		System.out.println("공부를 합니다.");
	}
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	@Override
	void info() {
		System.out.println("첫번째 자식에서 오버라이딩된 메소드 info()..");
	}

}
