/*
 * 集合框架工具类：
 * Collections:
 * 排序：sort
 * 取最大值：max
 * 折半查找：binarySearch
 * 替换：fill、replaceAll
 * 反转：reverse
 * 反转：reverseOrder（返回一个比较器）
 * 交换位置：swap（只能操作list）
 * 重新随机排列集合：shuffle
 */
import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("fffffff");
		list.add("bbb");
		list.add("rrrr");
		list.add("dddd");
		list.add("bbbb");
		
		say(list);
		
//		Collections.sort(list);	//自然排序
		Collections.sort(list,new StrLenComp());//创建比较器，按字符长度排序
		
		say(list);
		
		//取出最值
//		String max = Collections.max(list);
		String max = Collections.max(list,new StrLenComp());
		String min = Collections.min(list,new StrLenComp());
		say("max="+max);
		say("min="+min);
		
		//折半查找,必须是有序的数组
		int index = Collections.binarySearch(list, "rrrr",new StrLenComp());
		say("index="+index);
		
		//将集合中所有元素替换成指定元素
//		Collections.fill(list, "xxx");
//		say(list);
		
		//替换某一个值
		Collections.replaceAll(list, "bbb", "ccc");
		say(list);
		
		//反转
		Collections.reverse(list);
		say(list);
		
		Collections.swap(list, 2, 0);
		say(list);

	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
class StrLenComp implements Comparator<String>
{
	public int compare(String str1,String str2)
	{
//		if(str1.length() > str2.length())
//			return 1;
//		if(str1.length() < str2.length())
//			return -1;
//		return str1.compareTo(str2);
		
		return new Integer(str1.length()).compareTo(new Integer(str2.length()));
	}
}
