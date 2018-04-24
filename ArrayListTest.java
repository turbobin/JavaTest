import java.util.*;
/*
 * 去除ArrayList集合中重复的元素。
 */

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("object1");
		al.add("object2");
		al.add("object2");
		al.add("object2");
		al.add("object3");
		al.add("object3");
		al.add("object3");
		say(al);
		al = removeDup(al);
		say(al);

	}
	public static ArrayList<String> removeDup(ArrayList<String> al)
	{
		//定义一个临时容器。
		ArrayList<String> newal = new ArrayList<String>();
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String obj = it.next();
			if(!newal.contains(obj))
				newal.add(obj);
		}
		return newal;
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
