package com.graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class AWTGraphicsExample extends Frame {
	
	public AWTGraphicsExample() {
		setTitle("AWT Graphics Example");
		setSize(400,400);
		setVisible(true);
		
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(50,50,200,50);
		
		g.setColor(Color.RED);
		g.drawRect(50,100,100,50);
		g.fillRect(50,200,100,50);
		
		g.setColor(Color.green);
		g.drawOval(200, 100, 100, 50);
		g.fillOval(200, 200, 100, 50);
		
		g.setColor(Color.MAGENTA);
		g.drawString("Hello,AWT Graphics!",100,300);
	}
	public static void main(String[]args) {
		new AWTGraphicsExample();
		
	}
		
	}
