/*
 * �����ࣺ
 * ������Ҫ�����������������Ͳ�ȷ��ʱ�����ڶ���Object�������չ��
 * ���ڶ��巺���������չ,������ǿת����
 */
/*
class Utils
{
	private Object obj;
	public  void setObject(Object e)
	{
		this.obj = obj;
	}
	public Object getObject()
	{
		return obj;
	}
}
*/
//class Utils<E>
//{
//	private E e;
//	public  void setObject(E e)
//	{
//		this.e = e;
//	}
//	public E getObject()
//	{
//		return e;
//	}
//}

/*
 * ������Ķ���ķ���������������Ч�����������ʹ�ã�
 * ��ô������Ķ�����ȷҪ�����ľ������ͺ�����Ҫ���������;��Ѿ��̶��ˡ�
 * 
 * Ϊ���ò�ͬ�ķ���������ͬ���ͣ��������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�
 */
class Utils<T>
{
//	public <T> void show(T t)
	public  void show(T t)
	{
		System.out.println("show:"+t);
	}
	public <Q> void print(Q q)
	{
		System.out.println("print:"+q);
	}
	//��̬���������Է������϶���ķ��ͣ�������Ͳ�ȷ�������뽫���Ͷ����ڷ�����
	public static <Y> void method(Y y)
	{
		System.out.println("method:"+y);
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Utils<Student> u = new Utils<Student>();
//		Student s = u.getObject();
		
		Utils<String> u = new Utils<String>();
		u.show("hahah");
//		u.show(new Integer(4));
//		u.show(3);
		u.print(3);
		u.print("hehe");
		Utils.method("hahahhhaha");
		

	}

}
