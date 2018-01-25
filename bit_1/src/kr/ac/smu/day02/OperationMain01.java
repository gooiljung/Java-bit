package kr.ac.smu.day02;

public class OperationMain01 {
	public static void main(String[] args) {
		int num=12,num2=5;
		System.out.println("약수여부 판단: "+(num2!=0&&num%num2==0));//만약 num2 가 0 이면 에러가 나서
		int a=1;
		int b=0;
		int c=-1;
		System.out.println(++a>0&&--b<0&&++c>0);
		System.out.println(a+" "+b+" "+c);
		
		a=1;
		b=0;
		c=-1;
		
		System.out.println(++a>0&&++c>0&&--b<0); //교환법칙이 성립 안한다 ++c>0에서 이미 false이기 때문에 뒤에
												// --b<0 을 보지 않고 처리 하지않아서 b의 값은 바뀌지 않는다.
		System.out.println(a+" "+b+" "+c); 
		a=1;
		b=0;
		c=-1;
		System.out.println(--a>=0||++b>=0&&++c>=0);
		/*
		 * 이 경우&& 연산자가 우선 순위가 높지만은 컴퓨터는 왼쪽에서부터 읽어서 컴퓨터는 
		 * --a>=0||A 라는 하나의 집합으로봐서 앞에께 참이라 뒤에꺼를 실행하지 않는다. 
		 */
		
		
	}
}
