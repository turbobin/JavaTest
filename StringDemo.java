
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";	//s1��һ�������ͱ�������abc����һ������
							//�ַ�������ص㣺һ������ʼ���Ͳ��ɱ��ı䡣
		
		String s2 = new String("abc");
		
		//S1��s2��ʲô����
		/*
		 * s1���ڴ�����һ������
		 * s2���ڴ�������������
		 */
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//String�ิд��Object����equals������
										  //�÷��������ж��ַ��� ���� �Ƿ���ͬ��

	}

}
