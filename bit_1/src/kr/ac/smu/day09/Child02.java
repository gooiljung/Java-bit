package kr.ac.smu.day09;

public class Child02 extends Parent{
	String name="자식2";
	int age=12;
	
	void play() {
		System.out.println("나는 놉니다.");
	}
	void sing() {
		System.out.println("나는 노래를 부릅니다. ");
	}
	@Override
	void info() {
		System.out.println("두번째 자식에서 오버라이드한 info..");
	}
}
