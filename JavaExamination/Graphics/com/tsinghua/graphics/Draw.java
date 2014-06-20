package com.tsinghua.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw extends JFrame {
	JPanel jPanel = new JPanel();

	public Draw() {

		jPanel.setBackground(Color.red);
		add(jPanel);
		Drawation drawaction = new Drawation();// 添加画图，把上面jpanel的设置给覆盖了；要是先添加画图再添加
		add(drawaction); // jpanel则把画图覆盖了

	}

	public static void main(String[] args) {
		Draw draw = new Draw();
		draw.setTitle("abc");
		draw.setSize(300, 300);
		draw.setVisible(true);
		draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Drawation extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawString("agagh", 50, 45);
		g.drawLine(100, 100, 200, 200);
	}
}