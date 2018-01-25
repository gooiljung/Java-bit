package kr.ac.smu.day02;
import java.util.Scanner;
/*
 * 기상한다.
 * 		밥먹고 학교.
 * 		그냥 학교간다.
 * 기상시간이 7시 이전이면 밥을 먹고 학교 가고
 * 		   7시 이후라면 그냥 간다.
 */
public class IfMain01 {
	public static void main(String [] args) {
		System.out.println("기상한다.");
		System.out.println("기상시간을 입력하세요(ex 6시45분->645).");
		Scanner scan=new Scanner(System.in);
		int time=scan.nextInt();
		scan.nextLine();
		
		if(time<700){
			System.out.println("밥먹고,");	
		}
			
		System.out.println("학교간다.");
		
	}
}
