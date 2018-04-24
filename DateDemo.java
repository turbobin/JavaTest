/*
 * Date����
 * 
 * ��ʽ�����ڣ�DateFormat (�����࣬���ܴ������󣬱���ʹ�������� -->SimpleDateFormat )
 * 
��ĸ  ���ڻ�ʱ��Ԫ��  ��ʾ  ʾ��  
G  Era ��־��  Text  AD  
y  ��  Year  1996; 96  
M  ���е��·�  Month  July; Jul; 07  
w  ���е�����  Number  27  
W  �·��е�����  Number  2  
D  ���е�����  Number  189  
d  �·��е�����  Number  10  
F  �·��е�����  Number  2  
E  �����е�����  Text  Tuesday; Tue  
a  Am/pm ���  Text  PM  
H  һ���е�Сʱ����0-23��  Number  0  
k  һ���е�Сʱ����1-24��  Number  24  
K  am/pm �е�Сʱ����0-11��  Number  0  
h  am/pm �е�Сʱ����1-12��  Number  12  
m  Сʱ�еķ�����  Number  30  
s  �����е�����  Number  55  
S  ������  Number  978  
z  ʱ��  General time zone  Pacific Standard Time; PST; GMT-08:00  
Z  ʱ��  RFC 822 time zone  -0800  

 * Calendar����,getInstance������ȡ
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
//		 System.out.println(c.get(Calendar.YEAR)+"��");
//		 System.out.println(c.get(Calendar.MONTH)+1+"��");
//		 System.out.println(c.get(Calendar.DAY_OF_MONTH)+"��");
//		 System.out.println("����"+(c.get(Calendar.DAY_OF_WEEK)-1));
//		 c.set(2019,4,15); 	//����2019��5��15�� ������
		 
		 printCalendar(c);
		 c.add(Calendar.DAY_OF_MONTH, -18);//���ص�ǰ����18��ǰ������
		 printCalendar(c);

	}
	public static void printCalendar(Calendar c)
	{
		
		//������������ڸ�ʽ��
		String [] months = {"1��","2��","3��","4��",
							"5��","6��","7��","8��",
							"9��","10��","11��","12��"
							};
		int index = c.get(Calendar.MONTH);
		
		String[] weeks = {"","������","����һ","���ڶ�","������","������",
						  "������","������"				
						};
		int index1 = c.get(Calendar.DAY_OF_WEEK);
		System.out.print(c.get(Calendar.YEAR)+"��");
		System.out.print(months[index]);
		System.out.print(c.get(Calendar.DAY_OF_MONTH)+"�� ");
		System.out.print(weeks[index1]);
		System.out.println();
	};

}
