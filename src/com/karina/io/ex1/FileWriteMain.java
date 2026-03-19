package com.karina.io.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		// 카보드로부터 입력받은 메세지를 sub2//msg.txt파일에 저장
		// 입력시 exit를 입력하면 쓰지않고 프로그램이 종료
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\JongHyun\\sava\\sub1\\sub2\\msg.txt");
		boolean flag = true;

		while (flag) {
			System.out.println("내용을 작성하세요");
			String anser = sc.next();
			
			if (anser.equalsIgnoreCase("exit")) {//이퀄스 이그노어케이스=대소문자 무시
				System.out.println("작성 종료");
				flag = false;
			}

			else {

				try {
					FileWriter fw = new FileWriter(file, true);
					fw.write(anser + "\n");
					fw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}
}
