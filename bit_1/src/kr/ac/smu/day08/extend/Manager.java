package kr.ac.smu.day08.extend;

public class Manager{
	int no;
	String name;
	int salary;
	String grade;
	Employee[] empList; //관리할 사원 목록
	
	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	public void info() {
		System.out.println("사번: "+no);
		System.out.println("이름: "+name);
		System.out.println("연봉: "+salary);
		System.out.println("직급: "+grade);
		
		System.out.println("----------------------------");
		System.out.println("\t <관리사원 목록>");
		System.out.println("----------------------------");
		
		for(Employee e:empList){
			e.info();
		}
		System.out.println("----------------------------");
	}
	
}
