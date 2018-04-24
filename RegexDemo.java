/*
 * 正则表达式：符合一定规则的表达式。
 * 作用：专门用于字符串操作。
 * 特点：用于一些特定的符号来表示一些代码操作。这样就可以简化书写。
 * 所以学习正则表达式，就是在学习一些特殊符号的使用。
 * 
 * 好处：可以简化对字符串的复杂操作。
 * 
 * 具体操作功能：
 * 1，匹配：String matches方法。用规则匹配整个字符串，只要有一处不符合规则，匹配结束，返回false
 * 2,拆分：Split
 * 3，替换：replaceAll
 * 
 * eg:需求：对QQ号进行检验：
 * 要求：长度范围：5~15位，不能0开头，只能是数字
 * 
 */
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//匹配字符
//		checkQQ_1();
//		checkQQ();
//		checkTel();
		
		//拆分字符
//		splitDemo("张三,李四,王五",",");//按照','来进行切割
//		splitDemo("张三   李四       王五"," +");//按照多个空格来进行切割
//		splitDemo("张三.李四.王五","\\.");//按照'.'来进行切割,'.'在正则中表示任意字符，需转义
//		splitDemo("c:\\abc\\1.txt","\\\\");//按照'\\'来进行切割,需转义
//		splitDemo("hahassheiheigggheheddddouou","(.)\\1+");//按照叠词进行切割
					//可以将规则封装成一个组。用()完成。组的出现都有编号。从1开始，想要使用已有的组
					//可以通过\n(n是组的编号)的形式来获取。
		//替换字符
//		String str = "weirjnk2435235jjkjh5235235j5235";
//		replaceDemo(str,"\\d{4,}","#");//将字符串中的数字替换成#
		
		String str1 = "hahassheiheigggheheddddouou";
		replaceDemo(str1,"(.)\\1+","*");//将叠词替换成“*”。
		replaceDemo(str1,"(.)\\1+","$1");//将叠词替换成单个字母 zzzzz->z.
		
		String str2="我我....要....学学....编..编.编....程程";
		str2 = str2.replaceAll("\\.+","");//去掉‘.’
		str2 = str2.replaceAll("(.)\\1+","$1");//只保留一个重复的叠词。
		System.out.println(str2);
		
		
		
	}
	public static void replaceDemo(String str,String regex,String newstr)
	{
		str = str.replaceAll(regex, newstr);
		System.out.println(str);
	}
	public static void splitDemo(String str,String regex)
	{
		String[] arr = str.split(regex);
		
		for(String s : arr)
			System.out.println(s);
	}
	
	public static void checkTel()
	{
		//匹配手机号：13xxx，15xxxx，18xxxxx
		String tel ="18270914220";
		String telRegex = "1[358]\\d{9}";
		boolean flag = tel.matches(telRegex);
		if(flag)
			System.out.println("tel:"+tel);
		else
			System.out.println("手机号输入非法");
		
	}
	public static void checkQQ()
	{
		String qq = "132121111111111";
//		String regex = "[1-9][0-9]{4,14}";
		String regex = "[1-9]\\d{4,14}";
		boolean flag = qq.matches(regex);
		if(flag)
			System.out.println("qq:"+qq);
		else
			System.out.println("qq号输入非法");
			
	}
	public static void checkQQ_1()	
	//这种方式使用了String类中的方法，进行组合完成了需求，但是代码过于复杂。
	{
		String qq = "12234215445";
		int len = qq.length();
		if(len>5 && len<15)
		{
			if(!qq.startsWith("0"))
			{
				try
				{
					Long l = Long.parseLong(qq);
					System.out.println("qq:"+l);
					
				}catch(NumberFormatException e)
				{
					System.out.println("出现非数字字符！");					
				}
			}
			else
			{
				System.out.println("不能以0开头！");	
			}
		}
		else
		{
			System.out.println("长度错误！");	
		}
	}

}
