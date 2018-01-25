package kr.ac.smu.day03;

import java.util.Scanner;

public class SwitchMain01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1~3사이의 정수입력: ");
		int num=sc.nextInt();
		sc.nextLine();
		//switch문에 break 를 안쓰면 필요한거 찾은후 밑에 꺼 까지 싹다 수행한다.
		
		switch(num) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}
}
