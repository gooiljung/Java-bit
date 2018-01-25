package kr.ac.smu.day03;

public class BreakMain {
	public static void main(String [] args) {
		first:for(int i=1;i<=5;i++) {
			second:for(int j=1;j<=5;j++) {
				System.out.print(i);
				if(i==1) {
					//break; 이렇게 하면 j 파트를 빠져 나오는건데
					break first;
					//continue first; 하면 first 부분으로 바로 넘어간다
				}
			}
		}
		System.out.println();
	
	
	}
}
