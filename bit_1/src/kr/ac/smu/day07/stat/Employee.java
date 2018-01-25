package kr.ac.smu.day07.stat;

public class Employee {
	private String name; //사원명 
	static int employeeCount=0;//총 사원수 
	public Employee(String name){
		this.name=name;
		employeeCount++;
		System.out.println(name+" 사원이 입사했습니다. ");
		//System.out.println("지금까지 입사한 총 사원수: "+employeeCount+" 명 ");
	}
	public void info() {
		System.out.println("사원이름: "+name);
		empCountInfo();
	}
	public static void empCountInfo() {
		System.out.println("입사한 총 사원수: "+employeeCount);
	}
}
