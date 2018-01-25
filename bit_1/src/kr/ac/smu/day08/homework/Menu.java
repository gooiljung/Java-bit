package kr.ac.smu.day08.homework;
import java.util.Scanner;
public class Menu {
	Scanner sc=new Scanner(System.in);
	private int num;
	private String quit;
	Shape sh=null;
	public void menu() {
		while(true) {
			System.out.print("1.정사각형 2.직사각형 3.삼각형 4.원 ");
			num=sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				sh=new Square();
				break;
			case 2:
				sh=new Rectangle();
				break;
			case 3:
				sh=new Triangle();
				break;
			case 4:
				sh=new Circle();
				break;
			}
			sh.print();
			System.out.print("계속할래? (종료시 quit 입력 =>)");
			quit=sc.nextLine();
			if (quit.equals("quit"))
				System.exit(0);
		}
	}
}
