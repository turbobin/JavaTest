/*
 * ���ϱ����顣
 * Collection�ӿ��е�toArrray������
 * ΪʲôҪ������ �����飿
 * Ϊ���޶���Ԫ�صĲ���������������ɾ������
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
		 * ���ָ���������鳤�ȴ��ڼ��ϵ�size���ͻ�ʹ�ô��ݽ��������飬
		 * ����÷����ڲ��ᴴ��һ���µ����飬����Ϊ���ϵ�size��
		 * ���Դ�������ʱ��ָ���������鳤��Ϊ���ϵ�size��á�
		 */
		String[] arr = al.toArray(new String[al.size()]);
		say(Arrays.toString(arr));
		
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
