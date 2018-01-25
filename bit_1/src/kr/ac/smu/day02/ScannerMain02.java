package kr.ac.smu.day02;

import java.util.Scanner;
//next~~() 를 쓰는 경우에 nextLine을 제외하고는 공백문자 나 그 각각의 타입으로 치기때문에 만약 10 20 (int 2개 받을경우에 )
//10을 읽고 그다음 nextInt에 입력하지도 않았는데 바로 들어간다 그래서 nextLine을 사용하고 그거를 parse 써서 맞춰주는 방식이 좋다.
// 아니면 그냥 어떠한 문자나 정수를 입력 받고 그다음에 nextLine을 써줘도 괜찮다.
//buffer에 입력을 할때에 char by char 로 들어가고 nextInt 를 만났을때에 그때 buffer에서 공백문자별로 받아서.
public class ScannerMain02 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("문자를 입력: ");
		char c=scan.next().charAt(0);	
		scan.nextLine();// 의미없이 그냥 buffer를 비워 주기 위한 방식 
		
		System.out.print("정수를 입력: ");
		int num=scan.nextInt();
		scan.nextLine();// 의미없이 그냥 buffer를 비워 주기 위한 방식 
		
		System.out.print("정수를 입력: ");
		int num2=scan.nextInt();
		scan.nextLine();// 의미없이 그냥 buffer를 비워 주기 위한 방식 
		
		System.out.println("num: "+num+" char: "+c);
		System.out.println("num2: "+num2);
		
	}
}
