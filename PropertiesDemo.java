/*
 * �ص㳣�ö���Properties
 * hashtable�����ࡣ�߱�map���ϵ��ص㣬��������洢�ļ�ֵ�Զ����ַ�����
 * 
 * �Ǽ����к�IO�������ϵļ���������
 * �ö�����ص㣺�������ڼ�ֵ����ʽ�������ļ���
 */
import java.util.*;
import  java.io.*;
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		setAndGet();
		loadProp();

	}
	
	//��Ӳ�����ݼ��ص�������
	public static void loadProp() throws IOException
	{
//		FileReader file = new FileReader("C:/Users/hmx/Desktop/user.txt"); //��
		FileInputStream file = new FileInputStream("C:/Users/hmx/Desktop/user.txt");
		Properties prop = new Properties();
		prop.load(file);
		
//		System.out.println(prop.get("caocb.sdc"));
		prop.setProperty("yerx.sdc", "DGDP312");
		
		FileOutputStream outfile = new FileOutputStream("C:/Users/hmx/Desktop/user.xml");
		prop.storeToXML(outfile, "�޸�yerx.sdc... ");
		prop.list(System.out);
		
		file.close();
		outfile.close();
	}
	//���úͻ�ȡԪ��
	public static void setAndGet()
	{
		Properties prop = new Properties();
		
		prop.setProperty("����","28");
		prop.setProperty("����","25");
		prop.setProperty("����","28");
		prop.setProperty("����","27");
		prop.setProperty("����","29");
		
//		System.out.println(prop);	//�����ֵ���ʽ
//		String value  = prop.getProperty("����");
//		System.out.println(value);
		
		Set<String> names = prop.stringPropertyNames();
		for (String name: names)
		{
			System.out.println(name+":"+prop.getProperty(name));
		}
	}

}
