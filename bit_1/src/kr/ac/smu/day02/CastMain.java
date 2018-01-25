package kr.ac.smu.day02;
/*
 * 형변환
 * 연산자를 기준으로 좌우의 데이터형이 다른 경우에 발생
 * 3+12.34 왼쪽과 오른쪽의 타입이 달라서 이런 경우에 형변환
 *     
 * byte<short,char(char 에도 숫자가 들어갈 수 있어서)<int<long<float<double
 * -기본 자료형의 형 변환  
 *  -묵시적 형 변환 ->up casting (자료형의 크기가 작은 변수값을 크기가 큰 자료형으로 대입되는 경우 발생)
 *  -강제(명시적) 형 변환 ->down casting (자료형의 크기가 큰 변수값을 크기가 큰 자료형으로 대입되는 경우 발생)  
 */
public class CastMain {
	public static void main(String [] args) {
		double d=12.34;
		d=/*(double)*/12; // double=int  형 변환 발생 묵시적 형 변환 casting 따로 안해 줘도 된다.
		d=/*(double)*/12+34.5; // int + double 이 순간 double 쪽으로 형 변환이 일어난다.  
		
		int num=12; // 정수가 나오면 기본적으로 int 로 인식하여서 형변환 일어나지 않는다.
		num=(int)12.34; //형변환 발생 ->명시적 형변환
		
		int a=12,b=5;
		int avg=(a+b)/2;// 에러 발생하지 않는다 a,b가 둘다 int형이여서 int로 받아서 단 소숫점은 생략됨
						//(int+int )/int-> int 형
		double avg2=((double)a+b)/2; //->이런식이면 형 변환이 3번 일어난다. 
		double avg3=(double)(a+b)/2; //->이런식이면 형 변환이 2번 일어난다. 
		System.out.println(a+","+b+" 평균"+avg);
		
		
		
		
		
	}
}
