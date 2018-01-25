package kr.ac.smu.day03.exam;
/*
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 *for문 3개 if문 하나
 *for문 2개 if 문 하
 *규칙이 5행까지와 그 다음부터가 달라서 if 문에 5행까지 나눠서 생각하기 
 */

public class ExamMain05 {
	public static void main(String[] args) {
		int star=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");			
			}
			System.out.println();
			if(i<5) {
				star++;
			}else {
				star--;
			}
		}
		
		
//		for (int i=1;i<=9;i++) {
//			if(i<=5) {
//				for(int j=0;j<i;j++) {
//					System.out.print("*");
//				}
//			}else {
//				for(int j=1;j<=10-i;j++) {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//		}
			
	}
}
/*  이거랑 다이아몬드 하는거 한번 해보기!
 *   *_______*
 *   **_____**
 *   ***___***
 *   ****_****
 *   *********
 *   ****_****
 *   ***___***
 *   **_____**
 *   *_______*
 *   
 *   
 *   
 */


