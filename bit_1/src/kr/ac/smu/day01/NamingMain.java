package kr.ac.smu.day01;
import java.util.Random;
/*
 * 명명 규칙에 의거하여
 * 클래스,변수,메소드의 개수가 몇개인지 분석 
 * 클래스 4개 NamingMain,String,Random,System   
 * 변수 4개  args,r,num,out
 * 메소드 3개 main,nextInt(),println()
 */
public class NamingMain {
	public static void main(String[] args) {
		Random r=new Random();
		int num=r.nextInt();
		System.out.println("num="+num);
	}
}
