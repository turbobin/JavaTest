/*
 * JDk1.5�汾�Ժ���ֵ������ԡ�
 */

public class IntegerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer x = new Integer(4);
		Integer x = 4;//�Զ�װ�䡣 -->new Integer(4);
		
		x = x +2;	//x +2:�����Զ����䡣x.intValue() +2�������int���ͣ���2���мӷ����㡣
					//�ٽ��ͽ���װ�丳��x��
		
		say("x="+x);
		
		Integer m = 128;
		Integer n = 128;
		
		say("m==n:"+(m==n));	//���Ϊfalse
		
		Integer a = 127;
		Integer b = 127;
		
		say("a==b:"+(a==b));	//���Ϊtrue����Ϊa��bָ����ͬһ��Integer����
						//��Ϊ����ֵ��byte��Χ���ݣ����������ԣ��������ֵ�Ѿ����ڣ��򲻻��ٿ����µĿռ䡣
		methon();
	}
	
	public static void methon()
	{
		Integer x = new Integer("123");
		Integer y = new Integer(123);
		
		say("x==y:"+(x==y));
		say("x.equals(y):"+x.equals(y));
		
	}
	public static void say(String str)
	{
		System.out.println(str);
	}

}


