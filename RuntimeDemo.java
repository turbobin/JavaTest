/*
 * Runtime����
 * ����û���ṩ���캯��������new������ô��ֱ���뵽�����еķ������Ǿ�̬�ġ�
 * ���ָ��໹�зǾ�̬������˵������϶��ṩ�˷�����ȡ�������
 * ���Ҹ÷����Ǿ�̬�ģ����ص��Ǳ������͡�
 * 
 * �ɴ˿ɿ���������ʹ���˵������ģʽ
 */
public class RuntimeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("C:\\Program Files\\Mainframe ABEND ASSIST\\ABENDASSIST.exe");
		r.exec("notepad.exe C:\\Users\\hmx\\Desktop\\MMBDLINF.txt");//�������±����� ��һ���ļ�
		
		Thread.sleep(4000);
		p.destroy();	//ɱ���������Ľ���
	}

}
