package kr.ac.smu.day08.extend;
//source  메뉴에 가면 자동으로 생성자 및 오버라이드함수를 만들어 주고 그안을 채워넣기 
public class Manager04 extends Employee{
	
	private Employee[] empList;

	public Manager04(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}
	
	

}
