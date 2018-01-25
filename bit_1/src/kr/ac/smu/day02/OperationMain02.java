package kr.ac.smu.day02;

public class OperationMain02 {
	public static void main(String [] args) {
		int a=10,b=3;
		int max=a>b?a:b;
		System.out.println(max);
		System.out.printf("%d 와 %d 중 큰수는 %d \n",a,b,max);
		System.out.printf("%d 와 %d 중 큰수는 %d\n",a,b,a>b?a:b);	
	}
}
