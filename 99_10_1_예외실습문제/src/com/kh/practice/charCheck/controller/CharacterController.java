package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	/** �޼��� **/
	// ������: �⺻
	public CharacterController() {

	}

//void
	// ���ڿ��� ������� �� ���ܻ�Ȳ ���� �����
	public int contAlpha(String s) throws CharCheckException {
		
	if(s == null || s.isEmpty()) {
		throw new CharCheckException("�Էµ� ���ڿ��� ��� �ֽ��ϴ�.");
	}
		
	if(s.contains(" "))	{
		throw new CharCheckException("���ڿ��� ������ ���ԵǾ� �ֽ��ϴ�.");
		
	}
		//match = �ִ��� Ȯ��
	if(s.matches(".*[0-9_].*")) {
		throw new CharCheckException("üũ�� ���ڿ� �ȿ� ���ڳ� ������ ����ֽ��ϴ�.");
	}
	
	//���ĺ��� ������ ���ĺ��� �������� Ȯ��
	int count = 0;
	
	for(int i =0; i<s.length(); i++) {
		char c = s.charAt(i);
		//   �ҹ��� a ~ z         �빮��   A  ~   �빮�� Z
		if( (c >= 'a' && c<='z') || (c >= 'A' && c <= 'z')) {
			count++;
		}
	}
		
	return count;	
		
		
		
		
	}

	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}

}
