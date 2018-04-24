import java.util.*;
/*
 * 高级for循环：
 * 格式：
 * for(数据类型 变量名:被遍历的集合或者数组)
 * {
 * 
 * }
 */
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//集合
		ArrayList<String> al = new ArrayList<String>();
		al.add("object1");
		al.add("object2");
		al.add("object3");
		
//		Iterator<String> it = al.iterator();	//除了遍历，还可以进行remove操作
//		while(it.hasNext())						//如果是ListIterator,还可以进行增删改查
//		{
//			say("next:"+it.next());
//		}
		
		for(String s:al)	//只能获取元素，但不能对集合进行操作
		{
			say(s);
		}

		//数组
		int[] arr = {1,4,2,5};
		for(int i:arr)
		{
			say("i="+i);
		}
		
		//Map
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "value1");
		hm.put(2, "value2");
		hm.put(3, "value3");
		
		Set<Integer> keyset = hm.keySet();
		for(Integer i: keyset)
		{
			say(i+"::"+hm.get(i));
		}
		
		Set<Map.Entry<Integer, String>> entryset = hm.entrySet();
		for(Map.Entry<Integer, String> me :entryset)
		{
			say(me.getKey()+"----"+me.getValue());
		}
		
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
