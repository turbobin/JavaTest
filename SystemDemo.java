/*
 * System类:
 * 描述系统一些信息。
 * 获取系统属性信息：Properties getProperties();
 */
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class SystemDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		//public class Propertiesextends Hashtable<Object,Object>
		//Properties是Hashtable的子类，也就是Map集合的一个子类对象，
		//那么可以通过Map的方法取出集合中的元素,该集合中存储的都是字符串，没有泛型定义。
		
		
		//将系统信息输出到一个文件中
		prop.list(new PrintStream("C:\\sysinfo.txt"));
		
		//在系统中自定义一些特有的信息
		System.setProperty("mykey","myvalue");
		//获取指定属性信息。
		String myvalue = System.getProperty("mykey");
		System.out.println("myvalue="+myvalue);

		String value = System.getProperty("os.name");
		System.out.println("value="+value);
			
		
		/*获取所有属性信息*/
		for(Object obj : prop.keySet())
		{
			String value1 = (String)prop.get(obj);
			System.out.println(obj+"::"+value1);
		}

	}

}
