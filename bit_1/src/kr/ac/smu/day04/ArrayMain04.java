package kr.ac.smu.day04;

public class ArrayMain04 {
	public static void main(String[] args) {
		//int [][] nums=new int[3][4];
		//int[][] nums=new int[3][];
		int [][] nums= {new int[4],new int[2],new int[1]};//이렇게도 가능 
		for(int i=0;i< nums.length;i++) {
			nums[i]=new int[i+2];
			
		}
		
		
		
		System.out.println("nums: "+nums);
		System.out.println("nums[0]: "+nums[0]);
		System.out.println("nums.length: "+nums.length);
		System.out.println("nums[0].length: "+nums[0].length);
		System.out.println("nums[1].length: "+nums[1].length);
		System.out.println("nums[2].length: "+nums[2].length);
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("1.5 version for");
		for(int i=0;i<nums.length;i++) {
			for(int num:nums[i]) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		System.out.println("1.5 version for");
		for(int[] temp:nums) {
			for(int i=0;i<temp.length;i++) {
				System.out.print(temp[i]+" ");
			}
			System.out.println();
		}
		System.out.println("1.5 version for");
		for(int[]arr:nums) {
			for(int num:arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}











