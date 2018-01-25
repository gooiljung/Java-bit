package kr.ac.smu.day09;
//instanceof 는 상속관계에서만 쓸 수 있다.
public class CastMain01 {
	//매개변수를 parent 로 해서 묵시적형변환을 이끌어냄 
	
	static void print(Parent p) {
		p.info();
		if(p instanceof Child01) {
			Child01 c01=(Child01)p; //명시적 형변화 
			c01.study();
			c01.sleep();
			((Child01) p).study();
		}else if(p instanceof Child02) {
			((Child02) p).play();
		}else if(p instanceof Child03) {
			
		}else if(p instanceof Child01) {
			
		}
//		System.out.println(p instanceof Child01); //p가 Child01 의 instance 이면 true return
//		System.out.println(p instanceof Child02);
//		System.out.println(p instanceof Child03);
//		System.out.println(p instanceof Parent);
	}
	public static void main(String[] args) {
		Child01 c01=new Child01();
		c01.info();
		c01.study();
		c01.sleep();
		Child02 c02=new Child02();
		c02.info();
		c02.play();
		c02.sing();
		System.out.println("--------------------");
		//객체형변환(묵시적)
		
		Parent p=new Child01(); // Child01에 있는 함수 및 변수는 사용할 수 없지만 오버라이드한 함수는 사용가능 
		p.info();
		System.out.println("name: "+p.name);
		p=new Child02();
		p.info();
		System.out.println("---------------------");
		print(new Child01());
		print(new Child02());
		print(new Child03());
	//	print(new Parent());
		
		System.out.println("---------------");
		Parent obj=Parent.getInstance();
		obj.info();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
