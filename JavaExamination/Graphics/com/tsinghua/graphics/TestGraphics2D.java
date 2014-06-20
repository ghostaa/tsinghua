package com.tsinghua.graphics;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestGraphics2D extends JFrame {
	private int width = 50;
	private int height = 50;
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JTextField jtf1 = new JTextField();
	private JTextField jtf2 = new JTextField();
	private DrawPanel dPanel = new DrawPanel();
	public TestGraphics2D() {
		jButton1.setSize(50, 50);
		jButton1.setText("初始化");
		jButton2.setSize(50, 50);
		jButton2.setText("变");
		jtf1.setColumns(10);
		jtf2.setColumns(10);
		jButton1.addActionListener(new ButtonListerner());
		jButton2.addActionListener(new ButtonListerner());
		dPanel.add(jButton1);
		dPanel.add(jButton2);
		dPanel.add(jtf1);
		dPanel.add(jtf2);
		setContentPane(dPanel);
	}
	
	class ButtonListerner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String buttonName=((JButton)e.getSource()).getText();
			System.out.println(buttonName);
			if("变".equals(buttonName)) {
				if ("".equals(jtf1.getText()) || "".equals(jtf2.getText())) {
					JOptionPane jOptionPane=new JOptionPane();
					jOptionPane.showMessageDialog(null, "需要填入长度和宽度");
					dPanel.add(jOptionPane);
				}else {
					width=new Integer(jtf1.getText());
					height=new Integer(jtf2.getText());
				}
			}else {
				width=50;
				height=50;
			}
			
			repaint();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new TestGraphics2D(), 500, 500);
	}

	public static void run(JFrame j, int width, int height) {
		j.setLayout(new FlowLayout());
		j.setTitle(TestGraphics2D.class.toString());
		j.setSize(width, height);
		j.setLocation(200, 100);
		j.setDefaultCloseOperation(EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	class DrawPanel extends JPanel{

		public void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.red);
			g2.drawString("200", 100, 100);
			g2.fillOval(100, 100, width, height);
			g2.setColor(Color.getHSBColor(22, 22, 22));
			g2.fill3DRect(200, 200, 200, 200, true);
		}
	}
	
}
