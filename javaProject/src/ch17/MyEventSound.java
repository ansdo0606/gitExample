package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class MyEventSound extends JApplet implements ActionListener{
	private AudioClip audio1,audio2;
	private JButton play,stop,loop,next;
	
	@Override
	public void init() {
		setLayout(new FlowLayout());
		audio1 = getAudioClip(getClass().getResource("a.wav"));
		audio2 = getAudioClip(getClass().getResource("b.wav"));
		play = new JButton("PLAY");
		stop = new JButton("STOP");
		loop = new JButton("LOOP");
		next =new JButton("NEXT");
		add(play);
		add(stop);
		add(loop);
		add(next);
	
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
		next.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		System.out.println(e.getSource());
		
		if (btn == play) {
			audio1.play();
		}else if (btn == stop) {
			audio1.stop();
		}else if (btn == loop) {
			audio1.loop();
		}else if (btn == next) {
			audio2.play();
		}
		
	}

}
