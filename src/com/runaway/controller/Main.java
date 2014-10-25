package com.runaway.controller;

import com.runaway.model.ParserImpl;
import com.runaway.view.Gui;

public class Main {
	public static void main(String[] args){
		new Gui(new ParserImpl());
	}
}
