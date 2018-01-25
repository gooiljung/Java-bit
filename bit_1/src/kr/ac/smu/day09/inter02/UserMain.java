package kr.ac.smu.day09.inter02;

public class UserMain {
	public static void main(String[] args) {
		TV tv=new LGTV();
		tv.powerOn();
		tv.channelUp();
		tv.powerOff();
		tv.copyright();
		tv=new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.powerOff();
		tv.copyright();
	
	}
	
}
