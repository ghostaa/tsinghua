package com.tsinghua.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSomePic extends JFrame {
		private  int width=50;
		private  int height=50;
		private	DrawPanel dPanel = new DrawPanel();
		public DrawSomePic() {
			add(dPanel);
		}
		

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			DrawSomePic drawSomePic = new DrawSomePic();
			run(drawSomePic, 500, 500);
			for (int i = 0; i < 5000; i++) {
				Thread.sleep(1000);
				System.out.println("aa");
				drawSomePic.width=drawSomePic.width+10;
				drawSomePic.height=drawSomePic.height+10;
				drawSomePic.repaint();
			}
		}

		public static void run(JFrame j, int width, int height) {
			j.setSize(width, height);
			j.setLocation(200, 100);
			j.setDefaultCloseOperation(EXIT_ON_CLOSE);
			j.setVisible(true);
		}
		class DrawPanel extends JPanel{

			public void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponents(g);
				g.setColor(Color.red);
				g.fillOval(100, 100, width, height);
			}
		}
		
	}
