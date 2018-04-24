/*
 * Date对象
 * 
 * 格式化日期：DateFormat (抽象类，不能创建对象，必须使用其子类 -->SimpleDateFormat )
 * 
字母  日期或时间元素  表示  示例  
G  Era 标志符  Text  AD  
y  年  Year  1996; 96  
M  年中的月份  Month  July; Jul; 07  
w  年中的周数  Number  27  
W  月份中的周数  Number  2  
D  年中的天数  Number  189  
d  月份中的天数  Number  10  
F  月份中的星期  Number  2  
E  星期中的天数  Text  Tuesday; Tue  
a  Am/pm 标记  Text  PM  
H  一天中的小时数（0-23）  Number  0  
k  一天中的小时数（1-24）  Number  24  
K  am/pm 中的小时数（0-11）  Number  0  
h  am/pm 中的小时数（1-12）  Number  12  
m  小时中的分钟数  Number  30  
s  分钟中的秒数  Number  55  
S  毫秒数  Number  978  
z  时区  General time zone  Pacific Standard Time; PST; GMT-08:00  
Z  时区  RFC 822 time zone  -0800  

 * Calendar对象,getInstance方法获取
 *
 */
import java.text.*;
import java.util.*;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Date d = new Date();
		 System.out.println(d);
		 
		 DateFormat datefmt = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		 String date = datefmt.format(d);
		 System.out.println(date);
		 
		 Calendar c = Calendar.getInstance();
		 System.out.println(c);
//		 System.out.println(c.get(Calendar.YEAR)+"年");
//		 System.out.println(c.get(Calendar.MONTH)+1+"月");
//		 System.out.println(c.get(Calendar.DAY_OF_MONTH)+"日");
//		 System.out.println("星期"+(c.get(Calendar.DAY_OF_WEEK)-1));
//		 c.set(2019,4,15); 	//返回2019年5月15日 星期三
		 
		 printCalendar(c);
		 c.add(Calendar.DAY_OF_MONTH, -18);//返回当前日期18天前的日期
		 printCalendar(c);

	}
	public static void printCalendar(Calendar c)
	{
		
		//查表法，设置日期格式。
		String [] months = {"1月","2月","3月","4月",
							"5月","6月","7月","8月",
							"9月","10月","11月","12月"
							};
		int index = c.get(Calendar.MONTH);
		
		String[] weeks = {"","星期日","星期一","星期二","星期三","星期四",
						  "星期五","星期六"				
						};
		int index1 = c.get(Calendar.DAY_OF_WEEK);
		System.out.print(c.get(Calendar.YEAR)+"年");
		System.out.print(months[index]);
		System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日 ");
		System.out.print(weeks[index1]);
		System.out.println();
	};

}
