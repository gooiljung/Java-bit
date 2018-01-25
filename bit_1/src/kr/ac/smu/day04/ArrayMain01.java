package kr.ac.smu.day04;

import java.util.Arrays; // Arrays.toString쓰기위해 

/*
 *  배열을 출력하는 3가지 방법
 *  1.index 를 이용
 *  2. 1.5 버전 for 문 을 이용  무조건 배열의 모든 원소를 접근한다는 개념이다. 
 *  3 Arrays.toString() 메소드 이용 
 */
public class ArrayMain01 {
	public static void main(String[] args) {
		
		//int 값을 저장하는  iArr 배열 선언 
		int [] iArr;	
		//정수를 5개 저장하는 배열 생성 
		iArr=new int [5];
		System.out.println(iArr); // heap 영역의 주소를 가리킨다.
		System.out.println(iArr[0]); // heap에서는 배열을 생성했을때 초기화가 되어있지 않으면 0으로 초기화 되어있다.
									//default 값을 가지고 있다.
		System.out.println(iArr.length);
		//iArr 의 변수에 순서대로 10,20,30,40,50대입
		iArr[0]=10;
		iArr[1]=20;
		iArr[2]=30;
		iArr[3]=40;
		iArr[4]=50;
		System.out.print(iArr[0]+"\t");
		System.out.print(iArr[1]+"\t");
		System.out.print(iArr[2]+"\t");
		System.out.print(iArr[3]+"\t");
		System.out.print(iArr[4]+"\t");
	
		System.out.println();
		System.out.print("index를 이용한 출력 ");
		for (int i=0;i<iArr.length;i++) {
			System.out.print(iArr[i]+" ");
		}
		
		System.out.println();
		System.out.println("1.5버전의 for 문을 이용 출력 "); //출력과 검색 용도로만 쓴다.
		for(int temp:iArr) {//int temp=iArr[0] [1][2]... 이렇게 가진다 iArr의 length 만큼 
			System.out.print(temp+"\t");
		}
		System.out.println();
		System.out.println("Arrays.toString() 메소드를 이용한 출력 ");//Arrays.toString(배열이름 ) return 값은 String
		System.out.println(Arrays.toString(iArr));//이 메소드는 []안에 배열의 원소를 넣어서 string 으로 변환하여 string타입으로 리턴 
		String str=Arrays.toString(iArr);
		System.out.println(str);
	}
}
















