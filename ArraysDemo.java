/*
 * Arrays:���ڲ�������Ĺ����ࡣ
 * ���涼�Ǿ�̬������
 * asList:��������list����
 * ������ʹ�ü��ϵ���ɾ��������Ϊ����ĳ����ǹ̶��ġ�
 */
import java.util.*;
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������ַ������
//		int[] arr = {1,4,6,32};
//		say(Arrays.toString(arr));
		
		String[] arr = {"ni","zai","gan","shen","me"};
		/*
		 * ��������list���Ϻ󣬿����ü��ϵ�˼��ͷ��������������е�Ԫ��
		 */
		List<String> list = Arrays.asList(arr);
		say(list);
		
//		int[] nums = {1,3,3,6};
//		List<int[]> li = Arrays.asList(nums);
//		say(li);	//[[I@1db9742]   ���ع�ϣֵ
		
		Integer[] nums = {1,3,3,6};
		List<Integer> li  = Arrays.asList(nums);
		say(li);	//[1, 3, 3, 6]
		/*
		 * ��������е�Ԫ�ض��Ƕ�����ô��ɼ���ʱ�������е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ�ء�
		 * ��������е�Ԫ���ǻ����������ͣ���ô�Ὣ��������Ϊ�����е�Ԫ�ش��ڡ�
		 */
	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
