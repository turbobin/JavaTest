/*
 * System��:
 * ����ϵͳһЩ��Ϣ��
 * ��ȡϵͳ������Ϣ��Properties getProperties();
 */
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class SystemDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		//public class Propertiesextends Hashtable<Object,Object>
		//Properties��Hashtable�����࣬Ҳ����Map���ϵ�һ���������
		//��ô����ͨ��Map�ķ���ȡ�������е�Ԫ��,�ü����д洢�Ķ����ַ�����û�з��Ͷ��塣
		
		
		//��ϵͳ��Ϣ�����һ���ļ���
		prop.list(new PrintStream("C:\\sysinfo.txt"));
		
		//��ϵͳ���Զ���һЩ���е���Ϣ
		System.setProperty("mykey","myvalue");
		//��ȡָ��������Ϣ��
		String myvalue = System.getProperty("mykey");
		System.out.println("myvalue="+myvalue);

		String value = System.getProperty("os.name");
		System.out.println("value="+value);
			
		
		/*��ȡ����������Ϣ*/
		for(Object obj : prop.keySet())
		{
			String value1 = (String)prop.get(obj);
			System.out.println(obj+"::"+value1);
		}

	}

}
