/*
 *��ϰ��
 *���������ڿ���һ��ϵͳʱ����Ҫ��Ա�����н�ģ��Ա������3�����ԣ�
 *���������š����ʡ�����Ҳ��Ա�������˰���Ա�������⣬����һ���������ԡ�
 *��ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
 *
 *������
 *Ա����name ID salary
 *�����̳�Ա���������Լ����еĽ������� bonus
 */

abstract class Employee
{
	private String name;
	private String ID;
	private double salary;
	
    Employee(String name,String ID,double salary)
	{
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}
    
    public abstract void work();	//���ڹ������ݲ�ͬ�������趨��ɳ�����
}

class Maneger extends Employee
{
	private double bonus;
	Maneger(String name,String ID,double salary,double bonus)
	{
		
		super(name,ID,salary);
		this.bonus = bonus;
	}
	
	public void work()
	{
		System.out.println("maneger's work");
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Maneger("����","W134556",2000.00,1000.00);
//		new Employee("��Ա��","W134556",2000.00); //�����಻�ܽ���ʵ��������
		
	}

}
