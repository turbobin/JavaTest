/*
 * Arrays:用于操作数组的工具类。
 * 里面都是静态方法。
 * asList:将数组变成list集合
 * 不可以使用集合的增删方法。因为数组的长度是固定的。
 */
import java.util.*;
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//把数组变成字符串输出
//		int[] arr = {1,4,6,32};
//		say(Arrays.toString(arr));
		
		String[] arr = {"ni","zai","gan","shen","me"};
		/*
		 * 把数组变成list集合后，可以用集合的思想和方法来操作数组中的元素
		 */
		List<String> list = Arrays.asList(arr);
		say(list);
		
//		int[] nums = {1,3,3,6};
//		List<int[]> li = Arrays.asList(nums);
//		say(li);	//[[I@1db9742]   返回哈希值
		
		Integer[] nums = {1,3,3,6};
		List<Integer> li  = Arrays.asList(nums);
		say(li);	//[1, 3, 3, 6]
		/*
		 * 如果数组中的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素。
		 * 如果数组中的元素是基本数据类型，那么会将该数组作为集合中的元素存在。
		 */
	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
