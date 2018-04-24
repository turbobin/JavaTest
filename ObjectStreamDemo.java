/*
 * 把对象写到文件中，实现永久化存储
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
	 * 给类定义固定标识
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -2632654129612730829L;
	private String id;
	transient String username;	//堆内存中的变量如果不想被序列化，则需被transient修饰
	static String email = "caocb@sdc.com";	//静态不能被序列化
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