package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//set.add ����� ���� �ɰԶ� ������ ��¡��� �˻���Ĩ
		
		//���������弼���غ��� �����ϴ��� �����K���� Ȯ��
		set.add("�����");
		set.add("����");
		set.add("�ɰ���");
		set.add("������");
		set.add("��¡���");
		set.add("�˻���Ĩ");
		set.add("�ɰ���");
		set.add("�ɰ���");
		set.add("�ɰ���");
		System.out.println(set);
		
		//size() ũ��Ȯ��
		System.out.println(set.size());
		//contains ����ؼ� �������� �����ϴ��� Ȯ��
		System.out.println(set.contains("������"));
		
		//set.remove("����") ����
		set.remove("����");
		System.out.println(set.remove("����"));
		
		//set.isEmpty() �����Ͱ� ��� ���ŵǾ����� Ȯ��
		System.out.println(set.isEmpty());
	}
}
