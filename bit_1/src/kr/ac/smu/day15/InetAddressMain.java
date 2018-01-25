package kr.ac.smu.day15;
import java.net.InetAddress;
public class InetAddressMain {
	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("내컴퓨터의 네트워크이름: "+localhost.getHostName());
			System.out.println("내컴퓨터의 ip 주소: "+localhost.getHostAddress());
			System.out.println("local host: "+localhost);
			
			InetAddress addr=InetAddress.getByName("www.smu.ac.kr");
			System.out.println("상명대학교의 ip주소는: "+addr.getHostAddress());
			InetAddress addrs[]=InetAddress.getAllByName("www.naver.com");
			System.out.println("-------------------------");
			System.out.println("\t네이버 IP주소 보기 ");
			System.out.println("-------------------------");
			for(InetAddress address:addrs) {
				System.out.println(address);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
