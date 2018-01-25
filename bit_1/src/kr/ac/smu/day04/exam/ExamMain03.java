package kr.ac.smu.day04.exam;
import java.util.Arrays;
import java.util.Scanner;
public class ExamMain03 {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] nums =new int[5];
		for (int i=0;i<nums.length;) { //증감자 지워줘도 된다. 대신 i에관한것을 안에다가 명시하기.
			System.out.println((i+1)+"번째 정수입력 ");
			nums[i]=sc.nextInt();
			sc.nextLine();
			
			if(i!=0&&nums[i]<=nums[i-1]) {
				System.out.print("\t정수입력은 ");
				for(int j=0;j<i;j++) {
					System.out.print(nums[j]+"\t");
				}
				System.out.println("보다 커야 합니다. ");
			}else
				i++;
			
		}
		System.out.println("<print>");
		System.out.println(Arrays.toString(nums));
	}
}
