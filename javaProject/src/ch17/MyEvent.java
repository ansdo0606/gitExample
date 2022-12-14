package ch17;

import java.awt.Button;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEvent extends JFrame{
	private JButton button1,button2,button3,button4;
	
	public MyEvent() {
		setSize(500, 400);
		setVisible(true);
		
		button1 = new JButton("Red");//��ư ����
		button2 = new JButton("Green");//��ư ����
		button3 = new JButton("Blue");//��ư ����
		button4 = new JButton("Yellow");//��ư ����
		
		add(button1,"North");
		add(button2,"East");
		add(button3,"South");
		add(button4,"West");
		
		button1.addActionListener(new MyColorAction(this, Color.red));//�̺�Ʈ ��鷯��
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.yellow));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new MyEvent();
	}
	
	}

