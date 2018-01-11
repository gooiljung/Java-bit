package kr.ac.smu.day01;
//한줄 주석
/*다중 주석 */
/**문서화 주석  */
//문자+문자=>정수 출력   문자열 과 더하면 문자열인데 그냥 문자면 유니코드로 해석됨 
//문자+정수=>정수
//문자+실수=>실수 
//아스키 코드 A =65(A~Z = 65~90) a=97(a~z=97~122) 0=48 ('0'~'9'=48~57)
//자바는 유니코드 기반이다.
public class HelloMain {
	static public void main(String [] args) {
		System.out.println('a'+'b');
		System.out.println("5>4 참 거짓 판단 :"+(5>4));
		System.out.println("5>4 참 거짓 판단: %b"+(5>4));
		System.out.println("static 과 public 의 위치를 바꿔도 잘 돌아간다 "+true);
		System.out.printf("%d+%d=%d\n",3,4,3+4);
		System.out.println(3+"+"+4+"="+(3+4));
		System.out.printf("[%05d]",35);//전체 5자리에서 오른쪽 으로 밀어서 정렬  - 붙이면 앞쪽 부터 정렬 +붙이면 부호표
		 								//0은 공백은 다 0으로 표시하라는뜻  
							//5 로 다섯자리ㅏ고 했는데 1234567을 args 에다가 넣으면 5를 무시하고 그냥 1234567 출
							//칸 맞추고 이쁘게 하는데 좋다 
	}
}
