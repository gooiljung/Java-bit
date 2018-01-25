package kr.ac.smu.day07;
public class StringMain {
	public static void main(String[] args) {
		String str = new String("hello");
		String str2 = new String ("Hello");

//		String str = "Hello";
//		String str2= "Hello";
		// == 주소를 비교하는거다.
		
		if(str==str2) {
			System.out.println("str==str2");
		}else
			System.out.println("str!=str2");
//		boolean bool = str.equals(str2);
		boolean bool = str.equalsIgnoreCase(str2); // 소/대문자 구분 없이 같은 문자열인지 비교 
		//		   name:String
		//값을 비교  equals(name:String)  : 다음이 return 값 
		
		if(bool) {
			System.out.println("str==str2");
		}else
			System.out.println("str!=str2");
	
		String prefix ="He";
		if(str2.startsWith(prefix)) {
			System.out.println(str2+" 은 /"+prefix+"/ 로 시작합니다. ");
		}
		else
			System.out.println(str2+" 은 /"+prefix+"/ 로 시작하지 않습니다 . ");
		str="Hello.txt";
		if(str.endsWith(".txt")) {
			System.out.println(str+" 은 text 파일 입니다. ");
		}else
			System.out.println(str+" 은 text 파일이 아닙니다. ");
		
		str=new String("banana");
		str2=new String("apple");
		int compare = str.compareTo(str2); // 두 문자가 같으면 0리턴  아니면 다른값 같은 자리의 유니코드의 차가 리턴 
										 // 한 자리 씩 비교한다 0,1,2,번째 하나라도 다른게 있으면 그 자리의 유니코드 차 리
				
		if(compare==0) {
			System.out.println(str+"=="+str2);
		}else if(compare < 0)
			System.out.println(str+"<"+str2);
		else
			System.out.println(str+">"+str2);
		
		String [] names = {"홍길동","이길동","홍길순","홍길동","최철수","박수홍","이길수"};
		System.out.println("이름이 홍길동인 사람을 검색"); 
		for(String name:names) {
			//if(name.equals("홍길동"))
			if(name.compareTo("홍길동")==0)	
				System.out.println(name);
		}
		System.out.println("홍씨성을 가진 사람 검색 ");
		for(int i=0;i<names.length;i++) {			
			if(names[i].startsWith("홍"))	
				System.out.println(names[i]);
		}
		
		System.out.println("이름이 길동인 사람 검색 ");
		for(String name:names) {
		
			if(name.endsWith("길동"))	
				System.out.println(name);
		}
		
		System.out.println("이름이 길동인 사람 검색 ");
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("길동"))
				System.out.println(names[i]);
		}
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("길동"))
				System.out.println(names[i]);
		}
		
		System.out.println("이름에 홍이 있는 사람 검색");
		 
		for(String name:names) {
			
			if(name.contains("홍"))	
				System.out.println(name);
		}		
	}
}










