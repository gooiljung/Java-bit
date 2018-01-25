package kr.ac.smu.day08.abs01;
import java.util.Scanner;
public class Menu {
	private int choiceMenu() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("출력할 프린터를 선택하세요.(1.LG 2.SAMSUNG) : ");
		int type=sc.nextInt();
		sc.nextLine();
		return type;
	
	}
	
	public void process() {
		int type=choiceMenu();
		switch(type) {
		case 1:
			LGPrinter lg=new LGPrinter();
			//lg.LgPrint();
			lg.print();
			break;
		case 2:
			SamsungPrinter sam=new SamsungPrinter();
			//sp.SamsungPrint();
			sam.print();
			break;
		}
		
	}
}
