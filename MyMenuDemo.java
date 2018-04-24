import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*
 * ����һ�����ڣ�ʵ�ֲ˵�����
 */
public class MyMenuDemo {
	
	private Frame f;
	private MenuBar menubar;
	private Menu filemenu;
	private MenuItem closeitem;
	private MenuItem openitem;
	private MenuItem savaitem;
	private MenuItem submenu;
	private MenuItem subitem1;
	private MenuItem subitem2;
	
	private FileDialog opendia;
	private FileDialog savedia;
	
	private TextArea ta;
	private File file;
	
	MyMenuDemo()
	{
		init();
	}
	public void init()
	{
		f = new Frame("���±�");
		f.setBounds(300,100,600,500);
//		f.setLayout(new FlowLayout());
		
		menubar = new MenuBar();
		filemenu = new Menu("�ļ�");
		submenu = new Menu("�Ӳ˵�");
		subitem1 = new MenuItem("����Ŀ1");
		subitem2 = new MenuItem("����Ŀ2");
		openitem = new MenuItem("��");
		savaitem = new MenuItem("����");
		closeitem = new MenuItem("�˳�");
		
		ta = new TextArea();
		f.add(ta);
		
		f.setMenuBar(menubar);
		menubar.add(filemenu);
		filemenu.add(openitem);
		filemenu.add(savaitem);
		((Menu) submenu).add(subitem1);
		((Menu) submenu).add(subitem2);
		filemenu.add(submenu);
		filemenu.add(closeitem);
		
		myEvent();
		
		f.setVisible(true);
		
		opendia = new FileDialog(f,"���ļ�",FileDialog.LOAD);
		savedia = new FileDialog(f,"�����ļ�",FileDialog.SAVE);
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
		closeitem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		openitem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				opendia.setVisible(true);//��ʾ���ļ��Ի���
				
				openFileFunction();
				
			}
		});
		
		savaitem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				savaFileFunction();
				
			}
		});
		
		//���ü��̿�ݼ�
		ta.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S)
				{
					System.out.println("Ctrl + S:����");
					savaFileFunction();
				}
//				System.out.println(e.getKeyChar()+"..."+e.getKeyCode());
			}
		});
		
	}
	
	/**
	 * ���ļ�����
	 */
	private void openFileFunction()
	{
		String dirPath = opendia.getDirectory();
		String fileName = opendia.getFile();
		
		if(dirPath == null || fileName == null)
			return;
		
		ta.setText("");
		file = new File(dirPath,fileName);
		
		try
		{
			BufferedReader bufrd = new BufferedReader(new FileReader(file));
			String line =null;
			while((line=bufrd.readLine())!=null)
			{
				ta.append(line+"\r\n");
			}
		}catch(IOException exp)
		{
			throw new RuntimeException("��ȡ�ļ�ʧ��");
		}
	}
	
	/**
	 * �����ļ�����
	 */
	private void savaFileFunction()
	{
		if(file==null)
		{
			savedia.setVisible(true);
			String dirPath = savedia.getDirectory();
			String fileName = savedia.getFile();
			
			if(dirPath == null || fileName == null)
				return;
			
			file = new File(dirPath,fileName);
			
		}
		
		try{
			BufferedWriter bufwt= new BufferedWriter(new FileWriter(file));
			String text = ta.getText();
			
			bufwt.write(text);
			bufwt.flush();
			bufwt.close();
			
		}catch(IOException exp)
		{
			throw new RuntimeException("�����ļ�ʧ��");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMenuDemo();

	}

}
