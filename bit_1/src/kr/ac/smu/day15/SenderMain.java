package kr.ac.smu.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/*
 * UDP통신 
 */
public class SenderMain {
	public static void main(String[] args) {
		try {	
			DatagramSocket socket = new DatagramSocket();
			System.out.println("송신 시작 ");
			for(int i=1;i<=5;i++) {
				String msg="hello-"+i;
				byte[] bytes=msg.getBytes();
				DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
						new InetSocketAddress("localhost",10003));
				socket.send(packet);
				System.out.println(i+"번째 데이터 전송완료...");
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
