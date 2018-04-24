import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*
 * �������壬ʵ��Ŀ¼��ѯ�Ĺ��ܣ�������Ŀ¼�����ڣ���������Ի���
 */

public class GuiTestDemo {
	//�����ͼ�����������������á�
	private Frame f;
	private Button b;
	private TextField tf;
	private TextArea ta;
	
	//����Ի���
	private Dialog dia;
	private Button okb;
	private Label lab;
	
	GuiTestDemo()
	{
		init();
	}
	
	public void init()
	{
		f = new Frame("Ŀ¼��ѯ��");
		//��frame���л������á�
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		
		//����ı���
		tf = new TextField(50);
		f.add(tf);
		
		b = new Button("ת��");
		//����ť��ӵ�frame��
		f.add(b);
		
		//����ı���
		ta = new TextArea(20,60);
		f.add(ta);
		
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
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				showDir();
			}
		});
		
//		//�����ı���ֻ��������
//		tf.addKeyListener(new KeyAdapter()
//		{
//			public void keyPressed(KeyEvent e) 
//			{
//				int code = e.getKeyCode();
//				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))
//				{
//					System.out.println(code+"����Ƿ�");
//					e.consume();
//				}
//			}
//			
//		});
		
		//�����¼�
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					showDir();
				}
//				System.out.println(e.getKeyChar()+"..."+e.getKeyCode());
			}
		});
		
		
		
	}
	private void showDir()
	{
		String dirPath = tf.getText();
		System.out.println(dirPath);
//		ta.append(dirPath+"\r\n");
		
		File dir = new File(dirPath);
		if(dir.exists() && dir.isDirectory())
		{
			ta.setText("");
			String[] names = dir.list();
			for(String name : names)
			{
				ta.append(name+"\r\n");
			}
		}else
		{
//			ta.setText("Ŀ¼�����ڣ����������룡"+"\r\n");
			//���ñ���Ի���
			dia = new Dialog(f,"��ʾ��Ϣ",true);
			dia.setBounds(450,250,250,100);
			dia.setLayout(new FlowLayout());
			lab = new Label("Ŀ¼"+dirPath+"�����ڣ����������룡");
			okb = new Button("ȷ��");
			dia.add(lab);
			dia.add(okb);
			
			dia.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					dia.setVisible(false);
				}
			});
			okb.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					dia.setVisible(false);
				}
			});
//			myEvent();
			dia.setVisible(true);
			
		}
//		tf.setText("");	//����ı���
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new GuiTestDemo();

	}

}
