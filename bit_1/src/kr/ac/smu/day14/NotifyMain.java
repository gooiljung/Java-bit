package kr.ac.smu.day14;

class Data{
	public  synchronized void a() {
		System.out.println("a 메소드 호출..");
		try {
			notify();
			wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void b() {
		System.out.println("b 메소드 호출..");
		try {
			notify();
			wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class NotifyThread01 extends Thread{
	private Data data;
	NotifyThread01(Data data){
		this.data=data;
	}
	public void run() {
		for(int i=1; i<=10;i++) {
			data.a();
		}
	}
}
class NotifyThread02 extends Thread{
	private Data data;
	NotifyThread02(Data data){
		this.data=data;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			data.b();
		}
	}
}

public class NotifyMain {
	public static void main(String[] args) {
		
		Data data = new Data();
		NotifyThread01 nt01=new NotifyThread01(data);
		NotifyThread02 nt02=new NotifyThread02(data);
		nt01.start();
		nt02.start();
	}
	
}
