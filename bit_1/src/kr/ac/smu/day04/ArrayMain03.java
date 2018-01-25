package kr.ac.smu.day04;

import java.util.Arrays;
//System.arraycopy(src,srcpos,dest,destPos,length) 배열 복사하는 자바에서 제공하는 메소드 
public class ArrayMain03 {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		int[] nums2=new int[5];
		
		System.out.println("nums print");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+"\t");
			
		}
		System.out.println();
		System.out.println("nums2 print");
		for(int i:nums2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//복사본 생성 
//		for (int i=0;i<nums.length;i++) {
//			nums2[i]=nums[i];
//		}
		System.arraycopy(nums, 0, nums2, 0, nums.length); //system 이라서 java.lang 패키지에있어 임포트 할필요없
		// 인자 순서대로 데이터 꺼내올놈 ,몇번지 인덱스부터 , 복사한거저장할놈, 저장할놈의 몇번째 인덱스부터,데이터 꺼내올놈의 몇개를 꺼낼
		//nums 의 0 번째 인덱스 부터 nums의 길이만큼 nums2의 index 0번 부터 nums값 저장한다.
	
		System.out.println("복사완료 ");
		System.out.println("nums  : "+Arrays.toString(nums));
		System.out.println("nums2 : "+Arrays.toString(nums2));
	}
}
