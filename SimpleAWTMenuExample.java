package com.menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class SimpleAWTMenuExample {

	public static void main(String[] args) {
		Frame frame= new Frame("AWT MENU EXAMPLE");
		 
		Menu fileMenu=new Menu("File");
		MenuBar menuBar=new MenuBar();
		Menu editMenu=new Menu("Edit");
		
		MenuItem newItem=new MenuItem("new");
		MenuItem openItem=new MenuItem("open");
		MenuItem saveItem=new MenuItem("save");
		MenuItem exitItem=new MenuItem("Exit");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		 
		frame.setMenuBar(menuBar);
		
		exitItem.addActionListener(e ->{
			System.out.println("Existing...");
			frame.dispose();
			
		});
		frame.setSize(400,300);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}

}
