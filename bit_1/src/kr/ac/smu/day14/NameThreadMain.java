package kr.ac.smu.day14;
class NameThread extends Thread{
	
	public NameThread(){}
	
	public NameThread(String str){
		super(str);
	}
	@Override
	public void run() {
		System.out.println("수행중인 스레드 이름: "+getName());
		int index=getName().lastIndexOf('-');
		String str=getName().substring(index);
		setName("changeThread"+str);
		System.out.println("변경된 스레드 이름: "+getName());
	
	}
	
}
public class NameThreadMain {
	public static void main(String[] args) {
		NameThread nt = new NameThread();
		NameThread nt2 = new NameThread("namethread-0");
		nt.start();
		nt2.start();
	}
	
}









