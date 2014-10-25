package com.runaway.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.runaway.model.Parser;

public class Gui {
	public Gui(Parser p){
		createFrame();
	}
	
	private void createFrame(){
		JFrame f = new JFrame();
		f.setSize(850, 1050);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addPanes(f);
//		addButton();
	}
	
	private void addPanes(JFrame frame){
		JTextArea leftBox = new JTextArea(60,  50);
		JTextArea rightBox = new JTextArea(60,  50);
		
		frame.add(leftBox);
		frame.add(rightBox);
	}
}
