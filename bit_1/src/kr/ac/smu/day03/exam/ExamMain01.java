package kr.ac.smu.day03.exam;
import java.util.Scanner;
/*
 *정수 4 개를 입력받아 가장 큰 수를 출력하는 코드 작성
 *정수 4개를 입력: 23 8 16 9
 *가장 큰수: 23
 */
public class ExamMain01 {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 4개를 입력: ");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		sc.nextLine();
		if(a>b&&a>c&&a>d)
			System.out.print(a);
		else if(b>a&&b>c&&b>d)
			System.out.print(b);
		else if(c>a&&c>b&&c>d)
			System.out.print(c);
		else
			System.out.print(d);
		/*
		 * int max=a;
		 * if (max<b)
		 * 	max=b;
		 * if(max<c)
		 *  max=c;
		 * if(max<d)
		 *  max=d ;
		 *
		 */
	}
}
