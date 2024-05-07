package com.kh.javaAPIEx.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜 만들기
		
		//1. SimpleDateFormat 날짜1 = yyyy-MM-dd 
		SimpleDateFormat 날짜1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		String 글자로데이터변경1 = 날짜1.format(date1);
		System.out.println("현재시간 :"+글자로데이터변경1);
			
		//2. SimpleDateFormat 날짜2 =  HH:mm:ss
		SimpleDateFormat 날짜2 = new SimpleDateFormat("HH:mm:ss");
		//Date date2 = new Date();
		String 글자로데이터변경2 = 날짜2.format(date1);
		System.out.println("현재시간 :"+ 글자로데이터변경2);
		
		//3.3. SimpleDateFormat 날짜3 = yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//Date date3 = new Date();
		String 글자로데이터변경3 = 날짜3.format(date1);
		System.out.println("현재 날짜와 시간 :"+글자로데이터변경3);
		
		//4.SimpleDateFormat 날짜 4 = E를 사용해서 요일 나타내기
		SimpleDateFormat 날짜4 = new SimpleDateFormat("E");
		//Date date4 = new Date();
		String 글자로데이터변경4 = 날짜4.format(date1);
		System.out.println("오늘의 요일 : "+글자로데이터변경4);

	}

}
