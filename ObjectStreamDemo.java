/*
 * �Ѷ���д���ļ��У�ʵ�����û��洢
 */
import java.io.*;
public class ObjectStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		writeObj();
		readObj();

	}
	
	public static void readObj() throws IOException, ClassNotFoundException
	{
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("Account.Object"));
		Account acc = (Account) ois.readObject();
		System.out.println(acc);
		
		ois.close();
		
	}
	
	
	public static void writeObj() throws IOException
	{
		ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("Account.Object"));
		oos.writeObject(new Account("1571616014","turbobin","ccb@sdc.com"));
		
		oos.close();
	}

}

class Account implements Serializable
{
	/**
	 * ���ඨ��̶���ʶ
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -2632654129612730829L;
	private String id;
	transient String username;	//���ڴ��еı���������뱻���л������豻transient����
	static String email = "caocb@sdc.com";	//��̬���ܱ����л�
	Account(String id,String username,String email)
	{
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
	public String toString()
	{
		return username + ":" + id + "," + email;
	}
}