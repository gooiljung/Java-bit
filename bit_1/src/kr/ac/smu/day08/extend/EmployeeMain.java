package kr.ac.smu.day08.extend;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e=new Employee(1,"홍길동",3_500,"사원");
		Employee e2=new Employee(2,"강길동",3_600,"사원");
		Employee e3=new Employee(3,"최길동",4_000,"대리");
		Employee e4=new Employee(4,"박길동",4_200,"대리");
		Employee e5=new Employee(5,"유길동",5_000,"과장");
		
//		e.info();
//		e2.info();
//		e3.info();
//		e4.info();
//		e5.info();
		Employee[] empList = {e,e2,e4};
		
		Manager m=new Manager(100,"나캡틴",8_000,"부장",empList); 
		Manager02 m02=new Manager02(100,"나캡틴",8_000,"부장",empList);
		Manager03 m03=new Manager03(100,"나캡틴",8_000,"부장",empList);
		
		//m.info();
	//	m02.info();
		m03.info();
		
	}
}
