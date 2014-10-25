package com.runaway.model;

public class ParserImpl implements Parser{
	public ParserImpl(){
		System.out.println(calculateRow("1 2 3 4 5 6 7 8 9"));
	}
		
	/**
	 * Given a string of numbers, return the sum
	 */
	private int calculateRow(String string){
		int sum = 0;
		String[] integers = string.split(" ");
		for(int i = 0; i < integers.length; i++){
			sum += Integer.parseInt(integers[i]);
		}
		
		return sum;
	}
	
}
