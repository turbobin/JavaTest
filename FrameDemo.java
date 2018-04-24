import java.awt.*;
import java.awt.event.*;

/*
 * �Ż����룬�������������¼��������뿪
 */

public class FrameDemo {
	//�����ͼ�����������������á�
	private Frame f;
	private Button b;
	private TextField text;
	
	FrameDemo()
	{
		init();
	}
	
	public void init()
	{
		f = new Frame("my frame");
		//��frame���л������á�
		f.setBounds(300, 100, 600, 500);
		f.setLayout(new FlowLayout());
		
		//����ı���
		text = new TextField(20);
		f.add(text);
		
		b = new Button("Quit");
		//����ť��ӵ�frame��
		f.add(b);
		
		//����һ�´����¼�
		myEvent();
		//��ʾ����
		f.setVisible(true);
	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		//�ð�ť�߱��˳�����Ĺ���
		/*��ť�����¼�Դ��
		 * ��ôѡ���ĸ��������أ�
		 * ͨ���رմ�ʾ���˽⵽����Ҫ֪���ĸ�����߱�ʲô�������м���������Ҫ�鿴��
		 * �������ľ��幦�ܡ�
		 * ����Button�����������ְ�ť��һ�����м�����addActionListener
		 */
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		//�����ı���ֻ��������
		text.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e) 
			{
				int code = e.getKeyCode();
				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))
				{
					System.out.println(code+"����Ƿ�");
					e.consume();
				}
			}
			
		});
		
		//�����¼�
		b.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					System.out.println("Ctrl + Enter:quit");
					System.exit(0);
				}
//				System.out.println(e.getKeyChar()+"..."+e.getKeyCode());
			}
		});
		
		
		//����¼�
//		b.addMouseListener(new MouseAdapter()
//		{
//			private int count = 1;
//			public void mouseEntered(MouseEvent e)
//			{
//				System.out.println("�����뵽�����"+count++);
//			}
//			
//			public void mouseClicked(MouseEvent e) 
//			{
//				if (e.getClickCount() == 2)
//					System.out.println("˫������");
//				
//				System.out.println("�������");
//				
//			}
//		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new FrameDemo();

	}

}
