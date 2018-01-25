package kr.ac.smu.day05;


//실행 클래스 
public class HandphoneMain {
	public static void main(String[] args) {
		HandPhone hp=new HandPhone();
		hp.name=new String("홍길동"); // String 클래스의 경우만 new 를 쓰지않고 곧장 대입할 수 있다. 
		hp.phone="010-1111-2222";
		hp.company="samsung";
		
		HandPhone hp2=new HandPhone();
		hp2.name=new String("고길순"); // String 클래스의 경우만 new 를 쓰지않고 곧장 대입할 수 있다. 
		hp2.phone="010-3333-4444";
		hp2.company="Apple";
		
		HandPhone hp3=new HandPhone();
		hp3.name=new String("최길동"); // String 클래스의 경우만 new 를 쓰지않고 곧장 대입할 수 있다. 
		hp3.phone="010-5555-6666";
		hp3.company="LG";
		
		System.out.println("소유주 : "+hp.name+" 폰번호: "+hp.phone+" 제조사: "+hp.company);
		System.out.println("소유주 : "+hp2.name+" 폰번호: "+hp2.phone+" 제조사: "+hp2.company);
		System.out.println("소유주 : "+hp3.name+" 폰번호: "+hp3.phone+" 제조사: "+hp3.company);
		System.out.println("-------------------------------------------------------------");
		
		
		HandPhone[] hpArr= {hp,hp2,hp3};
		for(int i=0;i<hpArr.length;i++) {
			System.out.println("소유주 : "+hpArr[i].name+" 폰번호 : "+hpArr[i].phone+" 제조사: "+hpArr[i].company);
			
			
		}
		HandPhone[] hpArr2=new HandPhone[3];
		for(int i=0;i<hpArr2.length;i++) {
			hpArr2[i]=new HandPhone();
			
		}
		
		//hpArr2[0]=new HandPhone();
		hpArr2[0].name="홍길동";
		hpArr2[0].phone="010-1111-2222";
		hpArr2[0].company="Samsung";
		
	//	hpArr2[1]=new HandPhone();
		hpArr2[1].name="고길순";
		hpArr2[1].phone="010-2222-3333";
		hpArr2[1].company="Apple";
		
	//	hpArr2[2]=new HandPhone();
		hpArr2[2].name="최길동";
		hpArr2[2].phone="010-4444-5555";
		hpArr2[2].company="LG";
		
		
		System.out.println("-------------------------------------------------------------");
		
		
		for(int i=0;i<hpArr2.length;i++) {
			System.out.println("소유주 : "+hpArr2[i].name+" 폰번호 : "+hpArr2[i].phone+" 제조사: "+hpArr2[i].company);
			
			
		}
		
		
	}
}
