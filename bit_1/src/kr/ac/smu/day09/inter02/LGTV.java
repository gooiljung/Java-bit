package kr.ac.smu.day09.inter02;

public class LGTV implements TV{
	
	private boolean power;
	private int channelNo;
	private int volume;
	private boolean mute;
	public LGTV() {
		System.out.println("LGTV 를 구매했습니다. ");
		channelNo=3;
		volume=10;
	}
	@Override
	public void powerOn() {
		power = true;
	}

	@Override
	public void powerOff() {
		power = false;
	}

	@Override
	public void channelUp() {
		
	}

	@Override
	public void channelDown() {
		
	}

	@Override
	public void volumeUp() {
		
	}

	@Override
	public void volumeDown() {
		
	}

	@Override
	public void mute() {
		if(!mute) {
			mute =!mute;
			volume=TV.MIN_VOLUME;
		}else {
			volume++;
		}
	}

}
