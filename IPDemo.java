import java.net.*;

public class IPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress i = null;
//		try {
//			i = InetAddress.getLocalHost();
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(i.toString());
//		System.out.println("Address: "+i.getHostAddress());
//		System.out.println("name: "+i.getHostName());
		
		try {
			i=InetAddress.getByName("www.baidu.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Address: "+i.getHostAddress());
		System.out.println("name: "+i.getHostName());
		

	}

}
