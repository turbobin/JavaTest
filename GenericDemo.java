/*
 * 泛型类：
 * 当类中要操作的引用数据类型不确定时，早期定义Object来完成扩展。
 * 现在定义泛型来完成扩展,避免了强转操作
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
 * 泛型类的定义的泛型在整个类中有效，如果被方法使用，
 * 那么泛型类的对象明确要操作的具体类型后，所有要操作的类型就已经固定了。
 * 
 * 为了让不同的方法操作不同类型，而且类型不确定，可以将泛型定义在方法上。
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
	//静态方法不可以反问类上定义的泛型，如果类型不确定，必须将泛型定义在方法上
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
