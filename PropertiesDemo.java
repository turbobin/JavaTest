/*
 * 重点常用对象：Properties
 * hashtable的子类。具备map集合的特点，而且里面存储的键值对都是字符串。
 * 
 * 是集合中和IO技术相结合的集合容器。
 * 该对象的特点：可以用于键值对形式的配置文件。
 */
import java.util.*;
import  java.io.*;
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		setAndGet();
		loadProp();

	}
	
	//将硬盘数据加载到集合中
	public static void loadProp() throws IOException
	{
//		FileReader file = new FileReader("C:/Users/hmx/Desktop/user.txt"); //或
		FileInputStream file = new FileInputStream("C:/Users/hmx/Desktop/user.txt");
		Properties prop = new Properties();
		prop.load(file);
		
//		System.out.println(prop.get("caocb.sdc"));
		prop.setProperty("yerx.sdc", "DGDP312");
		
		FileOutputStream outfile = new FileOutputStream("C:/Users/hmx/Desktop/user.xml");
		prop.storeToXML(outfile, "修改yerx.sdc... ");
		prop.list(System.out);
		
		file.close();
		outfile.close();
	}
	//设置和获取元素
	public static void setAndGet()
	{
		Properties prop = new Properties();
		
		prop.setProperty("张三","28");
		prop.setProperty("李四","25");
		prop.setProperty("王五","28");
		prop.setProperty("王五","27");
		prop.setProperty("赵六","29");
		
//		System.out.println(prop);	//返回字典形式
//		String value  = prop.getProperty("王五");
//		System.out.println(value);
		
		Set<String> names = prop.stringPropertyNames();
		for (String name: names)
		{
			System.out.println(name+":"+prop.getProperty(name));
		}
	}

}
