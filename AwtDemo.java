import java.awt.*;
import java.awt.event.*;

/*
 * ����ͼ�λ����棺
 * 1������frame���塣
 * 2���Դ�����л������á����С��λ�á����֡�
 * 3�����������
 * 4�������ͨ�������add������ӵ������С�
 * 5���ô�����ʾ��ͨ��setVisible(true)
 * 
 * �¼���������
 * �ص㣺
 * 1���¼�Դ
 * 2���¼�
 * 3��������
 * 4���¼�����
 * 
 * �¼�Դ������Awt������Swing���е���Щͼ�ν������
 * �¼���ÿһ���¼�Դ�����Լ����еĶ�Ӧ�¼��͹����¼���
 * �������������Դ���ĳһ�¼��Ķ�������ֹһ�����������Ѿ���װ���˼������С�
 * 
 * �������ߣ���java�ж��Ѿ�������ˣ�ֱ�ӻ�ȡ��������þͿ����ˡ�
 * 
 * ����Ҫ���ľ��ǶԲ����Ķ������д���
 */
public class AwtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("����1");	//�������壬������
		f.setSize(500,400);				//���ô��峤�Ϳ�
		f.setLocation(300,200);			//���ô��嵯����λ�ã���߾�300���ϱ߾�200
		f.setLayout(new FlowLayout());	//���ò��ַ�ʽ
		
		Button b = new Button("��ť");	//������ť
		f.add(b);						//��Ӱ�ť
		
//		f.addWindowListener(new Mywindow()); //�رմ���
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Window closing..");
				System.exit(0);
			}
		});
		
		f.setVisible(true);				//��ʾ����

	}

}

/*
 class Mywindow implements WindowListener
 {
 	//����7��������������ֻ�õ��˹رյĶ�����
 	//����������û���õ�������ȴ���븴д��
 }
 
 */

//��ΪWindowListener������WindowAdapter�Ѿ�ʵ��WindowListener�ӿڣ���������
//���е����з�������ô��ֻҪ�̳�WindowAdapter��������Ҫ�ķ������ɡ�
class Mywindow extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Window closing..");
		System.exit(0);
	}
}
