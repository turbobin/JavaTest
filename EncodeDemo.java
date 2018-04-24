import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 编码：字符串变成字节数组。
 * 
 * 解码：字节数组变成字符串
 * 
 * String ——>byte[] ; str.getByte(chartsetName);
 * 
 * byte[] ——>String ; new String(byte[],chartsetName)
 */

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "你好";
		
		byte[] b = s.getBytes("gbk");
//		for(byte ch : b)
//		{
//			System.out.println(ch);
//			
//		}
		//将数组变成字符串打印
		System.out.println(Arrays.toString(b));
		
//		String s1 = new String(b,"ISO8859-1");	//服务器编码
		String s1 = new String(b,"utf-8");	//
		System.out.println(s1);	//返回乱码
		
		//解决方案,先编码，再解码
//		byte[] b2 = s1.getBytes("ISO8859-1");
		byte[] b2 = s1.getBytes("utf-8");
		System.out.println(Arrays.toString(b2));	//同有中文对照码表，编码不可逆
		System.out.println(new String(b2,"gbk"));
		
		
		
		

	}

}
