package com.runaway.view;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.runaway.model.Parser;

public class Gui {
	private Parser p;
	private TextArea leftTextArea;
	private TextArea rightTextArea;
	
	public Gui(Parser p){
		this.p = p;
		createFrame();
		//TODO REMOVE THIS
		calculate();
	}
	
	private void createFrame(){
		JFrame f = new JFrame();
		f.setSize(850, 1050);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGui(f);
	}
	
	private void buildGui(JFrame frame){
		frame.getContentPane().setLayout(null);
		leftTextArea = new TextArea();
		leftTextArea.setBounds(10, 10, 317, 1001);
		frame.getContentPane().add(leftTextArea);
		
		JButton calculateButton = new JButton("Calclulate Button");
		calculateButton.setBounds(333, 615, 117, 25);
		frame.getContentPane().add(calculateButton);
		
		rightTextArea = new TextArea();
		rightTextArea.setBounds(444, 10, 394, 1030);
		frame.getContentPane().add(rightTextArea);
		
		addActionListeners(calculateButton);
	}
	
	/**
	 *Get the value of the left pane and calculate the sum of each row
	 */
	private void calculate(){
		String temp = "1 2 3 4 5 6 7 8 9 10 11 12    13 4 51 123 12 312 12";
		System.out.println("in calclulate, sum is: " + p.calculateRow(temp));
	}
	
	private void addActionListeners(JButton calculateButton){
		calculateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button was clicked!");
				System.out.println("Value of left pane: " + leftTextArea.getText());
				System.out.println(getTextAreaRows(leftTextArea).toString());
				
			}
		});
	}
	
	/**
	 * Get the text from the given {@link TextArea} {@code t} and return each row as an {@link ArrayList} of {@link Strings}.
	 * @param t the {@link TextArea} to gather text from
	 * @return The rows of the {@link TextArea}
	 */
	private ArrayList<String> getTextAreaRows(TextArea t){
		String[] textAreaRows;
		String rawTextAreaValue = t.getText();
		textAreaRows = rawTextAreaValue.split("\r\n");
		ArrayList<String> rows = new ArrayList<String>();
		
		for(int i = 0; i < textAreaRows.length; i++){
			rows.add(textAreaRows[i]);
		}
		return rows;
	}
}
