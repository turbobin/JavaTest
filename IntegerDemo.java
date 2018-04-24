/*
 * 基本数据类型对象包装类
 * 
 * byte 	Byte
 * short	Short
 * int		Integer
 * long		Long
 * boolean	Boolean
 * float	Float
 * double	Double
 * char		Character
 * 
 * 基本数据类型对象包装类的最常见应用，
 * 就是用于基本数据类型和字符串类型之间做转换
 * 
 * 基本数据类型转成字符串。
 * 		基本数据类型+""
 * 		
 * 		基本数据类型.toString(基本数据类型值);
 * 		如 : Integer.toString(34); 将34 --> "34"
 * 
 * 字符串转成基本数据类型。
 * Integer i = new Integer("123");
 * int num = i.intValue();
 * 或
 * int a = Integer.parseInt("123");
 * long a = Long.parseLong("123");
 * double b = Double.parseDouble("12.33");
 * boolean c = Boolean.parseBoolean("true");
 * 
 * 十进制转成基本数据类型 。
 *		toBinaryString(); 
 *		toHexString(); 
 *		toOctalString(); 
 * 
 * 其他进制转成十进制
 * 		parseInt(String s,int radix)
 * 
 */
public class IntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//整数类型的最大值。
		say("int max:"+Integer.MAX_VALUE);
		
		//将一个字符串转成整数。
		
		int num = Integer.parseInt("123");//必须传入数字格式的字符串
		say("num="+num+4);
		
		//进制转换
		say(Integer.toBinaryString(-6));
		say(Integer.toHexString(60));
		
		int x = Integer.parseInt("110",8);//转成8进制
		say("x="+x);
		
	}
	
	public static void say(String str)
	{
		System.out.println(str);
	}

}
