import java.util.Arrays;

/*
 * JDK1.5�汾���ֵ�������
 * ���ն������
 * �����Ŀɱ������ע�⣺�ɱ����һ��Ҫ�������б�������
 */
public class MoreParmMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show("haha",1,2,3,45,3);
		

	}
	public static void show(String str,int...arr)
	{
		System.out.println(str+"...."+Arrays.toString(arr));
	}

}
