package kr.ac.smu.day07;

import java.util.Arrays;

public class StringMain03 {
	public static void main(String[] args) {
		String str="Hello world";
		String sub=str.substring(0,5); // 0-4까지의 데이터 추출 
		sub=str.substring(3,7);//3~6까지 데이터 추출 
		sub=str.substring(4); // 4~length-1 데이터 추출 
		System.out.println("sub: "+sub);
		str="Hello";
		str=str+"!!!";		
		String str1="Hello".concat("!!!!");
		
		
		str=str.replace('l', 'r');
		System.out.println(str);
		
		str="          hello world      ";
		
		System.out.println("trim  전 str 길이: "+str.length());
		
		str=str.trim(); // 좌우 공백 제거 문자와 문자 사이의 공백은 지우지 않는다. 
		
		System.out.println("trim  후 str 길이: "+str.length());
		
		str="Hello World";
		System.out.println("대문자로 변경 "+str.toUpperCase());
		System.out.println("소문자로 변경 "+str.toLowerCase());
		
		str="홍길동전:허균:조선시대";
		String [] spStr=str.split(":");
		System.out.println("-----  : 기준으로 분리 한 배열---");
		System.out.println(Arrays.toString(spStr));
		
		int num=123; //123->"123" 으로 
		String strNum=num+"";
		System.out.println("-----숫자 123을 문자열 123 으로 바꾸는 3가지----  ");
		
        String strNum2=Integer.toString(num);  
		String strNum3=String.valueOf(num); //String.valueOf(type)은 모든걸 String으로 바꿔 준다. 모든 타입가능 
		System.out.println(strNum);
		System.out.println(strNum2);
		System.out.println(strNum3);
		
		
		System.out.println("-----문자열 123을 숫자  123 으로 바꾸는 3가지----  ");	
		str="123";
		num=Integer.valueOf(str);  // 참조자료형의 integer 타입으로 바꿔준다 둘은 다 호환가능하다.
		num=Integer.parseInt(str); // 기본자료형으로 바꿔준다 .
	
	
	
	
	
	
	
	
	
	
	
	}
}












