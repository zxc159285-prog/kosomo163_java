package com.karina.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		File file=new File("C:\\JongHyun\\sava\\study");

		boolean check=file.exists();
		check=file.isDirectory();
		System.out.println(check);
		
		file.mkdir(); //위에입력한 sava폴더에 study라는 폴더가없다면 폴더를만든다
		file=new File("C:\\JongHyun\\sava");
		String[] list=file.list();
		
		
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		file=new File(file,"study");
		file.delete();
//		file=new File("C:\\JongHyun\\sava\\","studt2");
//		list=file.list();
//		for(int i=0;i<list.length;i++) {
//			File f=new File(file,list[i]);
//			f.delete();
		
		
		file = new File("C:\\JongHyun\\sava\\sub1\\sub2");
		file.mkdirs();
	}
}

