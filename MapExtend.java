/*
 * 
 */
import java.util.*;
public class MapExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,HashMap<String,Integer>> school = 
				new HashMap<String,HashMap<String,Integer>>();
		HashMap<String,Integer> classone = new HashMap<String,Integer>();
		HashMap<String,Integer> classtwo = new HashMap<String,Integer>();
		
		school.put("class_1", classone);
		school.put("class_2", classtwo);
		
		classone.put("zhangsan",21);
		classone.put("lisi",18);
		classtwo.put("wangwu",19);
		classtwo.put("zhaoliu",20);
		classtwo.put("zhuqi",22);
		
		//遍历school集合，获取所有的教室。
		Set<String> keys = school.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
		{
			String roomname = it.next();
			HashMap<String, Integer> classroom = school.get(roomname);
			
			System.out.println(roomname);
			getStudentinfo(classroom);
		}

	}
	
	public static void getStudentinfo(HashMap<String, Integer> roomMap)
	{
//		System.out.println(roomMap);	//?
		Iterator<String> it = roomMap.keySet().iterator();
		while(it.hasNext())
		{
			String name = it.next();
			int age = roomMap.get(name);
			System.out.println(name+"::"+age);
		}
	}

}
