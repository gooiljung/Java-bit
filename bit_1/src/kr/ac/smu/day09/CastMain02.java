package kr.ac.smu.day09;

public class CastMain02 {
	public static void main(String[] args) {
//		Child01 c01=new Parent(); // 컴파일시 오류 
		
//		Child01 c01 =(Child01) new Parent();  // 실행시 오류 
		Parent p = new Child01(); //묵시적 형변환 먼저 
		Child01 c01=(Child01) p; // 명시적 형변환 
		
		c01.info();
		c01.study();
		c01.sleep();
		

	}
}
/*
 * 		public class ArrayList{
 * 			public void add(Object obj){
 * 					
 * 
 * 
 * 			}
 * 			public Object get(int index){
 *				 			
 * 			}
 * 		}		
 */