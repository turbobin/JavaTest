/*
 * ������ʽ�ĵ��ĸ����ܡ�
 * 4����ȡ�����ַ����з��Ϲ�����Ӵ�ȡ����
 * 
 * �������裺
 * 1����������ʽ��װ�ɶ���
 * 2������������Ҫ�������ַ����������
 * 3�������󣬻�ȡ����ƥ�����档
 * 4��ͨ������Է��Ϲ�����Ӵ����в���������ȡ����
 */
import java.util.regex.*;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is an amazing tool";
		String regex = "\\b[a-z]{4}\\b"; //���ַ���Ϊ4�ĵ���ȡ��
		
		//�������װ�ɶ���
		Pattern p = Pattern.compile(regex);
		
		//����������Ҫ���õ��ַ������������ȡƥ��������
		Matcher m = p.matcher(str);
		
//		System.out.println(m.matches());//��ʵ����String���е�matches������
		
//		boolean b = m.find();//���������õ��ַ����ϣ������з��Ϲ�����Ӵ����ҡ�
//		System.out.println(b);
//		System.out.println(m.group());//���ڻ�ȡƥ���Ľ����
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println(m.start()+"..."+m.end());
		}
		

	}

}
