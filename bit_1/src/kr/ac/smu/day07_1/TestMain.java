package kr.ac.smu.day07_1;
import kr.ac.smu.day07.Test;
public class TestMain {
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println("name: "+t.name);
		//System.out.println("addr: "+t.addr); addr 은 디폴트라 다른 패키지에서는 사용할 수 없다.
		//System.out.println("name: "+t.money); money는 프라이베이트 라 다른 패키지에서 사용할 수 없다.
		System.out.println("money: "+t.getMoney()); 
		t.setMoney(20000);
		System.out.println("money: "+t.getMoney()); 
		System.out.println("addr: "+t.getAddr()); 
		t.setAddr("LA");
		t.info();
		
	}
}
