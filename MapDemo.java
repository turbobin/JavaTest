/*
 * Map集合：该集合存储键值对，一对一往里存。而且要保证数据的唯一性。
 * 	1，添加。
 * 		put(K key, V value) 
 * 		putAll(Map<? extends K,? extends V> m) 
 * 		
 *  2，删除。
 *  	clear()
 *  	remove(Object Key)
 *  
 *  3，判断
 *  	containsKey(Object key) 
 *  	containsValue(Object value)
 *  
 *  4，获取。
 *  	get(Object key) 
 *  	size()
 *  	values() 
 *  
 *  
 *  	entrySet() 
 *  	keySet() 
 *  
 *  Map
 *  	|--Hashtable：底层是哈希表数据结构，不可以存入null键和null值。该集合是线程同步的。JDK1.0，效率低
 *  	|--HashMap：底层是哈希表数据结构，允许使用null键和null值。该集合是不同步的。JDK1.2，效率高
 *  	|--TreeMap：底层是二叉树数据结构，线程不同步的。可以给Map集合中的键排序
 *  
 *  和Set很像。Set底层就是使用了Map集合
 */
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		//添加元素，添加时，如果添加相同的键。那么后添加的键会覆盖原有的键值对
		//put方法返回以前与 key 关联的值
		map.put(01, "zhangsan1");
		say(map.put(03, "zhangsan2"));	//返回null
		say(map.put(03, "zhangsan3"));	//覆盖前一个值，返回zhangsan2
		map.put(05, "zhangsan4");
		map.put(02, "zhangsan3");
		
		say("containsKey:"+map.containsKey(05));	//true,如key不存在，返回false
		
		say("get:"+map.get(05));
		
		map.put(04,null);	//可以存入成功
		
		say("get:"+map.get(04));//可以通过get方法的返回值判断一个键是否存在。通过返回null来判断。(注意特殊情况)
		
		//获取map集合中所有的值
		Collection<String> coll = map.values();
		say(coll);
		say(map);	//{1=zhangsan1, 2=zhangsan3, 3=zhangsan2, 4=null, 5=zhangsan4}

	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
