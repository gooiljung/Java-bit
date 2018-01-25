package kr.ac.smu.day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.smu.util.FileClose;

public class FileIOMain10 {
   
   public static void write() {
      UserInfo user = new UserInfo("홍길동",25,"서울시 서초구");
      
      FileOutputStream fos = null;
      ObjectOutputStream oos = null;
      
      try {
         //fos = new FileOutputStream("iotest/object.txt");
         fos = new FileOutputStream("iotest/object_transient.txt");
         oos = new ObjectOutputStream(fos);
         
         oos.writeObject(user);
         oos.flush();
         System.out.println("object.txt에 저장");
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         FileClose.close(oos,fos);
      }
   }
   public static void read() {
      try (
         //FileInputStream fis = new FileInputStream("Iotest/object.txt");
         FileInputStream fis = new FileInputStream("Iotest/object_transient.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         
      ){
         UserInfo user= (UserInfo)ois.readObject();
         
         System.out.println("object.txt 로드완료");
         
         System.out.println("name : " + user.getName());
         System.out.println("age : " + user.getAge());
         System.out.println("addr : " + user.getAddr());
         
      }catch(Exception e) {
         
         e.printStackTrace();
      }
   }
   public static void main(String[] args) {
      
      //write();
      read();
   }
   
}