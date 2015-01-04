package com.runaway.model;

/**
 * An implementation of {@link Parser}
 * @author runaway
 *
 */
public class ParserImpl implements Parser{
	public ParserImpl(){
	
	}
		
	public double calculateRow(String string){
		double sum = 0;
		//Make sure there is no leading whitespace
		string = string.trim();
		//Take the string and split it on 1 or more spaces
		String[] doubles = string.split("\\s+");
		try{
			for(int i = 0; i < doubles.length; i++){
				sum += Double.parseDouble(doubles[i]);
			}
		}catch(NumberFormatException e){
			System.out.println("The string cannot be empty or start with whitspace");
		}
		
		
		return sum;
	}
	
}
