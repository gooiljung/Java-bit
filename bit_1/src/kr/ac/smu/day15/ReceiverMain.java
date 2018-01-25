package kr.ac.smu.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiverMain {
	public static void main(String[] args) {
		try {
			
			DatagramSocket socket=new DatagramSocket(10003);
			System.out.println("수신시작");
			byte[] bytes=new byte[100];
			DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
			while(true) {
				
				socket.receive(packet);
				String msg=new String(packet.getData());
				//		String msg=String.valueOf(packet.getData());
				System.out.println("수신된 내용은: ["+msg+"]");
			}
		}catch(Exception e) {
			
		}
		
	}
}