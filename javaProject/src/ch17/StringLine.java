package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//JApplet : Applet税 溌舌毒生稽 1995鰍拭 坦製 社鯵喫.
//蕉巴鹸坂嬢蟹 瀬崎虞酔煽人 敗臆 床心生悟 惟績 貢 陥丞廃 益掘波聖 姥紫拝呪 赤陥.
//薄仙澗 HTML5去 瀬戚 遭鉢鞠檎辞 暗税 醗遂鞠走 省澗陥.
//虞戚覗 紫戚適聖 亜走壱 赤陥.init()-start()-stop()-destroy()
//init()精 琶呪坦軒戚悟 蟹袴走澗 切疑生稽 坦軒廃陥.

public class StringLine extends JApplet{
	@Override
	public void init() {//蕉巴鹸聖 段奄鉢馬澗 坪去しししししししししし
		getContentPane().setBackground(new Color(255,255,255));//壕井事雌 竺舛
		setSize(500, 500);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		//識益軒奄(x1,y1,x2,y2);
		g.drawLine(250, 50, 30, 160);
		
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50);
		
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		
		g.setColor(Color.blue);
		g.drawString("blue string", 10, 110);
		
		
	}
}
