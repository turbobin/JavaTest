/*
 * Math����Random����
 */
import java.util.*;
public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d  =Math.ceil(-13.14);	//���ش��ڵ���ָ��ֵ����С������
		double d1  =Math.floor(-13.14);	//����С�ڵ���ָ��ֵ�����������
		double d2  =Math.round(13.54);	//��������
		double d3  =Math.pow(2,3);	//2��3�η�
		say("d="+d);
		say("d1="+d1);
		say("d2="+d2);
		say("d3="+d3);
		
		Random ra = new Random();
		//�����
		for(int x=1;x<10;x++)
		{
//			double r = Math.random();
//			int r = (int)(Math.random()*10+1);	//��ȡ1~10�����������util����Random������ͬ
			int r = ra.nextInt(10)+1;
			say(r);
		}

	}
	
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
