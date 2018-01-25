package kr.ac.smu.day14;
import java.util.Date;
class SleepThread extends Thread{
	
	@Override
	public void run(){
		while(true) {
			System.out.println("현재시간: "+new Date().toLocaleString());
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class SleepMain {
	public static void main(String[] args) {
		//System.out.println(Thread.activeCount());
		SleepThread st=new SleepThread();
		st.start();
		while(true) {
			
			try {
				Thread.sleep(100);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("go");
		}
//		System.out.println("main Thread sleep for 2seconds...");
//		
//		try {
//			
//			Thread.sleep(2000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("main Thread wake up...");
	}
}
