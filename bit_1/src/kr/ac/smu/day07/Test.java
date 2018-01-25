package kr.ac.smu.day07;

public class Test {
	public String name;
	String addr;
	private int money;
	public Test(){
		name="홍길동";
		addr="서초구";
		money=10000;
	}
	public void info() {
		System.out.println("name: "+name+" addr: "+addr+" money: "+money);
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money=money;
		
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
}
/*
 * 리턴값  get변수(){
 *  return 변수
 *  }
 *  
 *  void set멤버변수(멤버변수 타입 변수명){
 *  	 	멤버변수=인자; 	
 *  }
 */
