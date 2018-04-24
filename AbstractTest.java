/*
 *练习：
 *假如我们在开发一个系统时，需要对员工进行建模，员工包含3个属性：
 *姓名、工号、工资。经理也是员工，除了包含员工属性外，另还有一个奖金属性。
 *请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
 *
 *分析：
 *员工：name ID salary
 *经理：继承员工，并有自己特有的奖金属性 bonus
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
    
    public abstract void work();	//由于工作内容不同，工作需定义成抽象类
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
		// TODO 自动生成的方法存根
		new Maneger("张总","W134556",2000.00,1000.00);
//		new Employee("张员工","W134556",2000.00); //抽象类不能建立实例化对象。
		
	}

}
