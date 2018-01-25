package kr.ac.smu.day07;

public class TestMain {
	public static void main(String[] args) {
		
		Test t=new Test();
		t.info();
		
		System.out.println("이름: "+t.name);
		System.out.println("주소: "+t.addr);
		//System.out.println("잔액: "+t.money); private이라 접근 불가 
		System.out.println("잔액: "+t.getMoney());
		
		
	}
}
