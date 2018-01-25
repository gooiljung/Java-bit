package kr.ac.smu.day14;
/*
 * 스레드 객체를 생성하는 2 가지 방법
 * 1.Thread 클래스 상속
 * 2. Runnable  인터페이스 상속 
 */
class ExtendThread extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(i+"번째 인형 눈 붙임..."); 
		}
	
	}
	
}
class ImplementsThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i+"번째 인형 코 만듬...");
		}
	}
	
}
public class ThreadMain02{
	public static void main(String[] args) {
		
		ExtendThread et= new ExtendThread();
		ImplementsThread it=new ImplementsThread();
		Thread t=new Thread(it); //start 메소드는 Thread 클래스에만 있어서 상속받아서 하면 Thread객체에 넣어야 한다.
		System.out.println("감독 시작 ");
		et.start();
		t.start();
		try {
			et.join();
			t.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("감독 종료 ");
//		for(int i=1;i<=100;i++) {
//			System.out.println(i+"번째 감독중 ");
//		} //이렇게하면 메인스레드 까지 세개의 스레드가 서로 경쟁중이다 .
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
