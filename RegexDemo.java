/*
 * ������ʽ������һ������ı��ʽ��
 * ���ã�ר�������ַ���������
 * �ص㣺����һЩ�ض��ķ�������ʾһЩ��������������Ϳ��Լ���д��
 * ����ѧϰ������ʽ��������ѧϰһЩ������ŵ�ʹ�á�
 * 
 * �ô������Լ򻯶��ַ����ĸ��Ӳ�����
 * 
 * ����������ܣ�
 * 1��ƥ�䣺String matches�������ù���ƥ�������ַ�����ֻҪ��һ�������Ϲ���ƥ�����������false
 * 2,��֣�Split
 * 3���滻��replaceAll
 * 
 * eg:���󣺶�QQ�Ž��м��飺
 * Ҫ�󣺳��ȷ�Χ��5~15λ������0��ͷ��ֻ��������
 * 
 */
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ƥ���ַ�
//		checkQQ_1();
//		checkQQ();
//		checkTel();
		
		//����ַ�
//		splitDemo("����,����,����",",");//����','�������и�
//		splitDemo("����   ����       ����"," +");//���ն���ո��������и�
//		splitDemo("����.����.����","\\.");//����'.'�������и�,'.'�������б�ʾ�����ַ�����ת��
//		splitDemo("c:\\abc\\1.txt","\\\\");//����'\\'�������и�,��ת��
//		splitDemo("hahassheiheigggheheddddouou","(.)\\1+");//���յ��ʽ����и�
					//���Խ������װ��һ���顣��()��ɡ���ĳ��ֶ��б�š���1��ʼ����Ҫʹ�����е���
					//����ͨ��\n(n����ı��)����ʽ����ȡ��
		//�滻�ַ�
//		String str = "weirjnk2435235jjkjh5235235j5235";
//		replaceDemo(str,"\\d{4,}","#");//���ַ����е������滻��#
		
		String str1 = "hahassheiheigggheheddddouou";
		replaceDemo(str1,"(.)\\1+","*");//�������滻�ɡ�*����
		replaceDemo(str1,"(.)\\1+","$1");//�������滻�ɵ�����ĸ zzzzz->z.
		
		String str2="����....Ҫ....ѧѧ....��..��.��....�̳�";
		str2 = str2.replaceAll("\\.+","");//ȥ����.��
		str2 = str2.replaceAll("(.)\\1+","$1");//ֻ����һ���ظ��ĵ��ʡ�
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
		//ƥ���ֻ��ţ�13xxx��15xxxx��18xxxxx
		String tel ="18270914220";
		String telRegex = "1[358]\\d{9}";
		boolean flag = tel.matches(telRegex);
		if(flag)
			System.out.println("tel:"+tel);
		else
			System.out.println("�ֻ�������Ƿ�");
		
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
			System.out.println("qq������Ƿ�");
			
	}
	public static void checkQQ_1()	
	//���ַ�ʽʹ����String���еķ��������������������󣬵��Ǵ�����ڸ��ӡ�
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
					System.out.println("���ַ������ַ���");					
				}
			}
			else
			{
				System.out.println("������0��ͷ��");	
			}
		}
		else
		{
			System.out.println("���ȴ���");	
		}
	}

}
