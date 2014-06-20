package com.tsinghua.graphics;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTDrawTest extends WindowAdapter{ 
    //构造方法 
    public AWTDrawTest(){ 
        Frame f = new Frame("绘图测试"); 
        DrawCanvas dc = new DrawCanvas();//实例化画布 
        f.add(dc); 
        f.addWindowListener(this);//添加关闭事件 
        f.setBackground(new Color(160,220,220));//设置背景颜色 
        f.setLocationByPlatform(true); 
        f.setSize(200,200); 
        f.setVisible(true); 
    } 
    @Override//重写方法 
    public void windowClosing(WindowEvent e){ 
        System.exit(0); 
    } 
    //main方法 
    public static void main(String[] args){ 
        new AWTDrawTest(); 
    } 
}

class DrawCanvas extends Canvas{ //新建画布类 
    @Override//重写方法 
        public void paint(Graphics g){ 
            g.setFont(new Font("楷体",Font.PLAIN,20));//设置字体 
            g.setColor(Color.RED);//设置颜色 
            g.drawString("绘图测试",20,20);//画出字符串 
            g.drawLine(20,30,60,30);//画出一条直线 
            g.setColor(Color.BLUE);//设置颜色 
            g.draw3DRect(20,40,50,30,false);//画出一矩形 
            g.fillArc(20,80,65,65,0,90);//画出一扇形 
            g.setFont(new Font("华文彩云",Font.PLAIN,30));//设置字体 
            g.setColor(Color.PINK);//设置颜色 
            g.drawString("彩云之南",40,150);//画出字符串 
        } 
}