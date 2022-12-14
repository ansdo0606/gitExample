package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener{
	private AudioClip audio;//���� ó�� ��ü
	private JButton play,stop,loop;
	
	@Override
	public void init() {
		//ȭ�� ���̾ƿ� ��ġ(���ø� �⺻ ���̾ƿ� - BorderLayout)
		setLayout(new FlowLayout());//FlowLayout���� ����
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		//��ư�� ���ø��� �߰�
		play = new JButton("PLAY");
		stop = new JButton("STOP");
		loop = new JButton("LOOP");
		add(play);
		add(stop);
		add(loop);
		
		//��ư Ŭ�� �̺�Ʈ ��� �߰�
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	
	//��ư�� Ŭ���ϸ� �ڵ����� ����Ǵ� �ڵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		//getSource�� ObjectŸ���̾ �º��� ���缭 ����ȯ����� �Ѵ�
		System.out.println(e.getSource());
		if (btn == play) {
			audio.play();
		}else if (btn == stop) {
			audio.stop();
		}else if (btn == loop) {
			audio.loop();
		}
	}

}
