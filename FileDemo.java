/*
 * File����
 * 
 * ʵ�֣��г�ָ��Ŀ¼�µ��������ݡ�
 * ��ΪĿ¼�л���Ŀ¼��ֻҪʹ��ͬһ���г�Ŀ¼���ܵĺ�����ɼ��� 
 * 	--> ��������������� --> ���ֱ���ַ���Ϊ�ݹ�
 * 
 * ע�⣺
 * 1���޶�������
 * 2��ע��ݹ�Ĵ����������ڴ����
 */
import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		listDemo();
		File dir = new File("D:\\Program Files\\Thunder Network");
		showDir(dir);

	}
	
	public static void showDir(File dir)
	{
		File[] files = dir.listFiles();
		for(File file : files)
		{
			if(file.isDirectory())
				showDir(file);
			else
				System.out.println(file);
		}
	}
	public static void listRootsDemo()
	{
		File[] files = File.listRoots();	//��ȡϵͳ�̷�
		for (File file : files)
		{
			System.out.println(file);
		}
	}
	public static void listDemo()
	{
		File  f = new File("D:\\");
//		String[] names = f.list();	//��ȡϵͳ�̷��������ļ��������������ļ�
		
		String[] names = f.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				return name.endsWith(".exe");	//�����ڲ��࣬�������к�׺��Ϊ��.exe�����ļ���
			}
		});
		for (String name : names)
		{
			System.out.println(name);
		}
				
	}

}
