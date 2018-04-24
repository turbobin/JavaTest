import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*
 * 创建窗体，实现目录查询的功能，如输入目录不存在，弹出报错对话框
 */

public class GuiTestDemo {
	//定义该图形中所需的组件的引用。
	private Frame f;
	private Button b;
	private TextField tf;
	private TextArea ta;
	
	//定义对话框
	private Dialog dia;
	private Button okb;
	private Label lab;
	
	GuiTestDemo()
	{
		init();
	}
	
	public void init()
	{
		f = new Frame("目录查询器");
		//对frame进行基本设置。
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		
		//添加文本框
		tf = new TextField(50);
		f.add(tf);
		
		b = new Button("转到");
		//将按钮添加到frame中
		f.add(b);
		
		//添加文本框
		ta = new TextArea(20,60);
		f.add(ta);
		
		//加载一下窗体事件
		myEvent();
		//显示窗体
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
		
//		//控制文本框只键入数字
//		tf.addKeyListener(new KeyAdapter()
//		{
//			public void keyPressed(KeyEvent e) 
//			{
//				int code = e.getKeyCode();
//				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))
//				{
//					System.out.println(code+"输入非法");
//					e.consume();
//				}
//			}
//			
//		});
		
		//键盘事件
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
//			ta.setText("目录不存在，请重新输入！"+"\r\n");
			//设置报错对话框
			dia = new Dialog(f,"提示信息",true);
			dia.setBounds(450,250,250,100);
			dia.setLayout(new FlowLayout());
			lab = new Label("目录"+dirPath+"不存在，请重新输入！");
			okb = new Button("确定");
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
//		tf.setText("");	//清空文本框
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new GuiTestDemo();

	}

}
