package com.tsinghua.graphics;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class TestBorderLayout extends JFrame {

	
	public TestBorderLayout(){
		 setLayout(new BorderLayout());
	     add(new Button("North"), BorderLayout.NORTH);
	     add(new Button("South"), BorderLayout.SOUTH);
	     add(new Button("East"), BorderLayout.EAST);
	     add(new Button("West"), BorderLayout.WEST);
	     add(new Button("Center"), BorderLayout.CENTER);
	     setVisible(true);
	     setSize(500, 500);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestBorderLayout();
	}

}
