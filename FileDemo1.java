/*
 * ��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·���洢��һ���ı��ļ���
 * ����һ��java�б��ļ�
 */
import java.io.*;
import java.util.*;
public class FileDemo1 {
	public static void main(String[] args) throws IOException
	{
		File dir = new File("D:\\Program Files\\Java\\workspace\\JavaTest");
		List<File> list = new ArrayList<File>();
		javaList(dir,list);
		
		System.out.println(list.size());
		
		File filelist = new File(dir,"javalist.txt");
		writeToFile(list,filelist);
	}
	
	public static void javaList(File dir,List<File> list)
	{
		
		File[] fnames = dir.listFiles();
		for(File fname: fnames)
		{
			if(fname.isDirectory())
			{
				javaList(fname,list);
			}
			else
			{
				String s = fname.getName();
				if(s.endsWith(".java"))
				{
					list.add(fname);
				}
			}
		}
		
	}
	public static void writeToFile(List<File> list,File filelist) throws IOException
	{
		BufferedWriter bufw = new BufferedWriter(new FileWriter(filelist));
		for(File file: list)
		{
			bufw.write(file.getAbsolutePath());
			bufw.newLine();
			bufw.flush();
		}
		
		System.out.println("java�ļ��б��ѽ������鿴��"+filelist.getAbsolutePath());
		bufw.close();
	}

}
