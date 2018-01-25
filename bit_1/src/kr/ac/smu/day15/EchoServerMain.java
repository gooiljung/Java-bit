package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10002);
			System.out.println("서버구동중...클라이언트의 접속을 기다립니다.");
			Socket client=server.accept();
			System.out.println("연결된 클라이언트의 정보: ["+client.getInetAddress().getHostAddress()+"]");
			//클라이언트에서 전송한 메세지를 수신하는 객체 
			InputStream  is= client.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			
			//수신한 메세지를 클라이언트에게 재전송할 객체 
			OutputStream os=client.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter pw = new BufferedWriter(osw);
//			PrintWriter pw = new PrintWriter(osw);
			
			while(true) {
				String msg=br.readLine();
				if(msg==null) {
					System.out.println("클라이언트["+client.getInetAddress().getHostAddress()+
							"] 와의 접속 해제 ");
					client.close();
					break;
				}
				System.out.println("["+client.getInetAddress().getHostAddress()+"]: "+msg);
//				pw.println(msg);
//				pw.println(msg);
				pw.write(msg);
				pw.newLine();
				pw.flush();
				
				
			}
			
			
			
					
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}	
