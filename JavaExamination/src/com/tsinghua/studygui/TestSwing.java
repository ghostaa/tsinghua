package com.tsinghua.studygui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;

public class TestSwing{
	static final int WIDTH=300;
	static final int HEIGHT=150;
	public TestSwing(){
		JFrame f=new JFrame("123");
		JPanel p = new JPanel();
		JMenuBar menubar1=new JMenuBar();
		JMenu menu1=new JMenu("1");
		JMenu menu2=new JMenu("2");
		JMenu menu3=new JMenu("3");
		JMenu menu4=new JMenu("4");
		JMenuItem item1=new JMenuItem("a");
		JMenuItem item2=new JMenuItem("b");
		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menubar1.add(menu1);
		menubar1.add(new JSeparator(JSeparator.VERTICAL));
		menubar1.add(menu2);
		menubar1.add(new JSeparator(JSeparator.VERTICAL));
		menubar1.add(menu3);
		menubar1.add(new JSeparator(JSeparator.VERTICAL));
		menubar1.add(menu4);
		f.setJMenuBar(menubar1);
		f.setContentPane(p);
		f.setLocation(100, 100);
		p.add(new JButton("a"));
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new TestSwing();
	}
}
