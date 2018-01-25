package kr.ac.smu.day07;
//source메뉴바에 getter setter 함수는 만들필요없이 이클립스에서 만들어준다. 생성자두있
public class Member {
	private String name;
	private String phone;
	private String addr;
	private char gender;

	public Member(String name, String phone, String addr, char gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.gender = gender;
	}
	
	public Member() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
