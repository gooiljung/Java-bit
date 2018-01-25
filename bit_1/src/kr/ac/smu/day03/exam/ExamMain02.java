package kr.ac.smu.day03.exam;
import java.util.Scanner;
/*
 *  정수 3개를 입력받아 큰수에서 작은수순으로 출력하는 코드
 *  정수 3개를 입력:12 8 34
 *  출력: 34 12 8
 */
public class ExamMain02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("정수 3개를 입력:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if (a>b&&a>c) {
			System.out.print(a+" ");
			if(b>c) {
				System.out.print(b+" ");
				System.out.print(c+" ");
			}else {
				System.out.print(c+" ");
				System.out.print(b+" ");
			}		
		}else if(b>a&&b>c) {
			System.out.print(b+" ");
			if (a>c) {
				System.out.print(a+" ");
				System.out.print(c+" ");
			}
			else {
				System.out.print(c+" ");
				System.out.print(a+" ");
			}
		}
		else if(c>a&&c>b) {
			System.out.print(c+" ");
			if(a>b) {
				System.out.print(a+" ");
				System.out.print(b+" ");
			}else {
				System.out.print(b+" ");
				System.out.print(a+" ");
			}
		}
		/*
		 * int max=a>b?a:b;
		 * int max2=c>d?c:d;
		 * int result=max>max2?max:max2;
		 * 
		 */
	}
}
