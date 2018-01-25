package kr.ac.smu.day07;

public class StringMain04 {
	public static void main(String[] args) {
		
		String str=new String();
		long start=System.currentTimeMillis();
		for(int i=1;i<100000;i++) {
			str=str+i;
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("소요시간: "+((end-start)/1000.)+"초");
	
		System.out.println("----------------");
		
		StringBuffer sb=new StringBuffer(); // 스트링 버퍼는 무조건 생성자로 만들어야 한다.
		//sb=sb+"1"; //error  buffer는 + 지원되지 않는다. 
		
		long start2=System.currentTimeMillis();
		for(int i=1;i<100000;i++) {
			sb.append(i);
		}
		
		long end2=System.currentTimeMillis();
		System.out.println("소요시간: "+((end2-start2)/1000.)+"초");
		
	
	}
}
