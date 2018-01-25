package kr.ac.smu.day08.extend;

public class Manager02 extends Employee {
	Employee[] empList;
	
	public Manager02(int no,String name,int salary,String grade,Employee[] empList) {
//		super.no=no; // super 아니면 this 도 괜찮은게 이 클래스가 만들어질때 employee도 불리기 때문
//		super.name=name;
//		super.salary=salary;
//		super.grade=grade;
		super(no,name,salary,grade);
		this.empList=empList;
		
	
	}
	public void info() {
//		System.out.println("사번: "+no); private 으로 바꿔서 더이상 부모클래스의 멤버변수를 접근 할 수 없
//		System.out.println("이름: "+name);
//		System.out.println("연봉: "+salary);
//		System.out.println("직급: "+grade);
//		
		super.info();
		System.out.println("----------------------------");
		System.out.println("\t <관리사원 목록>");
		System.out.println("----------------------------");
		
		for(Employee e:empList){
			e.info();
		}
		System.out.println("----------------------------");
	
	
	}
}
