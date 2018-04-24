import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*
 * 创建一个窗口，实现菜单功能
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
		f = new Frame("记事本");
		f.setBounds(300,100,600,500);
//		f.setLayout(new FlowLayout());
		
		menubar = new MenuBar();
		filemenu = new Menu("文件");
		submenu = new Menu("子菜单");
		subitem1 = new MenuItem("子条目1");
		subitem2 = new MenuItem("子条目2");
		openitem = new MenuItem("打开");
		savaitem = new MenuItem("保存");
		closeitem = new MenuItem("退出");
		
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
		
		opendia = new FileDialog(f,"打开文件",FileDialog.LOAD);
		savedia = new FileDialog(f,"保存文件",FileDialog.SAVE);
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
				opendia.setVisible(true);//显示打开文件对话框
				
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
		
		//设置键盘快捷键
		ta.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S)
				{
					System.out.println("Ctrl + S:保存");
					savaFileFunction();
				}
//				System.out.println(e.getKeyChar()+"..."+e.getKeyCode());
			}
		});
		
	}
	
	/**
	 * 打开文件功能
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
			throw new RuntimeException("读取文件失败");
		}
	}
	
	/**
	 * 保存文件功能
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
			throw new RuntimeException("保存文件失败");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMenuDemo();

	}

}
