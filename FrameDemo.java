import java.awt.*;
import java.awt.event.*;

/*
 * 优化代码，将窗体设置与事件触发分离开
 */

public class FrameDemo {
	//定义该图形中所需的组件的引用。
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
		//对frame进行基本设置。
		f.setBounds(300, 100, 600, 500);
		f.setLayout(new FlowLayout());
		
		//添加文本框
		text = new TextField(20);
		f.add(text);
		
		b = new Button("Quit");
		//将按钮添加到frame中
		f.add(b);
		
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
		
		//让按钮具备退出程序的功能
		/*按钮就是事件源。
		 * 那么选择哪个监听器呢？
		 * 通过关闭窗示例了解到，想要知道哪个组件具备什么样的特有监听器，需要查看该
		 * 组件对象的具体功能。
		 * 查阅Button的描述，发现按钮有一个特有监听器addActionListener
		 */
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		//控制文本框只键入数字
		text.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e) 
			{
				int code = e.getKeyCode();
				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))
				{
					System.out.println(code+"输入非法");
					e.consume();
				}
			}
			
		});
		
		//键盘事件
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
		
		
		//鼠标事件
//		b.addMouseListener(new MouseAdapter()
//		{
//			private int count = 1;
//			public void mouseEntered(MouseEvent e)
//			{
//				System.out.println("鼠标进入到该组件"+count++);
//			}
//			
//			public void mouseClicked(MouseEvent e) 
//			{
//				if (e.getClickCount() == 2)
//					System.out.println("双击动作");
//				
//				System.out.println("点击动作");
//				
//			}
//		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new FrameDemo();

	}

}
