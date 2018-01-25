package kr.ac.smu.day14;

import java.io.Serializable;

/*
 * alt + shift + s 누른후c,o,r,s 각각 
 * 객체 직렬화 Serializable 상속 
 */

public class UserInfo implements Serializable {
	
	private String name;
	private transient int age; //객체 직렬화에서 제외 
	private String addr;
	
	public UserInfo() {
	}

	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}












