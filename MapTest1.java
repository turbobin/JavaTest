/*
 * 需求：对学生对象的年龄进行升序排序。
 * 
 * 使用TreeMap集合
 */
import java.util.*;
public class MapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student4,String> tm = new TreeMap<Student4,String>();
		
		tm.put(new Student4("lisi2",21), "Beijing");
//		tm.put(new Student4("lisi2",21), "Tianjing");
		tm.put(new Student4("zhagnsan",23), "Wuhan");
		tm.put(new Student4("lisi4",21), "Shenzhen");
		tm.put(new Student4("zhaoliu",24), "Guangzhou");
		
		Set<Map.Entry<Student4, String>> entryset = tm.entrySet();
		Iterator<Map.Entry<Student4, String>> iter = entryset.iterator();
		while(iter.hasNext())
		{
			Map.Entry<Student4, String> me = iter.next();
			Student4 stu = me.getKey();
			String addr = me.getValue();
			System.out.println(stu+",,,,"+addr);
		}

	}

}
