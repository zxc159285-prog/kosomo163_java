package com.karina.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		String name="시발"; //이걸 하드디스크 메모장에 저장할것
		File file= new File("C:\\JongHyun\\sava\\sub1\\sub2\\info.txt");
		System.out.println(file.exists());
		
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(name+"\n");//다음에 쓰는 내용이 다음줄에 써지게하는것. 지우면 옆에 이어서써짐
			fw.flush();//버퍼를 강제로 비우기 내보낼떄는 꼭 써줘야함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("종료");
		
		
		
	}

}
