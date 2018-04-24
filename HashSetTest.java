import java.util.*;
/*
 * |--Set：元素是无序的(存入和取出的顺序不一定一致)，元素不可以重复。
 * 		|--HashSet:底层数据结构是哈希表。
 * 			HashSet是如何保证程序唯一性的呢？
 * 			是通过元素的两个方法hashCode和equals来完成。如果元素的HashCode值相同，才会判断equals是否为true
 * 			如果元素的hashCode值不同，不会调用equals.
 * 			注意：对于判断元素是否存在(contains)，以及删除(remove)等操作，依赖的是元素的hashCode和equals方法。
 * 		|--TreeSet:
 * Set集合的功能和collection是一致的。
 */

class HashSetDemo
{
	private String name;
	private int age;
	HashSetDemo(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int hashCode()
	{
		System.out.println(this.name+"....");
//		return 60;
		return name.hashCode()+age*39;
	}
	public boolean equals(Object obj)	//当返回相同的hashCode时，底层会自动调用
	{
		if(!(obj instanceof HashSetDemo))
			return false;
		
		HashSetDemo p = (HashSetDemo)obj;
		System.out.println(this.name+"..pk.."+p.name);
		
		return this.name.equals(p.getName()) && this.age == p.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hashsetDemo hs1 = new hashsetDemo();
//		hashsetDemo hs2 = new hashsetDemo();
//		say(hs1);
//		say(hs2);
		HashSet hs = new HashSet();
		hs.add(new HashSetDemo("a1",11));//返回true
		hs.add(new HashSetDemo("a1",11));//返回false
		hs.add(new HashSetDemo("a2",13));
		hs.add(new HashSetDemo("a1",11));
//		hs.add(new HashSetDemo("a3",12));
//		hs.add(new HashSetDemo("a4",11));
//		say(hs);
//		hs = removeDup(hs);
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			HashSetDemo hsd = (HashSetDemo)it.next();
			say(hsd.getName()+","+hsd.getAge());
		}

	}
	/*
	public static HashSet removeDup(HashSet hs)
	{
		//定义一个临时容器。
		HashSet newhs = new HashSet();
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newhs.contains(obj))	//remove，contains底层都会调用equals方法
				newhs.add(obj);
		}
		return newhs;
	}
	*/
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
