/*
 * 需求：
 * 电脑运行实例，
 * 电脑运行基于主板。
 */
interface PCI
{
	public void open();
	public void close();
}
//主板基本功能
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}
	public void usePCI(PCI p) //PCI p =new NetCard();接口型引用指向自己的子类对象
	{
		if(p!= null)
		{
			p.open();
			p.close();
		}
	}
}
//扩展功能：插入网卡
class NetCard implements PCI
{
	public void open()
	{
		System.out.println("Netcard open");
	}
	public void close()
	{
		System.out.println("Netcard close");
	}
}
//扩展功能：插入声卡
class VioceCard implements PCI
{
	public void open()
	{
		System.out.println("Viocecard open");
	}
	public void close()
	{
		System.out.println("Viocecard close");
	}
	
}

public class DuoTaiTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MainBoard mb = new MainBoard();
		mb.run();
		mb.usePCI(null);	//空指针
		mb.usePCI(new NetCard());
		mb.usePCI(new VioceCard());

	}

}
