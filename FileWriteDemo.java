/*
 * �ַ������ֽ�����
 * 
 * �ֽ����������ࣺ
 * inputStream ,  outputStream
 * 
 * �ַ����������ࣺ
 * Reader , Write
 */
import java.io.*;
public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file = new File("C:/Users/hmx/Desktop/aaa.txt");
//		System.out.println(file);
		FileWriter fw = new FileWriter("C:/Users/hmx/Desktop/aaa.txt");//�ļ������ڣ��ᱻ����
//		System.out.println(fw);
		//����write���������ַ���д�뵽����
//		fw.write("abcdefg\r\n");
//		fw.write("hahahah");
		
		
		//Ϊ������ַ�д����Ч�ʣ������˻��弼��
		BufferedWriter bufw = new  BufferedWriter(fw);
		bufw.write("abcdefg");
		bufw.newLine();//ͨ�û��з�
		bufw.write("hahahah");
		//�õ����������ǵ�Ҫˢ��
		bufw.flush();
		
		//�رջ���������ʵ�����ڹر�������
		bufw.close();
		
		//ˢ���������е� �����е����ݣ�����ˢ��Ŀ���ļ���
//		fw.flush();
		
		//�ر�����Դ���ر�֮ǰ��ˢ��һ���ڲ��Ļ���,�ر�֮�󲻿���д������
//		fw.close();
		

	}

}
