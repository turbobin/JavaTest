/*
 * Map���ϣ��ü��ϴ洢��ֵ�ԣ�һ��һ����档����Ҫ��֤���ݵ�Ψһ�ԡ�
 * 	1����ӡ�
 * 		put(K key, V value) 
 * 		putAll(Map<? extends K,? extends V> m) 
 * 		
 *  2��ɾ����
 *  	clear()
 *  	remove(Object Key)
 *  
 *  3���ж�
 *  	containsKey(Object key) 
 *  	containsValue(Object value)
 *  
 *  4����ȡ��
 *  	get(Object key) 
 *  	size()
 *  	values() 
 *  
 *  
 *  	entrySet() 
 *  	keySet() 
 *  
 *  Map
 *  	|--Hashtable���ײ��ǹ�ϣ�����ݽṹ�������Դ���null����nullֵ���ü������߳�ͬ���ġ�JDK1.0��Ч�ʵ�
 *  	|--HashMap���ײ��ǹ�ϣ�����ݽṹ������ʹ��null����nullֵ���ü����ǲ�ͬ���ġ�JDK1.2��Ч�ʸ�
 *  	|--TreeMap���ײ��Ƕ��������ݽṹ���̲߳�ͬ���ġ����Ը�Map�����еļ�����
 *  
 *  ��Set����Set�ײ����ʹ����Map����
 */
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		//���Ԫ�أ����ʱ����������ͬ�ļ�����ô����ӵļ��Ḳ��ԭ�еļ�ֵ��
		//put����������ǰ�� key ������ֵ
		map.put(01, "zhangsan1");
		say(map.put(03, "zhangsan2"));	//����null
		say(map.put(03, "zhangsan3"));	//����ǰһ��ֵ������zhangsan2
		map.put(05, "zhangsan4");
		map.put(02, "zhangsan3");
		
		say("containsKey:"+map.containsKey(05));	//true,��key�����ڣ�����false
		
		say("get:"+map.get(05));
		
		map.put(04,null);	//���Դ���ɹ�
		
		say("get:"+map.get(04));//����ͨ��get�����ķ���ֵ�ж�һ�����Ƿ���ڡ�ͨ������null���жϡ�(ע���������)
		
		//��ȡmap���������е�ֵ
		Collection<String> coll = map.values();
		say(coll);
		say(map);	//{1=zhangsan1, 2=zhangsan3, 3=zhangsan2, 4=null, 5=zhangsan4}

	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
