class Fu_1
{
	int num = 3;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
	public static void method4()
	{
		System.out.println("fu method_4");
	}
}

class Zi_1 extends Fu_1
{
	int num = 5;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_3");
	}
	public static void method4()
	{
		System.out.println("zi method_4");
	}
}
public class DuoTaiTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Fu_1 f = new Zi_1();
		System.out.println(f.num);	// 3
		f.method1();
		f.method2();
//		f.method3();	//����ʧ�ܣ�����������û��method3����
//		f.method4(); // fu method_4; ע��������̬�����Ѱ������࣬���������า��
		Fu_1.method4();
/* �ڶ�̬��Ա�к������ص㣺
 * �ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ����û�������ʧ�ܡ�
 * ������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
 * ���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�
 * 	
 * 
 * �ڶ�̬�г�Ա�������ص㣺
 * ���۱�������У����ο���ߣ������ͱ����������ࣩ��
 * 
 * �ڶ�̬�У���̬��Ա���ص㣺
 * ���۱�������У����ο����	
 */
		Zi_1 z = new Zi_1();
		System.out.println(z.num); 	// 5
		z.method1();  // zi method_1
		z.method2();  // fu method_2
		z.method3();  // zi method_3
//		z.method4();  // zi method_4	

	}

}
