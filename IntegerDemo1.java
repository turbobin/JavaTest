/*
 * JDk1.5版本以后出现的新特性。
 */

public class IntegerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer x = new Integer(4);
		Integer x = 4;//自动装箱。 -->new Integer(4);
		
		x = x +2;	//x +2:进行自动拆箱。x.intValue() +2。变成了int类型，和2进行加法运算。
					//再将和进行装箱赋给x。
		
		say("x="+x);
		
		Integer m = 128;
		Integer n = 128;
		
		say("m==n:"+(m==n));	//结果为false
		
		Integer a = 127;
		Integer b = 127;
		
		say("a==b:"+(a==b));	//结果为true，因为a和b指向了同一个Integer对象。
						//因为当数值在byte范围内容，对于新特性，如果该数值已经存在，则不会再开辟新的空间。
		methon();
	}
	
	public static void methon()
	{
		Integer x = new Integer("123");
		Integer y = new Integer(123);
		
		say("x==y:"+(x==y));
		say("x.equals(y):"+x.equals(y));
		
	}
	public static void say(String str)
	{
		System.out.println(str);
	}

}


