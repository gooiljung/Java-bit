package kr.ac.smu.day08.extend;

public class Manager03 extends Employee {
	Employee[] empList;
	
	public Manager03(int no,String name,int salary,String grade,Employee[] empList) {
//		super.no=no; // super 아니면 this 도 괜찮은게 이 클래스가 만들어질때 employee도 불리기 때문
//		super.name=name;
//		super.salary=salary;
//		super.grade=grade;
		super(no,name,salary,grade); //이렇게 써야하는 가장 큰 이유는 
		this.empList=empList;
		
	
	}
	@Override //일종의 주석으로 써 약속된 키워드를 쓴다.  어노텐션 이라고 불린다. 
	public void info() { // 오버라이딩 메소드 
//		System.out.println("사번: "+no);  이거는 employee.info() 이니깐 바꿔줄 수 잇음 
//		System.out.println("이름: "+name);
//		System.out.println("연봉: "+salary);
//		System.out.println("직급: "+grade);
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
