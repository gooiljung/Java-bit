package kr.ac.smu.day02;
import java.util.Random;
//java.lang 패키지에 있는것들은 자동 임포트 된다.

public class RandomMain {
	public static void main(String [] args) {
		
		Random r=new Random();
		int random=r.nextInt(10); //10이라고 써주면 임의의 양수의 값을 10으로 나눈값으로 나와서 0~9가 나온다.	
		System.out.println(random);
		int num=(int)((Math.random()*10));//0~0.999 수를 랜덤하게 *10 하면  0~9
		System.out.println(num);
		
	}
}
