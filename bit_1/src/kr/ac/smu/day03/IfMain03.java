package kr.ac.smu.day03;
import java.util.Scanner;

public class IfMain03 {
	public static void main(String [] args) {
		System.out.println("기상한다.");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("출발시간 입력: ");
		double time=sc.nextDouble();
		sc.nextLine();
		
		if(time <8.00) {
			System.out.println("걸어서 ");
		}else if(time<8.15) {
			System.out.println("버스타고 ");
		}else {
			System.out.println("택시타고 ");
		}
		System.out.println("학교간다.");
	
	
	}
}
