import java.awt.*;
import java.awt.event.*;

/*
 * 创建图形化界面：
 * 1，创建frame窗体。
 * 2，对窗体进行基本设置。如大小、位置、布局。
 * 3，定义组件。
 * 4，将组件通过窗体的add方法添加到窗体中。
 * 5，让窗体显示，通过setVisible(true)
 * 
 * 事件监听机制
 * 特点：
 * 1，事件源
 * 2，事件
 * 3，监听器
 * 4，事件处理
 * 
 * 事件源：就是Awt包或者Swing包中的那些图形界面组件
 * 事件：每一个事件源都有自己特有的对应事件和共性事件。
 * 监听器：将可以触发某一事件的动作（不止一个动作）都已经封装到了监听器中。
 * 
 * 以上三者，在java中都已经定义好了，直接获取其对象来用就可以了。
 * 
 * 我们要做的就是对产生的动作进行处理。
 */
public class AwtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("窗口1");	//创建窗体，并命名
		f.setSize(500,400);				//设置窗体长和宽
		f.setLocation(300,200);			//设置窗体弹出的位置，左边距300，上边距200
		f.setLayout(new FlowLayout());	//设置布局方式
		
		Button b = new Button("按钮");	//创建按钮
		f.add(b);						//添加按钮
		
//		f.addWindowListener(new Mywindow()); //关闭窗体
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Window closing..");
				System.exit(0);
			}
		});
		
		f.setVisible(true);				//显示窗体

	}

}

/*
 class Mywindow implements WindowListener
 {
 	//覆盖7个方法，可是我只用到了关闭的动作。
 	//其他动作都没有用到，可是却必须复写。
 }
 
 */

//因为WindowListener的子类WindowAdapter已经实现WindowListener接口，并覆盖了
//其中的所有方法，那么我只要继承WindowAdapter覆盖我需要的方法即可。
class Mywindow extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Window closing..");
		System.exit(0);
	}
}
