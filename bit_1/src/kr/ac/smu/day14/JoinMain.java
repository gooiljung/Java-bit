package kr.ac.smu.day14;
class BoyThread extends Thread{
	@Override
	public void run() {
		System.out.println("남자친구:나는 남자친구 스레드 입니다.");
		System.out.println("남자친구:오늘 여자친구와 영화를 보기로 했습니다..");
		System.out.println("남자친구:예매한 영화시간이 얼마 남지 않았습니다..");
//		System.out.println("남자친구: 여친이 올때까지 기다려 보겠습니다.");
		System.out.println("남자친구: 나의 인내심은 5초입니다.");
		
		GirlThread gt=new GirlThread();
		gt.start();
		try {
			gt.join(5000); // 5초 후에도 이 스레드가 끝나지 않으면 블락에서 빠져나와 runable 상태로 돌아간다.
		}catch(Exception e) {
			e.printStackTrace();
		}
//		System.out.println("남자친구: 여친이 드디어 왔습니다.");
//		System.out.println("남자친구: 여자친구랑 영화보러 갑니다.");
		System.out.println("집간다.");
	
	}
}
class GirlThread extends Thread{
	@Override
	public void run(){
		System.out.println("여자친구: 나는 여자친구 스레드 입니다.");
		System.out.println("여자친구: 오늘 남자친구의 애정도를 테스트하겠습니다.");
		System.out.println("여자친구: 10초 못기다리면 남친이 아니겠죠?");
		for(int i=0;i<=10;i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i+"초가 지났습니다. 남친이 기다리고 있을까요?");
			}catch(Exception e) {
				e.printStackTrace();
			
		}
		//System.out.println("여자친구: 남자친구가 계속 기다려줬습니다. ");
		System.out.println("여자친구: 남자친구가 없어요 헤어질래요");
		}
	}
}
public class JoinMain {
	public static void main(String[] args) {
		BoyThread bt=new BoyThread();
		bt.start();
	}
}
