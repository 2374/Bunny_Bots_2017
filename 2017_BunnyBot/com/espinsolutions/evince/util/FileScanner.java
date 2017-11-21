package com.espinsolutions.evince.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileScanner {

	private FileWriter fileWriter;
	private PrintWriter printWriter;
	
	public void createFiles() {
		
		try {
			
			fileWriter = new FileWriter("data.txt");
			printWriter = new PrintWriter(fileWriter);
			
		} catch (IOException ex) {
			
			System.out.println("[Evince] There was a problem creating the Data file.");
			
		}
		
		
	}
	
	public void createEntry(String firstName, String lastName, int token) {
		
		Member member = new Member(firstName, lastName, token);
		
		printWriter.println(member.getFirstName() + ":" + member.getLastName() + ":" + member.getToken());
		printWriter.close();
		
	}
	
}
