import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * ���룺�ַ�������ֽ����顣
 * 
 * ���룺�ֽ��������ַ���
 * 
 * String ����>byte[] ; str.getByte(chartsetName);
 * 
 * byte[] ����>String ; new String(byte[],chartsetName)
 */

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "���";
		
		byte[] b = s.getBytes("gbk");
//		for(byte ch : b)
//		{
//			System.out.println(ch);
//			
//		}
		//���������ַ�����ӡ
		System.out.println(Arrays.toString(b));
		
//		String s1 = new String(b,"ISO8859-1");	//����������
		String s1 = new String(b,"utf-8");	//
		System.out.println(s1);	//��������
		
		//�������,�ȱ��룬�ٽ���
//		byte[] b2 = s1.getBytes("ISO8859-1");
		byte[] b2 = s1.getBytes("utf-8");
		System.out.println(Arrays.toString(b2));	//ͬ�����Ķ���������벻����
		System.out.println(new String(b2,"gbk"));
		
		
		
		

	}

}
