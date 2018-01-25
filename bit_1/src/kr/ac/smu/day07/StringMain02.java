package kr.ac.smu.day07;

public class StringMain02 {
	public static void main(String[] args) {
		String str = "Hello world";
		int searchIdx=str.indexOf("o");
		System.out.println(str+"의 /o/ 의  시작 위치는  "+searchIdx);
		
		searchIdx=str.indexOf('p');
		System.out.println(str+"의 /p/의 시작 위치는 "+searchIdx); // 찾고자 하는게 없으면 -1
		
		searchIdx=str.lastIndexOf('o');
		System.out.println(str+"의 /o/ 의  마지막  위치는  "+searchIdx);
		
		searchIdx=str.lastIndexOf("world");
		System.out.println(str+"의 /world/ 의  마지  위치는  "+searchIdx);//w 의 위치를 리턴 
		
		char ch='l';
		searchIdx=-1;
		
		while((searchIdx=str.indexOf(ch,searchIdx+1))!=-1) {
			System.out.println("/"+ch+"/위치는: "+searchIdx);
			
		}
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='l')
				System.out.println("/l/위치는:ee "+i);
		}
		
		System.out.println("--------------------------------");
		
		searchIdx=str.length();
		while((searchIdx=str.lastIndexOf('l',searchIdx-1))!=-1) {
			System.out.println("/"+ch+"/거꾸로  위치는: "+searchIdx);
		}
	}
}
