package com.karina.study.student;

import java.security.PublicKey;

public class StudentTestJumsu {
	
	public void t(Student st) {
		//학생의 성적을 받아서 총점과 평균을 출력
		st.total=st.kor+st.eng+st.math;
		st.avg=st.total/3.0;
	}
		public void t2(Student st) {
			st= new Student();
			st.total=90;
			st.avg=30.0;
			
			
			
		}
	}

