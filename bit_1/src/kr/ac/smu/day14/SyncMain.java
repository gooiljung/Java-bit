package kr.ac.smu.day14;
class Sync{
	// synchronized 로 동기화를 해준다 .객체를 sync 를사용하기 때문에 하나수행이 다 끝나야 다른게 돌아간다.
	public /*synchronized*/ void a() {
		System.out.print("-"); // 동기화를 시켜주지 않아서 아무때나 실행될수있
		synchronized(this) { // 이 부분만 동기화를 조져준다.
			
			for(int i=1;i<=10;i++) {
				System.out.print("a");
			}
		}
		System.out.print("=");
	}
	public synchronized void b() {
		for(int i=1;i<=10;i++) {
			System.out.print("b");
		}
	}
	public synchronized void c() {
		for(int i=1;i<=10;i++) {
			System.out.print("c");
		}
	}
	
}
class SyncThread extends Thread{
	private Sync sync; //공유자원 
	private int type;
	public SyncThread(Sync sync,int type) {
		this.sync=sync;
		this.type=type;
	}
	@Override
	public void run() {
		switch(type) {
		case 1:
			sync.a();
			break;
		case 2:
			sync.b();
			break;
		case 3:
			sync.c();
			break;
		}
	}
	
}
public class SyncMain {
	public static void main(String[] args) {
		Sync sync=new Sync();
		
		SyncThread st=new SyncThread(sync,1);
		SyncThread st2=new SyncThread(sync,2);
		SyncThread st3=new SyncThread(sync,3);
		
		st.start();
		st2.start();
		st3.start();
			
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
