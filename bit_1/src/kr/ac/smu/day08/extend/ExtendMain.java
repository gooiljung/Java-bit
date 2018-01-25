package kr.ac.smu.day08.extend;
class A{  //.java 로 구성된 클래스만 접근제한자 public을 쓸 수 있어서 class A 에는 절대 public 일 수 없다.
	A(){
		//super();
		System.out.println("A() 생성자 호출..");
		
	}
	



}
class B extends A{ //상속을하면 부모클래스의 생성자를 항상 호출한다 
	B(){
		//super() 라는 코드가 항상 생략이 되있는것 
		System.out.println("B() 생성자 호출..");
		
	}
}
class C extends B{

	C(){
		
		//super();
		System.out.println("C() 생성자 호출..");
	}
}

public class ExtendMain {// .java 이지만 default 도 된다.
	public static void main(String[] args) {
		
		new A();
		new B();
		new C();
		
		
		
	}
}
