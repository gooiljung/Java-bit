package kr.ac.smu.day03.exam;

public class GugudanMain {
	public static void main(String[] args) {
		int temp;
		
		
		for (int i=2;i<=9;i++) {
			
			for(int j=0;j<=9;j++) {
				
				int count=0;
				temp=i;
				
				while(++count!=4) {
					if(i==10) {
						break;
					}else if(j==0) {
						System.out.print(i+"단 "+"\t");
					}
					else
						System.out.print(i+"*"+j+"="+i*j+"\t");
					
					
					i++;
				}
				
				i=temp;
				System.out.println();
			}
		
			i=i+2;
			
			System.out.println();
		}
	}
}
