/*
 * �����ڲ��ࣺ
 * 1�������ڲ�����ʵ�����ڲ���ļ�д��ʽ��
 * 2�����������ڲ����ǰ�᣺
 * 	�ڲ�������Ǽ̳�һ�������ʵ�ֽӿڡ�
 * 3�������ڲ���ĸ�ʽ��new �����ӿ�(){�������������}
 * 4�������ڲ������һ������������󣬿������Ϊ�����ݵĶ���
 * 5�������ڲ����ж���ķ�����ò�Ҫ����3����
 */

abstract class AbsDemo
{
	abstract void show();
}

class OuterClass
{
	int x= 3;
//	class InnerClass extends AbsDemo
//	{
//		void show()
//		{
//			System.out.println("show:"+x);
//		}
//	}
	
	public void function()
	{
//		new InnerClass().show();
		
		new AbsDemo() 	//�����ڲ��࣬�ø�������������
		{
			void show()	//��������
			{
				System.out.println("x="+x);
			}
			void abc()
			{
				System.out.println("hha");
			}
		}.abc();
		AbsDemo d = new AbsDemo() 	//�����ڲ��࣬�ø������������󣬲�ָ��������
		{
			void show()	//��������
			{
				System.out.println("x="+x);
			}
			void abc()
			{
				System.out.println("hha");
			}
		};
		d.show();
//		d.abc()	//����ʧ�ܣ���������û�д˷��������ɵ���
	}
}
public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new OuterClass().new InnerClass().show();
		new OuterClass().function();

	}

}
