package kr.ac.smu.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.smu.util.FileClose;

public class FileIOMain09 {

   public static void write() {

      UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");
      try (FileWriter fw = new FileWriter("iotest/userInfo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);) {
         pw.println(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
         pw.flush();

         // bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
         // bw.newLine();
//          bw.flush();

         System.out.println("userInfo.txt에 저장완료...");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void read() {

      FileReader fr = null;
      BufferedReader br = null;

      try {
         fr = new FileReader("iotest/userInfo.txt");
         br = new BufferedReader(fr);

         String data = br.readLine();
         String[] dataArr = data.split(":");

         UserInfo user = new UserInfo(dataArr[0], Integer.parseInt(dataArr[1]), dataArr[2]);

         System.out.println("로드 완료..");
         System.out.println("user : " + user);

         // writeHtml(user);

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         FileClose.close(br, fr);
      }
   }

   public static void writeHtml(UserInfo user) throws Exception {

      FileWriter fw = new FileWriter("iotest/user.html");
      BufferedWriter bw = new BufferedWriter(fw);

      StringBuilder sb = new StringBuilder();
      sb.append("<HTML>");
      sb.append("<HEAD>");
      sb.append("<TITLE>회원 정보 출력</TITLE>");
      sb.append("</HEAD>");
      sb.append("<BODY>");
      sb.append("이름 : <b>" + user.getName() + "</b><BR/>");
      sb.append("나이 : " + user.getAge() + "<BR/>");
      sb.append("주소 : " + user.getAddr() + "<br/>");
      sb.append("</BODY>");
      sb.append("</HTML>");

      bw.write(sb.toString());
      bw.flush();

      bw.close();
      fw.close();

}
   
   
   public static void main(String[] args) {
      
      write();
      read();
   }
}