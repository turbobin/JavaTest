import java.util.*;

/*
 * ��ϰ�������ַ�����������
 * �ַ�������߱��Ƚ��ԣ��������ıȽϷ�ʽ��������Ҫ��
 * 
 * ���ͣ�JDK1.5�汾�Ժ���ֵ������ԡ����ڽ����ȫ���⣬��һ�����Ͱ�ȫ���ơ�
 * 
 * �ô���
 * 1.������ʱ�ڳ�������ClassCastException��ת�Ƶ��˱���ʱ��
 * 		�����ڳ���Ա�������
 * 2��������ǿ��ת�����鷳��
 * 
 * ���͸�ʽ��ͨ��<>������Ҫ��������������
 * 
 * ��ʹ��java�ṩ�Ķ���ʱ��ʲôʱ���巺���أ�
 * ͨ���ڼ��Ͽ���кܳ�����ֻҪ����<>��Ҫ�����巺�͡�
 */
public class TreeSetTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new StrLenCompare());
		ts.add("abcd");
		ts.add("cd");
		ts.add("d");
		ts.add("abe");
		ts.add("aba");
		ts.add("abcdefg");
		
//		say(ts);
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			say(it.next());
		}

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
class StrLenCompare implements Comparator<String>	//��ӷ��ͣ���ȷString����
{
	public int compare(String o1,String o2)
	{
//		String str1 = (String)o1;
//		String str2 = (String)o2;
//		System.out.println(str1+"...."+str2);
		
		/*
		if(str1.length() > str2.length())
			return 1;
		if(str1.length() == str2.length())
			return 0;
		
		return -1;
		*/
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
		
		if(num==0)
			return o1.compareTo(o2);
		
		return num;
	}
}
