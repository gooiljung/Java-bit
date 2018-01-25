package kr.ac.smu.day05;
/*
 * *********
 * Hello
 * *********8
 * Hi
 * *********
 * Good-bye
 * *********
 */
public class MethodMain {
	
	static void printStar(String temp,int num) { //메소드의 정의부 
		
		// 지역변수는  함수가 호출될때 메모리가 스택에 잡히고 이 호출이 끝나면 바로 없어진다.
		for(int i=0;i<num;i++) {
			System.out.print(temp);
		}
		System.out.println();
	
	}
	
//	static void add(int a,int b) {
//		System.out.println(a+" + "+b+" = "+(a+b));
//	}
	static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {  //호출자 메소드 
		int sum = add(3,5);
		System.out.println(sum);
		printStar("#",10); //메소드의 호출부 , 피호출자 메소드 
		//System.out.println("**********");
		System.out.println("Hello");
	//	System.out.println("**********");
		printStar("*",15);
		System.out.println("Hi");
	//	System.out.println("**********");
		printStar("&",20);
		System.out.println("Good-bye");
		printStar("!",50);
	//	System.out.println("**********");
	}
}
