/*
 * �ڲ��ඨ���ھֲ�ʱ��
 * 1�������Ա���Ա���η�����
 * 2������ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ���е�����
 * 		���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�������
 */
class Outer
{
	int x = 3;
	void method(final int a)
	{
//		int x = 4;
		final int y= 4;
		class Inner
		{
			void function()
			{
				System.out.println(Outer.this.x+a+y);
			}
		}
		new Inner().function();
	}
}

public class InnerClassDemo1 {

	public static void main(String[] args) {
		new Outer().method(7);
		new Outer().method(8);

	}

}
