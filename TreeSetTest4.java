import java.util.*;

/*
 * 练习：按照字符串长度排序
 * 字符串本身具备比较性，但是它的比较方式不是所需要的
 * 
 * 泛型：JDK1.5版本以后出现的新特性。用于解决安全问题，是一个类型安全机制。
 * 
 * 好处：
 * 1.将运行时期出的问题ClassCastException，转移到了编译时期
 * 		方便于程序员解决问题
 * 2。避免了强制转换的麻烦。
 * 
 * 泛型格式：通过<>来定义要操作的数据类型
 * 
 * 在使用java提供的对象时，什么时候定义泛型呢？
 * 通常在集合框架中很常见，只要见到<>就要丁定义泛型。
 */
public class TreeSetTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new StrLenCompare());
		ts.add("abcd");
		ts.add("cd");
		ts.add("d");
		ts.add("abe");
		ts.add("aba");
		ts.add("abcdefg");
		
//		say(ts);
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			say(it.next());
		}

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
class StrLenCompare implements Comparator<String>	//添加泛型，明确String类型
{
	public int compare(String o1,String o2)
	{
//		String str1 = (String)o1;
//		String str2 = (String)o2;
//		System.out.println(str1+"...."+str2);
		
		/*
		if(str1.length() > str2.length())
			return 1;
		if(str1.length() == str2.length())
			return 0;
		
		return -1;
		*/
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
		
		if(num==0)
			return o1.compareTo(o2);
		
		return num;
	}
}
