/*
 * ʹ�û�����copy�ļ������Ч��
 */
import java.io.*;
public class FileCopyText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		try
		{
			FileReader fr = 
					new FileReader("C:/Users/hmx/Desktop/MathDemo.java");
			FileWriter fw = 
					new FileWriter("C:/Users/hmx/Desktop/MathDemo.txt");
		    bufr = new BufferedReader(fr);
		    bufw = new BufferedWriter(fw);
		    String line = null;
		    while((line=bufr.readLine())!=null)//�����ļ�ĩβʱ������null,
											   //ע�⣺��ȡһ��ĩβ����������ֹ��
		    {
		    	bufw.write(line);
		    	bufw.newLine();
		    	bufw.flush();
		    }
		    
		}catch (IOException e)
		{
			throw new RuntimeException("��дʧ��");
		}finally
		{
			try{
				if(bufr!=null)
					bufr.close();
			}catch (IOException e)
			{
				throw new RuntimeException("��ȡʧ��");
			}
			
			try{
				if(bufw!=null)
					bufw.close();
			}catch (IOException e)
			{
				throw new RuntimeException("д��ʧ��");
			}
		}
		

	}
}


