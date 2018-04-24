/*
 * Math对象，Random对象
 */
import java.util.*;
public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d  =Math.ceil(-13.14);	//返回大于等于指定值的最小整数。
		double d1  =Math.floor(-13.14);	//返回小于等于指定值的最大整数。
		double d2  =Math.round(13.54);	//四舍五入
		double d3  =Math.pow(2,3);	//2的3次方
		say("d="+d);
		say("d1="+d1);
		say("d2="+d2);
		say("d3="+d3);
		
		Random ra = new Random();
		//随机数
		for(int x=1;x<10;x++)
		{
//			double r = Math.random();
//			int r = (int)(Math.random()*10+1);	//获取1~10的随机数，与util包中Random对象相同
			int r = ra.nextInt(10)+1;
			say(r);
		}

	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
