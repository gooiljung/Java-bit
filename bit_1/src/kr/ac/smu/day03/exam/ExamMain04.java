package kr.ac.smu.day03.exam;
/*
 *  *****
 *   ****
 *    ***
 *     **
 *      *  
 *      출력하기 
 *   for문 3개
 *  for문2개 if문 1
 *  
 *  엔터부터 찍고 시작하자 
 *  _ 는 0,1,2,3,4개가 필요하다 순서대로
 *  * 은 5,4,3,2,1 개 필요 
 */

//표를 그려서 규칙을 찾는게 최고다.

public class ExamMain04 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<i)
					System.out.print("_");
				else
					System.out.print("*");
					
			}
			System.out.println();
		}
		
		/*for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i-1;j++){
				System.out.print("_");
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}*/
		
	}
}
