/*
 * public static void main(String[] args)
 * ����������һ������ĺ�������Ϊ�������ڣ����Ա�JVM���á�
 * 
 * �������Ķ��壺
 * public:����ú����ķ���Ȩ�������ġ�
 * static:�������Ǿ�̬����������������������ļ��ض����ء�
 * void��������û�о��巵��ֵ
 * main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
 * ��String[] args:�����Ĳ���������������һ���ַ��� ���͵�����;args���������
 * 
 * �������ǹ̶���ʽ�� ��JVMʶ��
 * JVM�ڵ�����������ʱ���������new String[0]
 */
public class MainDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] arr = {"haha","hehe","xixi"};
		MainTest.main(arr);
		
	}
}
class MainTest
{
	public static void main(String[] args)
	{
		System.out.println(args.length);
		for(int x=0; x<args.length; x++)
		{
			System.out.println(args[x]);
			
		}
	}

}
