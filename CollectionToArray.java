/*
 * 集合变数组。
 * Collection接口中的toArrray方法。
 * 为什么要将集合 变数组？
 * 为了限定对元素的操作，不再允许增删操作。
 */
import java.util.*;
public class CollectionToArray {
	public static void main(String[] args)
	{
		ArrayList<String> al =  new ArrayList<String>();
		al.add("abc1");
		al.add("abc3");
		al.add("abc2");
		al.add("abc4");
		
		/*
		 * 如果指定类型数组长度大于集合的size，就会使用传递进来的数组，
		 * 否则该方法内部会创建一个新的数组，长度为集合的size。
		 * 所以创建数组时，指定类型数组长度为集合的size最好。
		 */
		String[] arr = al.toArray(new String[al.size()]);
		say(Arrays.toString(arr));
		
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
