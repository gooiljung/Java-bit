package kr.ac.smu.day04;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String [] args) {
		
		//String[] strArr= {"상명대 ","자바 ","교육 "};
		String[] strArr1=new String[5];
		int loc=0; //index를 숫자로 그냥 넣을경우 입력 삭제시 문제가 발생할 수 있어서 변수화 시키는게 좋은 코드다.
//		strArr1[loc++]="상명대";
//		strArr1[loc++]="자바";
//		strArr1[loc++]="교육";
		strArr1[0]=new String("상명대 ");
		strArr1[1]=new String("자바 ");
		strArr1[2]=new String("교육 ");
		
		System.out.println("방법1 -index ");
		for (int i=0;i<strArr1.length;i++) {
			System.out.println(strArr1[i]);
		}
		System.out.println("방법2 for문 1.5");
		for(String str:strArr1) {
			System.out.println(str);
		}
		System.out.println("방법3 toString");
		System.out.println(Arrays.toString(strArr1));
		
		Hotdog hg=new Hotdog();
		System.out.println(hg);
		
		Hotdog [] hotArr=new Hotdog[2];
		for(int i=0;i<hotArr.length;i++) {
			hotArr[i]=new Hotdog();
		}
		System.out.println(Arrays.toString(hotArr));
	}
} 
class Hotdog{
	
}

















