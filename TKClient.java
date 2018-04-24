import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TKClient extends JFrame implements ActionListener{

    // Ϊ�˼���������е��쳣��ֱ��������
    String host = "182.207.112.255"; // Ҫ���ӵķ����IP��ַ
    int port = 10005; // Ҫ���ӵķ���˶�Ӧ�ļ����˿�
    mythread thread  = null;
    Socket client = null;
    Writer writer = null;

    private JTextArea msg = new JTextArea("�ͻ�����Ϣ������\r\n");
    private JTextArea input = new JTextArea();
    private JButton msgSend = new JButton("����Ⱥ��Ϣ");
    public TKClient() {
        // TODO Auto-generated constructor stub
        initSocket();
        this.setVisible(true);
        this.setSize(550, 750);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {
            @SuppressWarnings("deprecation")
			@Override
            public void windowClosing(WindowEvent arg0) {
                // TODO Auto-generated method stub
                super.windowClosing(arg0);
                try {
                    if(client != null){
                        client.close();
                    }

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if(thread != null){
                    thread.stop();
                }

                System.exit(0);
            }
        });
        input.setColumns(40);
        input.setRows(10);
        input.setAutoscrolls(true);
        msgSend.addActionListener(this);
        msgSend.setActionCommand("sendMsg");
        msg.setAutoscrolls(true);
        msg.setColumns(40);
        msg.setRows(25);
        JScrollPane spanel = new JScrollPane(msg);
        JScrollPane editpanel = new JScrollPane(input);
        this.add(spanel);
        this.add(editpanel);
        this.add(msgSend);
    }
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        new TKClient();
    }

    public void initSocket(){
        try {
            client = new Socket(this.host, this.port);
            writer = new OutputStreamWriter(client.getOutputStream());
            // �������Ӻ�Ϳ����������д������
            thread = new mythread(client, this);
            thread.start();
            this.appendMsg("�����Ϸ�����");
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            this.appendMsg("���������Ϸ�����");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            this.appendMsg("���������Ϸ�����");
        }
    }

    public void appendMsg(String msg){
        this.msg.append(msg+"\r\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String temp = "";
        try {
            if("sendMsg".equals(e.getActionCommand())){
                if((temp = this.input.getText()) != null){
                    writer.write(temp);
                    writer.flush();
                    this.appendMsg("��("+this.client.getLocalPort()+")˵����>"+temp);
                    this.input.setText("");
                }
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

}

class mythread extends Thread
{
    private Socket socket = null;
    private Reader reader = null;
    private int len = 0;
    char chars[] = new char[64];
    private TKClient client = null;
    private String temp = "";

    public mythread(Socket socket, TKClient client) {
        // TODO Auto-generated constructor stub
        this.socket = socket;
        this.client = client;
        try {
            reader = new InputStreamReader(socket.getInputStream());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void run() 
    {
        // TODO Auto-generated method stub
        super.run();
        System.out.println("�ͻ������߳�"+this.getId()+"��ʼ����");
        while (true) {
            try {
                if (socket.isClosed() == false) {
                    if (socket.isInputShutdown() == false) {
                        while ((len = ((Reader) reader).read(chars)) != -1) {
                            temp = "������˵����>"+":"+ new String(chars, 0, len);
                            client.appendMsg(temp);
                            System.out.println();
                        }
                    }

                } else {
                    if (socket.getKeepAlive() == false) {
                        reader.close();
                        socket.close();
                        this.stop();
                    }
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
    