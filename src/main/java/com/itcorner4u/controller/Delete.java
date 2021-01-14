package com.itcorner4u.controller;

public class Delete {
	
	public static void main(String[] args) {
	}
	
	private String formatDateString(String text) {
		String date = null;
		String tokens[] = text.split("\\.");
		if(tokens.length == 3) {
			date = tokens[2]+"-"+tokens[1]+"-"+tokens[0];
		}
		return date;
	}

}
