package com.kh.javaAPIEx.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat Ȱ���ؼ� ��¥ �����
		
		//1. SimpleDateFormat ��¥1 = yyyy-MM-dd 
		SimpleDateFormat ��¥1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		String ���ڷε����ͺ���1 = ��¥1.format(date1);
		System.out.println("����ð� :"+���ڷε����ͺ���1);
			
		//2. SimpleDateFormat ��¥2 =  HH:mm:ss
		SimpleDateFormat ��¥2 = new SimpleDateFormat("HH:mm:ss");
		//Date date2 = new Date();
		String ���ڷε����ͺ���2 = ��¥2.format(date1);
		System.out.println("����ð� :"+ ���ڷε����ͺ���2);
		
		//3.3. SimpleDateFormat ��¥3 = yyyy-MM-dd HH:mm:ss
		SimpleDateFormat ��¥3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//Date date3 = new Date();
		String ���ڷε����ͺ���3 = ��¥3.format(date1);
		System.out.println("���� ��¥�� �ð� :"+���ڷε����ͺ���3);
		
		//4.SimpleDateFormat ��¥ 4 = E�� ����ؼ� ���� ��Ÿ����
		SimpleDateFormat ��¥4 = new SimpleDateFormat("E");
		//Date date4 = new Date();
		String ���ڷε����ͺ���4 = ��¥4.format(date1);
		System.out.println("������ ���� : "+���ڷε����ͺ���4);

	}

}
