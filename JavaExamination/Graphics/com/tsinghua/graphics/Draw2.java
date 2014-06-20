package com.tsinghua.graphics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw2 extends JFrame {
	
	MainPane mainPane;

	public Draw2() {
		setTitle("abc");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(getMainPane());
		setVisible(true);
	}
	
	/**
	 * 初始化并返回底层面板，
	 * 你所有的其他控件都应该添加在这个底层面板上
	 * @return
	 */
	protected JPanel getMainPane() {
		if (mainPane == null) {
			mainPane = new MainPane();
			mainPane.add(new JButton("1"));
			mainPane.add(new JButton("2"));
			mainPane.add(new JButton("3"));
			mainPane.add(new JButton("4"));
			mainPane.add(new JButton("5"));
			mainPane.add(new JButton("6"));
		}
		return mainPane;
	}

	public static void main(String[] args) {
		new Draw2();
	}
	
	class MainPane extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			int width = this.getWidth();
			int height = this.getHeight();
			g2d.setPaint(new GradientPaint(0, 0, Color.white, 
					width, height, Color.cyan));
			g2d.fillRect(0, 0, width, height);
			g2d.setColor(Color.black);
			g.drawString("agagh", 50, 45);
		}
	}


}