package kr.ac.smu.day03;
import java.util.Scanner;
public class SwitchMain02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("좋아하는 계절은?");
		String season=sc.nextLine();
		
		switch(season) {
		case "봄":
			System.out.println(season+"3~5월 ");
			break;
		case "여름":
			System.out.println(season+"6~8월 ");
			break;
		case "가을":
			System.out.println(season+"9~11월 ");
			break;
		case "겨울":
			System.out.println(season+"12~2월 ");
			break;
		}
	
	
	}
}
