/*
 * 需求:获取一段程序运行时间。
 * 原理：获取程序开始和结束时间并相减即可。
 * 
 * 获取时间：查找API文档, 调用System.currentTimeMillis();
 * 
 */

abstract class GetTime
{
	public final void getTime()	//为防止此类主要方法被复写，加修饰符final
	{
		long starttime = System.currentTimeMillis();
		runcode();
		long endtime = System.currentTimeMillis();
		System.out.println("毫秒： "+(endtime-starttime));
	}
	
	public abstract void runcode();	//子类的运行代码不确定，可将父类公共方法抽象出来
//	public void runcode()
//	{
//		for(int i=1; i<100; i++) 
//		{
//			System.out.print(i+" ");
//			if(i == 99)
//				System.out.println();
//		}
//			
//	}
}

class SubTime extends GetTime
{
	public void runcode()
	{
		for(int i=1; i<=50; i++) 
		{
			System.out.print(i+" ");
			if(i == 50)
				System.out.println();
		}
	}
}
public class TemplateDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new SubTime().getTime();

	}

}
