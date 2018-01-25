package kr.ac.smu.day15;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
class EchoThread extends Thread{
	private Socket client;
	EchoThread(Socket client){
		this.client=client;
	}
	@Override
	public void run() {
		try {
			System.out.println("연결된 클라이언트의 정보: ["+client.getInetAddress().getHostAddress()+"]");
			//클라이언트에서 전송한 메세지를 수신하는 객체 
			InputStream  is= client.getInputStream();
			InputStreamReader isr=new InputStreamReader(is,"utf-8");
			BufferedReader br=new BufferedReader(isr);
			
			
			//수신한 메세지를 클라이언트에게 재전송할 객체 
			OutputStream os=client.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os, "utf-8");
			PrintWriter pw = new PrintWriter(osw);
			
			while(true) {
				String msg=br.readLine();
				if(msg==null) {
					System.out.println("클라이언트["+client.getInetAddress().getHostAddress()+
							"] 와의 접속 해제 ");
					client.close();
					break;
				}
				System.out.println("["+client.getInetAddress().getHostAddress()+"]: "+msg);
				pw.println(msg);
				pw.flush();
				
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class EchoServerThreadMain {
	public static void main(String[] args) {
		System.out.println("Echoserver 를 구동합니다. ");
		try {
			ServerSocket server =new ServerSocket(10002);
			while(true) {
				Socket client=server.accept();
				EchoThread et=new EchoThread(client);
				et.start();
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
