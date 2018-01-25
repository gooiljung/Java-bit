package kr.ac.smu.day02;
import java.util.Scanner;
/*
 * 집에서 출발한 시간이 8시 이전 ->걸어서 
 *  				  8시 이후-> 버스타고 
 *  학교간다.
 */
public class IfMain02 {
	public static void main(String[] args) {
		System.out.println("기상한다.");
		Scanner scan=new Scanner(System.in);
		System.out.println("출발시간을 입력하세요.7시 5분 ->7.05");
		float time=scan.nextFloat();
		scan.nextLine();
		if(time<8.00) {
			System.out.print("걸어서,");
		}else{
			System.out.print("버스타고,");
		}
		System.out.println("학교간다.");
	}
}
