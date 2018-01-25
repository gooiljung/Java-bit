package kr.ac.smu.day15;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

//프로토콜://호스트주소:포트/경로 
//http://117.16.40.180;10000/Lecture/setup/수업시간image/문자열.png
public class URLMain {
	public static void main(String[] args) {
		try {
//			URL urlObj=new URL("http://117.16.40.180:10000/Lecture/setup/수업시간image/문자열.png");
			URL urlObj=new URL("https://www.naver.com");
			System.out.println("프로토콜: "+urlObj.getProtocol());
			System.out.println("호스트주소:  "+urlObj.getHost());
			System.out.println("포트: "+urlObj.getPort());
			System.out.println("경로: "+urlObj.getPath()); 
			System.out.println("---------------------------------");
			InputStream is=urlObj.openStream();
			InputStreamReader isr=new InputStreamReader(is,"utf-8");
			while(true) {
				int c=isr.read();
				if(c==-1) break;
				System.out.print((char)c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
