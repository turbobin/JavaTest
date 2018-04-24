/*
 * ����
 * ��������ʵ����
 * �������л������塣
 */
interface PCI
{
	public void open();
	public void close();
}
//�����������
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}
	public void usePCI(PCI p) //PCI p =new NetCard();�ӿ�������ָ���Լ����������
	{
		if(p!= null)
		{
			p.open();
			p.close();
		}
	}
}
//��չ���ܣ���������
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
//��չ���ܣ���������
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
		// TODO �Զ����ɵķ������
		MainBoard mb = new MainBoard();
		mb.run();
		mb.usePCI(null);	//��ָ��
		mb.usePCI(new NetCard());
		mb.usePCI(new VioceCard());

	}

}
