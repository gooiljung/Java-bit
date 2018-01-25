package kr.ac.smu.day08.abs02;
import java.util.Scanner;
public class Menu {
	private int choiceMenu() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("출력할 프린터를 선택하세요.(1.LG 2.SAMSUNG 3.HP) : ");
		int type=sc.nextInt();
		sc.nextLine();
		return type;
	
	}
	//상속관계에서만 객체 형변환이 일어난다.
	
	public void process() {
		int type=choiceMenu();
		Printer p=null;
		switch(type) {
		case 1:
			p=new LGPrinter();	
			break;
		case 2:
			p=new SamsungPrinter();
			break;
		case 3:
			p = new HPPrinter();
			break;
		
		}
		if(p!=null)
			p.print();
		else
			System.out.println("잘못 입력 하였습니다.");
/*
		switch(type) {
		case 1:
			Printer lg=new LGPrinter();
			//lg.LgPrint();
			lg.print();
			break;
		case 2:
			Printer sam=new SamsungPrinter();
			//sp.SamsungPrint();
			sam.print();
			break;
		case 3:
			Printer hp = new HPPrinter();
			hp.print();
			break;
		}
		*/
/*
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
		case 3:
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		}
		*/
	}
}
