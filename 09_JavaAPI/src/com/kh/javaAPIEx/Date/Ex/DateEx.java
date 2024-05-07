package com.kh.javaAPIEx.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Date : Ư�� ��¥�� �ð��� ��Ÿ���� Ŭ����
Calendar : ��¥�� �ð��� �����ϴµ� ����ϴ� �߻�Ŭ����
Gre go rian Calendar : �׷������� ����ؼ� ��¥�� �ð��� ���
SimpleDateFormat : ��¥�� �ð��� �������� �����ְ� �װ��� ���
LocalDate
KST =  Korean Standard Time
    =  �ѱ�		�Ϲ�����	�ð�
 */
public class DateEx {
	public static void main(String[] args) {
		//1.Date
		Date ���絥��Ʈ = new Date();
		System.out.println(���絥��Ʈ);
		//2.Calendar
		Calendar Ķ���� = Calendar.getInstance();
		// �� �� ��
		int �� = Ķ����.get(Calendar.YEAR);
		int �� = Ķ����.get(Calendar.MONTH); //0������ �������� ������ +1�� �������
		int �� = Ķ����.get(Calendar.DAY_OF_MONTH);
		
		/*
		  3.�׷�����
		 �׷����� �޷��� 1�� 1�� 1�� ������ �����Ϸ� ���ǵ�����
		 2024, 4, 23 �� �ϸ� �ڵ����� 2024�� 5�� 23�Ϸ� �����
		 2024 5�� 23���� ����� 
		 */
		GregorianCalendar  �׷�����1 = new GregorianCalendar();
		GregorianCalendar  �׷�����2 = new GregorianCalendar(2024,4,23); //2024 5�� 23��
		int ��¥ = �׷�����2.get(Calendar.DAY_OF_WEEK); //��(1) ��(2) ȭ(3) ��(4) ��(5) ��(6) ��(7)
		System.out.println("��¥: " +��¥); // 5�� 23���� ������̱� ������ 5��� ������ ��
		
		
		/*
		 4.SimpleDateFormat  �� �� ��  - ���� ���δٰ�/�߿��� �Ʒ� ���� �߿���,�����ͺ��̽��Ҷ� �ѹ� ����
		 �� : y  year
		 �� : M  Month (���̶� ù ���ڰ� m�� ���� ���� ������ ���� �빮�� M ��)
		 �� : d  day
		 �� : H  Hour (H : 0 ~ 23 ��    h : ����(am)�� ����(pm)�� ������ ǥ��
		 �� : m  minute
		 �� : s  second
		 
		���� : E E��� ���ڷ� ǥ������ ���� ǥ��ȭ �ⱸ���� ���
		      ���࿡ O���� ���� �ʹٸ� EEEE�� ���
		 
		 
		 */
		
	
		SimpleDateFormat ��¥���� = new SimpleDateFormat("yyyy-MM-dd");
				String ��¥ǥ�� = ��¥����.format(new Date());
				System.out.println("��¥���� �����ؼ� ǥ���ϱ�: "+��¥ǥ��);
		
		//5. LocalDate ���� ��¥ ��������
		LocalDate ���糯¥�� = LocalDate.now();
		System.out.println("���糯¥��: "+���糯¥��);
		
		
	}
}
