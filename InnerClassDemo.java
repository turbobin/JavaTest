/*
 * �ڲ���ķ��ʹ���
 * 1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�У���Ϊ˽��ֻ���ⲿ����Ч��
 * 	֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ������ã���ʽ���ⲿ����.this
 * 2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������
 * 
 * �����ڲ����ʽ��
 * 1, ���ڲ��ඨ���ڳ�Ա��λ���ϣ����ҷǾ�̬����˽�У������������н����ڲ������
 * ��ʽ���ⲿ����.�ڲ�����  ������ = new �ⲿ����().new �ڲ�����();
 * 		 OutClass.InClass in = new OutClass().new InClass();
 *2�����ڲ��ඨ���ڳ�Ա��λ���ϣ�
 * ��private����ʱ���ڲ��౻��װ�������ⲿ���ж�����ʷ�������ӷ��ʣ���
 * 
 * ��static����ʱ��ֻ��ֱ�ӷ����ⲿ���еľ�̬��Ա�������˷��ʾ��ޡ�
 * ��������ֱ�ӷ���static�ڲ����еķǾ�̬��Ա ��new OutClass.InClass().function();
 * ��������ֱ�ӷ���static�ڲ����еľ�̬��Ա ��OutClass.InClass.function();
 * 
 * ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ��������static�ģ�
 * 		���ⲿ���еľ�̬���������ڲ���ʱ���ڲ���Ҳ������static��
 */

class OutClass
{
	private int x = 3;
	
	class InClass	//�ڲ���
	{
		int x = 4;
		void function()
		{
			int x = 5;
			System.out.println("function..."+x);//��ӡ 5
			System.out.println("function..."+this.x);//��ӡ 4
			System.out.println("function..."+OutClass.this.x);//��ӡ 3
			method();
		}
	}
	void method()
	{
		System.out.println("method..."+x);
	}
	
	void getInClass()
	{
		InClass in = new InClass();
		in.function();
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��η����ڲ����еĳ�Ա��
		//����һ�������ⲿ��������ⲿ���н��������ڲ���ķ���
		OutClass out = new OutClass();
		out.getInClass();
		
//		new OutClass.InClass().function();//��x�������ڲ��඼��static����ʱ�������ڲ��෽����ʽ
		//�������������ڲ������ֱ�ӷ���(�ڲ���Ȩ�޲�Ϊprivate,�ҷǾ�̬ʱ)
		OutClass.InClass in = new OutClass().new InClass();//�����ⲿ�࣬�����ڲ���
		in.function();
		
		

	}

}
