package kr.ac.smu.day02;
import java.util.Scanner;
/*
 * Scanner 입력 메소드 
 * 정수 ,실수 
 *  -int -> nextInt()
 *  -long -> nextLong()
 *  	-float-> nextFloat()
 *  -short-> nextShort()
 *  -byte-> nextByte()
 *  논리값
 *   -boolean 입력 : nextBoolean() true or false 만 입력
 *  문자열
 *   next() : 단어 단위로만 입력 (문자열 입력종료를 공백문자로 인식한다.)
 *   nextLine(): 한줄로 입력 (문자열 입력종료를 엔터로 인식.)
 *  문자 
 *   next().charAt(0)
 */

public class ScannerMain {
	public static void main(String[] args) {
	   
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력 :");
		int num=scan.nextInt();
		System.out.println("num: "+num);
		System.out.print("실수를 입력: ");
		double num2=scan.nextDouble();
		System.out.println("num2: "+num2);
		
		System.out.print("문자열을 입력: ");
		String str=scan.next();
		System.out.println("str: "+str);
		
		System.out.print("문자 입력: ");	
		char ch=scan.next().charAt(0);
		System.out.println("ch :"+ch);
	}
}
