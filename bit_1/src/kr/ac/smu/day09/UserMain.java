package kr.ac.smu.day09;

public class UserMain {
	public static void main(String[] args) {
		
		LGTV lgTV=new LGTV();
		lgTV.powerOn();
		lgTV.soundUp();
		lgTV.channelDown();
		lgTV.powerOff();
		
		SamsungTV samTV=new SamsungTV();
		samTV.turnOn();
		samTV.channelDown();
		samTV.volumeDown();
		samTV.turnOff();
		
	}
}	
