/*
 * Map集合的两种取出方式：
 * 1，KeySet：将map中所有的键存入到Set集合，因为Set具备迭代器。
 * 	所以可以迭代的方式取出所有的键，再根据get方法获取每一个键对应的值
 * 
 * 2，Set<Map.Entry<K,V>> entrySet():将map集合的映射存入到Set集合中，
 * 		而这个关系的数据类型就是：Map.Entry
 */
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("03", "lisi03");
		map.put("01", "lisi01");
		map.put("01", "lisi001");	//将覆盖前一个key值相同的值
		map.put("02", "lisi02");
		map.put("04", "lisi04");
		
		//先获取map集合的所有键的Set集合，KetSet();
		Set<String> keys = map.keySet();
		
		//有了Set集合，就可以获取其迭代器，按Set方式取出元素
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = map.get(key);
			say(key+" , "+value);
		}
		
		
		//将Map集合中的映射关系取出，存入到Set集合中。
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> itt = entrySet.iterator();
		
		while(itt.hasNext())
		{
			Map.Entry<String, String> me = itt.next();
			
			//通过Map.Entry中的特有方法取出
			String key = me.getKey();
			String value = me.getValue();
			
			say(key+":"+value);
		}
		
	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}
}

/* Map.Entry 其实也是一个接口，它是Map中的一个内部接口
 
interface Map
{
	public static interface Entry
	{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}

class HashMap implements Map
{
	class Haha implements Map.Entry
	{
		public Object getKey(){}
		public Object getValue(){}
	}
}
*/