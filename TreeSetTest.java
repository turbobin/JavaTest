import java.util.*;
/*
 * |--Set��Ԫ���������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
 * 		|--TreeSet:���Զ�Set�����е�Ԫ�ؽ���ȥ�ز����򣨰���Ȼ˳�򣩡�
 * 			�ײ����ݽṹʽ��������
 * 			��֤����Ψһ�Ե����ݣ�compareTo����return 0.
 * 
 */

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add("22222");
		ts.add("11111");
		ts.add("44444");
		ts.add("22222");
		
//		say(ts);
		Iterator it = ts.iterator();
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
