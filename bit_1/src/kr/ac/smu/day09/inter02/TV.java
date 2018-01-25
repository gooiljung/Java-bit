package kr.ac.smu.day09.inter02;
//tv의 기본적인 기능들을 넣는다. 
public interface TV {
	
	/*public static final*/int MAX_VOLUME=50;
	/*public static final*/int MIN_VOLUME=0;
	
	
	/*public abstract*/void powerOn();
	/*public abstract*/void powerOff();
	/*public abstract*/void channelUp();
	/*public abstract*/void channelDown();
	/*public abstract*/void volumeUp();
	/*public abstract*/void volumeDown();
	/*public abstract*/void mute();
	default public void copyright() { // jdk1.8 이후 부터 default를 쓰면 인터페이스에도 구현한 메소드 사용가능 
		System.out.println("모든 저작권은 나최고에게 있습니다. ");
	}//유지보수 중에 써야하는 상황이 생겨서 쓰는거지 처음 설계부터 하면 안된다.

}

