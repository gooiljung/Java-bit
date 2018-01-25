package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/*
 * https://www.naver.com 에서 전송된 내용을  naver.html 로 저장해보자. 
 */
public class URLConnectionMain {
	public static void main(String[] args) {
		
		try(
			FileOutputStream fos=new FileOutputStream("iotest/naver.html");
			OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
			BufferedWriter bw=new BufferedWriter(osw);
		)
		{
			
			URL urlObj=new URL("https://www.naver.com");
			URLConnection uc=urlObj.openConnection();
			InputStream is=uc.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			while(true) {
				String data=br.readLine();
				if (data==null) break;
				bw.write(data);
				bw.newLine();
				bw.flush();
				
			}
			System.out.println("naver.html 에 저장완료.... ");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
