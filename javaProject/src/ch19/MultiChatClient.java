package ch19;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//�������Ͽ� Ŭ����
public class MultiChatClient {
	static String nickName = null;//��ȭ��
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;

	public static void main(String args[]) {
		nickName = JOptionPane.showInputDialog(
				"��ȭ���� �Է��ϼ���");
		new ClientScreen(nickName);
		Socket socket;
		try {
			String serverIp = "localhost";
			//String serverIp = "192.168.0.101";
			// ������ �����Ͽ� ������ ��û
			socket = new Socket(serverIp, 7777);
			System.out.println("������ ����Ǿ����ϴ�");
			Thread receiveThread = new ClientReceiver(socket);
			receiveThread.start();
			Thread sender = 
					new ClientSender(socket, nickName);
			sender.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end main()

	// �޽��� ���ۿ� ������ Ŭ����(������ Ȱ��)
	static class ClientSender extends Thread {
		Socket socket;
		String name;

		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(
						socket.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(name); // ��ȭ�� ������
				}
				while (out != null) {
					out.writeUTF("[" + name + "]" 
							+ scanner.nextLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}// run
	}// ClientSender


	// �޽��� ���ſ� ������ Ŭ����(������ Ȱ��)
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(
						socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void run() {
			while (in != null) {
				try {
					String s = in.readUTF();
					System.out.println(s);
					ta.append(s + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}//ClientReceiver

	// ȭ�� ������ Ŭ����(GUI Ȱ��)
	static class ClientScreen extends JFrame 
	implements ActionListener {
		public ClientScreen(String nick) {
			setSize(300, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle(nick + "�� ä�ù� Ŭ���̾�Ʈ!");
			ta = new JTextArea(25, 40);
			tf = new JTextField(25);
			tf.addActionListener(this);
			JPanel panel = new JPanel();

			//�г��� ���̾ƿ��� �����Ŵ(FlowLayout => BorderLayout)
			panel.setLayout(new BorderLayout());
			//�г��� ��ġ ���� ����(�¿��� ���)
			panel.setComponentOrientation(
					ComponentOrientation.LEFT_TO_RIGHT);
			JLabel label_name = new JLabel(nick + "�� ");
			panel.add(label_name, BorderLayout.WEST);
			panel.add(tf, BorderLayout.CENTER);
			//JTextArea ó��
			JScrollPane jspanel = new JScrollPane();
			panel.add(jspanel, BorderLayout.NORTH);
			jspanel.setViewportView(ta);
			add(panel, BorderLayout.SOUTH);
			setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {//�̺�Ʈ ó��
			if (e.getSource() == tf) {//�׽�Ʈ�ʵ忡�� ����Ű �Է�
				try {
					//�ؽ�Ʈ�ʵ忡 �Է��� ���ڿ��� ����
					out.writeUTF("[" + nickName + "]" + 
							tf.getText());
					tf.setText("");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}//actionPerformed
	}
}//MultiChatClient
