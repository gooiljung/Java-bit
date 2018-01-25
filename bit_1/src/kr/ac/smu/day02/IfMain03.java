package kr.ac.smu.day02;
import java.util.Scanner;
/*
 * 기상하고 학교를 가는데 출발시간이 8시 이전이면 걸어서 
 * 							8~815면 버스	
 * 							이후는 택시타고 
 */
class IfMain03 {
	public static void main(String[] args) {
		System.out.println("기상한다.");
		Scanner scan=new Scanner(System.in);
		System.out.println("기상시간을 입력하세요.");
		int time=scan.nextInt();
		if(time<800)
			System.out.println("걸어서,");
		else {
			if(time<=815)
				System.out.println("버스타고,");
			else	
				System.out.println("택시타고,");
		}
		System.out.println("학교간다.");
	}
}
