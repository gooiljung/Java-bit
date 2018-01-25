package kr.ac.smu.day04.exam;

import java.util.Arrays;

/*
 * 10개의 난수 출력 1~10 사이의 난수 
 * 5 2 6 1 2 3 5 9 3 4
 * 
 *짝수만 나오게 난수로 
 *총 개수 , 합 
 *
 *홀수만 나오게 난수로
 *총 개수 , 합 출 
 */
public class ExamMain02 {
	public static void main(String[] args) {
		int [] nums=new int [10];
		//Random r=new Random(); r.nextInt(10)+1
		
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*10+1);
		}
		
		
		System.out.println("10개의 난수 출력 ");
		System.out.println(Arrays.toString(nums));
		
		int sum=0;
		int count=0;
		
		System.out.println("짝수  출력 ");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.print(nums[i]+" ");
				count++;
				sum+=nums[i];
			}
		}
		System.out.println();
		System.out.println("총 개수: "+count+" 짝수들의 합은: "+sum);
		
		sum=0; count=0;
		System.out.println("홀수  출력 ");
		
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				System.out.print(nums[i]+" ");
				count++;
				sum+=nums[i];
				
			}
		}
		System.out.println();
		System.out.println("총 개수: "+count+" 홀수들의 합은: "+sum);
	}
}
