/*
 * �����������Ͷ����װ��
 * 
 * byte 	Byte
 * short	Short
 * int		Integer
 * long		Long
 * boolean	Boolean
 * float	Float
 * double	Double
 * char		Character
 * 
 * �����������Ͷ����װ������Ӧ�ã�
 * �������ڻ����������ͺ��ַ�������֮����ת��
 * 
 * ������������ת���ַ�����
 * 		������������+""
 * 		
 * 		������������.toString(������������ֵ);
 * 		�� : Integer.toString(34); ��34 --> "34"
 * 
 * �ַ���ת�ɻ����������͡�
 * Integer i = new Integer("123");
 * int num = i.intValue();
 * ��
 * int a = Integer.parseInt("123");
 * long a = Long.parseLong("123");
 * double b = Double.parseDouble("12.33");
 * boolean c = Boolean.parseBoolean("true");
 * 
 * ʮ����ת�ɻ����������� ��
 *		toBinaryString(); 
 *		toHexString(); 
 *		toOctalString(); 
 * 
 * ��������ת��ʮ����
 * 		parseInt(String s,int radix)
 * 
 */
public class IntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������͵����ֵ��
		say("int max:"+Integer.MAX_VALUE);
		
		//��һ���ַ���ת��������
		
		int num = Integer.parseInt("123");//���봫�����ָ�ʽ���ַ���
		say("num="+num+4);
		
		//����ת��
		say(Integer.toBinaryString(-6));
		say(Integer.toHexString(60));
		
		int x = Integer.parseInt("110",8);//ת��8����
		say("x="+x);
		
	}
	
	public static void say(String str)
	{
		System.out.println(str);
	}

}
