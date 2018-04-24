/*
 * File对象：
 * 
 * 实现：列出指定目录下的所有内容。
 * 因为目录中还有目录，只要使用同一个列出目录功能的函数完成即可 
 * 	--> 函数自身调用自身 --> 这种编程手法称为递归
 * 
 * 注意：
 * 1，限定条件。
 * 2，注意递归的次数，避免内存溢出
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
		File[] files = File.listRoots();	//获取系统盘符
		for (File file : files)
		{
			System.out.println(file);
		}
	}
	public static void listDemo()
	{
		File  f = new File("D:\\");
//		String[] names = f.list();	//获取系统盘符下所有文件名，包含隐藏文件
		
		String[] names = f.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				return name.endsWith(".exe");	//匿名内部类，返回所有后缀名为‘.exe’的文件名
			}
		});
		for (String name : names)
		{
			System.out.println(name);
		}
				
	}

}
