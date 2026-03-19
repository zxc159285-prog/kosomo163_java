package com.karina.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilerReadMain {

	public static void main(String[] args) {
		File file=new File("C:\\JongHyun\\sava\\sub1\\sub2\\msg.txt");
		
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			
			while(true) {
			String s=br.readLine();
			System.out.println(s);
			if(s==null) {
			break;
			}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
