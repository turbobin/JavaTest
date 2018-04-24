/*
 * 练习：
 * “fsdgdhsdghdhasdhhjdsfha”获取该字符串中的字母出现的次数。
 * 希望打印结果：a(1)b(2)...
 * 
 * 字母和数字之间存在映射关系，可以考虑使用map集合
 */
import java.util.*;
public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = charCount("fsdgdhsdghdhasdhhjdsfha");
		System.out.println(str);
	}
	
	public static String charCount(String str)
	{
		char[] chs = str.toCharArray();
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		int count = 0;
		for (int x=0; x<chs.length; x++)
		{
			Integer value = tm.get(chs[x]);
//			if(value==null)
//			{
//				tm.put(chs[x], 1);
//			}else
//			{
//				value = value + 1;
//				tm.put(chs[x], value);
//			}
			
			if(value!=null)
				count = value;
			count++;
			tm.put(chs[x], count);
			count = 0;
		}
		System.out.println(tm);
		
		StringBuilder sb = new StringBuilder();	//将字符串存入缓冲区
		Set<Map.Entry<Character, Integer>> entryset = tm.entrySet();
		Iterator<Map.Entry<Character, Integer>> it = entryset.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character, Integer> me = it.next();
			Character ch = me.getKey();
			Integer value = me.getValue();
			sb.append(ch+"("+value+")");
		}

		return sb.toString();
	}

}
