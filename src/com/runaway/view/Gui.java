package com.runaway.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.runaway.model.Parser;
import java.awt.TextArea;
import java.awt.BorderLayout;
import javax.swing.JButton;

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
		f.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 10, 317, 1001);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(333, 615, 117, 25);
		f.getContentPane().add(btnNewButton);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(444, 10, 394, 1030);
		f.getContentPane().add(textArea_1);
//		addButton();
	}
	
	private void addPanes(JFrame frame){
//		JTextArea leftBox = new JTextArea(60,  50);
//		JTextArea rightBox = new JTextArea(60,  50);
//		
//		frame.add(leftBox);
//		frame.add(rightBox);
	}
}
