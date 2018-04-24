import java.util.*;
/*
 * �߼�forѭ����
 * ��ʽ��
 * for(�������� ������:�������ļ��ϻ�������)
 * {
 * 
 * }
 */
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		ArrayList<String> al = new ArrayList<String>();
		al.add("object1");
		al.add("object2");
		al.add("object3");
		
//		Iterator<String> it = al.iterator();	//���˱����������Խ���remove����
//		while(it.hasNext())						//�����ListIterator,�����Խ�����ɾ�Ĳ�
//		{
//			say("next:"+it.next());
//		}
		
		for(String s:al)	//ֻ�ܻ�ȡԪ�أ������ܶԼ��Ͻ��в���
		{
			say(s);
		}

		//����
		int[] arr = {1,4,2,5};
		for(int i:arr)
		{
			say("i="+i);
		}
		
		//Map
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "value1");
		hm.put(2, "value2");
		hm.put(3, "value3");
		
		Set<Integer> keyset = hm.keySet();
		for(Integer i: keyset)
		{
			say(i+"::"+hm.get(i));
		}
		
		Set<Map.Entry<Integer, String>> entryset = hm.entrySet();
		for(Map.Entry<Integer, String> me :entryset)
		{
			say(me.getKey()+"----"+me.getValue());
		}
		
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
