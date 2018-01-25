package kr.ac.smu.day14;
//우선순위 개념이 확률적인것이지 무조건 그것부터 실행이된다는 아니다.
class PriorityThread extends Thread{
	
	public PriorityThread() {
		super();
	
	}
	public PriorityThread(String name) {
		super(name);
	}
	
	@Override	
	public void run() {
		for(int i=0;i<=100;i++) {
			
			System.out.println(getName()+" "+i+"번째 호출...");
		}
		
	}
	
}
public class PriorityMain {
	public static void main(String[] args) {
		
		PriorityThread pt=new PriorityThread("우선순위가 1인 스레드");
		PriorityThread pt2=new PriorityThread("우선순위가 5인 스레드");
		PriorityThread pt3=new PriorityThread("우선순위가 10인 스레드");
		pt.setPriority(Thread.MIN_PRIORITY);
		//pt2.setPriority(Thread.NORM_PRIORITY); 디폴트는 그냥 5로된다 
		pt3.setPriority(Thread.MAX_PRIORITY);
		pt.start();
		pt2.start();
		pt3.start();
	
	}
}
