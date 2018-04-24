/*
 * ���Ͽ�ܹ����ࣺ
 * Collections:
 * ����sort
 * ȡ���ֵ��max
 * �۰���ң�binarySearch
 * �滻��fill��replaceAll
 * ��ת��reverse
 * ��ת��reverseOrder������һ���Ƚ�����
 * ����λ�ã�swap��ֻ�ܲ���list��
 * ����������м��ϣ�shuffle
 */
import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("fffffff");
		list.add("bbb");
		list.add("rrrr");
		list.add("dddd");
		list.add("bbbb");
		
		say(list);
		
//		Collections.sort(list);	//��Ȼ����
		Collections.sort(list,new StrLenComp());//�����Ƚ��������ַ���������
		
		say(list);
		
		//ȡ����ֵ
//		String max = Collections.max(list);
		String max = Collections.max(list,new StrLenComp());
		String min = Collections.min(list,new StrLenComp());
		say("max="+max);
		say("min="+min);
		
		//�۰����,���������������
		int index = Collections.binarySearch(list, "rrrr",new StrLenComp());
		say("index="+index);
		
		//������������Ԫ���滻��ָ��Ԫ��
//		Collections.fill(list, "xxx");
//		say(list);
		
		//�滻ĳһ��ֵ
		Collections.replaceAll(list, "bbb", "ccc");
		say(list);
		
		//��ת
		Collections.reverse(list);
		say(list);
		
		Collections.swap(list, 2, 0);
		say(list);

	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
class StrLenComp implements Comparator<String>
{
	public int compare(String str1,String str2)
	{
//		if(str1.length() > str2.length())
//			return 1;
//		if(str1.length() < str2.length())
//			return -1;
//		return str1.compareTo(str2);
		
		return new Integer(str1.length()).compareTo(new Integer(str2.length()));
	}
}
