package com.karina.lang.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {

	private String data;

	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
	}

	public ArrayList<StudentDTO> oldinit() {

		ArrayList list = new ArrayList();
		// data를 파싱작업
		StringTokenizer st = new StringTokenizer(this.data, "-");

//		StudentDTO[]ar=new StudentDTO[3];
		ArrayList<StudentDTO> ar = new ArrayList<>();
		int index = 0;
		while (st.hasMoreTokens()) {
			StudentDTO dto = new StudentDTO();
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			String s3 = st.nextToken();
			String s4 = st.nextToken();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			dto.setName(s1);
			dto.setKor(Integer.parseInt(s2));
			dto.setEng(Integer.parseInt(s3));
			dto.setMath(Integer.parseInt(s4));
			ar.add(dto);
//			index++;
			System.out.println("===============");
		}
		return ar;

	}

	// 학생검색
	public StudentDTO search(ArrayList<StudentDTO> ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름을 입력하세요");
		String name = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {
				return ar.get(i);

			}

		}

		return null;

	}

	// 학생추가하기 add
	// 이름 국어 영어 수학 입력
	public void add(ArrayList<StudentDTO> ar) {
		Scanner sc = new Scanner(System.in);
		StudentDTO dto = new StudentDTO();

		System.out.println("추가할 이름을 입력하세요:");
		dto.setName(sc.next());

		System.out.println("국어 점수:");
		dto.setKor(sc.nextInt());

		System.out.println("영어 점수:");
		dto.setEng(sc.nextInt());

		System.out.println("수학 점수:");
		dto.setMath(sc.nextInt());

		ar.add(dto);

	}

	// 학생의 이름을 입력해서 일치하는 학생의 정보를 삭제
	// delete
	public void delete(ArrayList<StudentDTO> ar) {
		Scanner sc = new Scanner(System.in);

		System.out.println("삭제할 이름을 입력하세요:");
		String name = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			StudentDTO dto = ar.get(i); // 리스트에서 학생 한 명을 꺼냄

			// 3. 이름이 같다면?
			if (name.equals(dto.getName())) {
				ar.remove(dto); // 4. 그 학생 객체 자체를 리스트에서 삭제!
				System.out.println("삭제되었습니다.");
				return; // 찾아서 지웠으니 반복문을 끝냅니다
			}
		}{System.out.println("저장되어있지 않은 학생입니다");}
	}
	
	public void backup(ArrayList<StudentDTO> ar) {
		//학생들의 정보를 info.txt에 저장하기
		File file =new File("C:\\JongHyun\\sava\\sub1\\sub2\\info.txt");
		try {
			FileWriter fw=new FileWriter(file,true);
			for(int i=0;i<ar.size();i++) {
				StudentDTO dto=ar.get(i);
				fw.write(dto.getName()+"-"+dto.getKor()+"-"+dto.getEng()+"-"+dto.getMath()+"\n");
				fw.flush();
				
			}System.out.println("백업되었습니다");
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public ArrayList<StudentDTO> init() {
		//info.txt의 내용을 읽어서 출력
			File file= new File("C:\\JongHyun\\sava\\sub1\\sub2\\info.txt");
			ArrayList<StudentDTO> list = new ArrayList<>();
			try {
				FileReader fr=new FileReader(file);
				BufferedReader br= new BufferedReader(fr);
				String s=null;
				while((s=br.readLine())!=null) {
				
				String[] ar=s.split("-");
				StudentDTO studentDTO=new StudentDTO();
				studentDTO.setName(ar[0]);
				studentDTO.setKor(Integer.parseInt(ar[1]));
				studentDTO.setEng(Integer.parseInt(ar[2]));
				studentDTO.setMath(Integer.parseInt(ar[3]));
				list.add(studentDTO);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
	}
}
