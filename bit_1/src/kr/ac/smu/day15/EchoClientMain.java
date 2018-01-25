package kr.ac.smu.day15;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
/*
 * EchoClientMain
 */
public class EchoClientMain {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("명령어가 잘못되었습니다.");
			System.out.println("사용법: java EchoClientMain 서버IP 포트");
			System.exit(0);
		}
		try {
			Socket socket=new Socket(args[0],Integer.parseInt(args[1]));
			//키보드로 전송할 메세지를 입력받는 객체가 필요
//			System.out.println("서버로 전송할 메세지를 입력하세요.");
//			Scanner scan=new Scanner(System.in);
//			scan.nextLine();
			InputStream is = System.in;
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader keyboard=new BufferedReader(isr);
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//키보드로 입력한 메세지를 서버에게 전송하는 객체가 필요 
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			PrintWriter pw=new PrintWriter(osw);
			
			//서버에서 재전송한 메세지를 수신하는 객체. 
			is=socket.getInputStream();
			isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			while(true) {
				
				System.out.print("서버에 전송할 메세지를 입력하세요.(quit 입력시 종료)");
				String msg=keyboard.readLine();
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 연결 해제");
					socket.close();
					System.exit(0);
				}
				pw.println(msg);
				pw.flush();
				System.out.println("-----------");
				String echoMsg=br.readLine();
				System.out.println("서버에서 재전송한 메세지: ["+echoMsg+"]");
				
				
				
				
				
				
				
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
