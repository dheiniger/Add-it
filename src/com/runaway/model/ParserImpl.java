package com.runaway.model;

/**
 * An implementation of {@link Parser}
 * @author runaway
 *
 */
public class ParserImpl implements Parser{
	public ParserImpl(){
	
	}
		
	public int calculateRow(String string){
		int sum = 0;
		//Make sure there is no leading whitespace
		string = string.trim();
		//Take the string and split it on 1 or more spaces
		String[] integers = string.split("\\s+");
		try{
			for(int i = 0; i < integers.length; i++){
				sum += Integer.parseInt(integers[i]);
			}
		}catch(NumberFormatException e){
			System.out.println("There string cannot be empty or start with whitspace");
		}
		
		
		return sum;
	}
	
}
