package ch19;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class ServerScreen extends JFrame {
	JTextArea ta;
	JTextField tf;
	
	public ServerScreen() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ä�ù� ����!");
		JLabel label = new JLabel("This is a server!");
		add(label, BorderLayout.NORTH);
		setVisible(true);
	}
}


public class MultiChatServer {
	HashMap userMap;
	
	public MultiChatServer() {
		userMap = new HashMap<>();
		Collections.synchronizedMap(userMap);
	}
	public static void main(String[] args) {
		new ServerScreen();//ȭ�鸸 ���
		new MultiChatServer().serviceStart();//���� ���� �뵵
	}
	public void serviceStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("������ ���۵Ǿ����ϴ�.");
			while (true) {
				socket=serverSocket.accept();//���Ӵ�����
				System.out.println("["+socket.getInetAddress()+"]" + "���� �����ϼ̽��ϴ�.");
				//Ŭ���̾�Ʈ���� �޽��� ������ ���� ������ ����
				//10���� �����ϸ� 10���� �����尡 ������(�ӵ��� �ణ ������)
				ServerReceiver receiveThread = new ServerReceiver(socket);
				receiveThread.start();
				System.out.println("���� �������� ������ name : " + receiveThread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end serviceStart()
	
	//���� ���� ���� ��� ����ڿ��� �޽����� ����
	void sendToAll(String msg) {
		//�ϰ� ����
		Iterator it = userMap.keySet().iterator();
		while (it.hasNext()) {
			try {
				//�޽��� ������ ���� ��½�Ʈ�� ����
				DataOutputStream out = (DataOutputStream)userMap.get(it.next());
				out.writeUTF(msg);//�޽��� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//end while
	}//end sendToAll()
	
	//�޽��� ���Ű��� ����Ŭ������ �ۼ�
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				//������ ����� ���� ����� ��Ʈ�� ����
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {
				System.out.println("ServerReceiver ���� IO ����");
			}
		}
		
		@Override
		public void run() {
			String name = "";
			try {
				name = in.readUTF();//�޽��� ����
				sendToAll("#" + name + "���� �����̽��ϴ�.");//�޽��� ������
				userMap.put(name, out);//HashMap���� ����� �߰�
				System.out.println("���� ������ ���� " + userMap.size() + "�Դϴ�.");
				while (in != null) {
					//���� �޽����� ��� ����ڿ��� ����
					sendToAll(in.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//��ȭ���� ���� ������� ���� ���
				sendToAll("#" + name + "���� �����̽��ϴ�.");
				userMap.remove(name);//HashMap���� ����
				System.out.println("[" + socket.getInetAddress() + ":" 
				+ socket.getPort() + "] ���� ������ ������");
				System.out.println("���� ������ ���� " + userMap.size() + "�Դϴ�.");
			}
		}
	}//MultiChatServer

}

