package kr.ac.smu.day14;
/*
 * 1. Thread 상속받기 
 * 
 */

class AAA extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("go!!!");
		}
	}
	
	
}
class BBB extends Thread{
	
	@Override
	public void run() {
		while(true) {
			
			System.out.println("\tstop!!!");
		}
	}
	
}
public class ThreadMain{
	public static void main(String[] args) {
		
		
		AAA ta=new AAA();
		BBB tb=new BBB();
//		ta.run();   이렇게 하면 스레드를 부르는것이 아니라 그냥 메소드 호출이라 start 를 꼭해야 스레드로 들어간다.
//		tb.run();
		
		
		ta.start();
		tb.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
