package com.kh.pratice.file.model.dao;

import java.util.HashMap;
import java.util.Map;

public class FileDAO {
	private Map<String,String> files = new HashMap<>();
	
	//���� �̸��� �����ϴ��� containsKey
	public boolean chechName(String file) {
		return files.containsKey(file);
	}
	//���� ���� ���� Ȯ�� put
	public void fileSave(String file, String s) {
		files.put(file, s);
		System.out.println("���� ���� �Ϸ�: "+file);
		
	}
 //���� ����
	public StringBuilder fileOpen(String file) {
		//������ ���� �����Ѵٸ� ����
		if(files.containsKey(file)) {
			System.out.println("���� ���� �Ϸ�:"+file);
			return new StringBuilder(files.get(file));
		}else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			return new StringBuilder();//v������ �������� ������ ������ ����X
			
		}
	}
	//���� ���� ����
	public void fileEdit(String file, String s) {
		if(files.containsKey(file)) {
			files.put(file, s);
			System.out.println("���������Ϸ�: "+file);	
		}else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

}
