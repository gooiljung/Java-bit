package kr.ac.smu.day08.extend;

public class Employee {
	private int no;  //사번 
	private String name; // 사원명
	private int salary; //연봉 
	private String grade; // 직급 
	public Employee() {} //아무일도 안하더라도 상속관계에서 에러가 날 수 있기에 기본생성자는 매게변수를 통한 생성자만 만들때에도 만들어 준다.
	public Employee(int no, String name, int salary, String grade) {
		
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	
	public void info() {
		System.out.println("사번: "+no);	
		System.out.println("이름: "+name);	
		System.out.println("연봉: "+salary);	
		System.out.println("직급: "+grade);	
		System.out.println();
	
	}
	
	
	
	
}
