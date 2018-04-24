/*
 * Map���ϵ�����ȡ����ʽ��
 * 1��KeySet����map�����еļ����뵽Set���ϣ���ΪSet�߱���������
 * 	���Կ��Ե����ķ�ʽȡ�����еļ����ٸ���get������ȡÿһ������Ӧ��ֵ
 * 
 * 2��Set<Map.Entry<K,V>> entrySet():��map���ϵ�ӳ����뵽Set�����У�
 * 		�������ϵ���������;��ǣ�Map.Entry
 */
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("03", "lisi03");
		map.put("01", "lisi01");
		map.put("01", "lisi001");	//������ǰһ��keyֵ��ͬ��ֵ
		map.put("02", "lisi02");
		map.put("04", "lisi04");
		
		//�Ȼ�ȡmap���ϵ����м���Set���ϣ�KetSet();
		Set<String> keys = map.keySet();
		
		//����Set���ϣ��Ϳ��Ի�ȡ�����������Set��ʽȡ��Ԫ��
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = map.get(key);
			say(key+" , "+value);
		}
		
		
		//��Map�����е�ӳ���ϵȡ�������뵽Set�����С�
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> itt = entrySet.iterator();
		
		while(itt.hasNext())
		{
			Map.Entry<String, String> me = itt.next();
			
			//ͨ��Map.Entry�е����з���ȡ��
			String key = me.getKey();
			String value = me.getValue();
			
			say(key+":"+value);
		}
		
	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}
}

/* Map.Entry ��ʵҲ��һ���ӿڣ�����Map�е�һ���ڲ��ӿ�
 
interface Map
{
	public static interface Entry
	{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}

class HashMap implements Map
{
	class Haha implements Map.Entry
	{
		public Object getKey(){}
		public Object getValue(){}
	}
}
*/