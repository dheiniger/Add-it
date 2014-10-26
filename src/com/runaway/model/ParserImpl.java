package com.runaway.model;

public class ParserImpl implements Parser{
	public ParserImpl(){
		System.out.println(calculateRow("1 2 3 4 5 6 7 8 9"));
	}
		
	public int calculateRow(String string){
		int sum = 0;
		//Take the string and split it on 1 or more spaces
		String[] integers = string.split("\\s+");
		for(int i = 0; i < integers.length; i++){
			sum += Integer.parseInt(integers[i]);
		}
		
		return sum;
	}
	
}
