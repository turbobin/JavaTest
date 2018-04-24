/*
 * 正则表达式的第四个功能。
 * 4，获取：将字符串中符合规则的子串取出。
 * 
 * 操作步骤：
 * 1，将正则表达式封装成对象。
 * 2，让正则对象和要操作的字符串相关联。
 * 3，关联后，获取正则匹配引擎。
 * 4，通过引擎对符合规则的子串进行操作，比如取出。
 */
import java.util.regex.*;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is an amazing tool";
		String regex = "\\b[a-z]{4}\\b"; //将字符数为4的单词取出
		
		//将规则封装成对象。
		Pattern p = Pattern.compile(regex);
		
		//让正则对象和要作用的字符串相关联。获取匹配器对象。
		Matcher m = p.matcher(str);
		
//		System.out.println(m.matches());//其实就是String类中的matches方法。
		
//		boolean b = m.find();//将规则作用到字符串上，并进行符合规则的子串查找。
//		System.out.println(b);
//		System.out.println(m.group());//用于获取匹配后的结果。
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println(m.start()+"..."+m.end());
		}
		

	}

}
