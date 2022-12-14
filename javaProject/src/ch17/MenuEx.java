package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{
	//Exit�� �޴����������� ���� ����
	private JMenuItem mie = new JMenuItem("Exit");
	public MenuEx() {
		super("Menu ����");
		createMenu();
		setSize(300, 200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();//�޴��� ����
		JMenu jm = new JMenu("File");//�޴� ����
		jm.add(new JMenuItem("Open"));//�޴��� �޴������� �߰�
		jm.add(new JMenuItem("Save"));
		jm.add(new JMenuItem("Print"));
		jm.addSeparator();//�޴� ������ �и��� �߰�
		jm.add(mie);
		mb.add(jm);//�޴��ٿ� �޴��� ����
		mb.add(new JMenu("Edit"));//�޴��ٿ� �޴� �߰�
		mb.add(new JMenu("Project"));//�޴��ٿ� �޴� �߰�
		mb.add(new JMenu("Run"));//�޴��ٿ� �޴� �߰�
		//�����ӿ� �޴��ٸ� ����(�޴��ٴ� �����ӿ��� ���ϼ� �ִ�.)
		setJMenuBar(mb);
		
		//"Exit" �޴��������� Ŭ���ϸ� ���α׷� ���� �̺�Ʈ ó��
		mie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}//createMenu()
	public static void main(String[] args) {
		new MenuEx();
	}
}
