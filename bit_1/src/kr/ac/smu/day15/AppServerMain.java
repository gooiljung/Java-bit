package kr.ac.smu.day15;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * server 의  작업순서
 * 1. port를 열고 , 클라이언트의 연결을 기다림
 * 2.클라이언트가 연결을 요청하면 데이터 송수신읠 socket  객ㅊ ㅔ 생;;/////
 * 3. 데이터 송수신을 위한 InputStream/OutputStream 객체 얻어오기 
 * 4. 데이터 송수신 수행 
 * 5. 데이터 송수신 이 완료도면 클라이언트와의 연결해
 */
public class AppServerMain {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("애플리케이션 서버 구동 ");
			Socket client=server.accept();
			System.out.println("접속할 클라이언트 정보: "+client);
			
			//클라이언트가 서버에 접속하면 환영메세지를 클라이언트에게 전송 
			String msg="접속을 환영합니다.";
			OutputStream os=client.getOutputStream();
			
			//방법2 
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(msg);
			dos.flush();
			
			
			//방법1 
//			OutputStreamWriter osw=new OutputStreamWriter(os,"utf-8"); 
//			BufferedWriter bw=new BufferedWriter(osw);
//			bw.write(msg);
//			bw.newLine();
//			bw.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
