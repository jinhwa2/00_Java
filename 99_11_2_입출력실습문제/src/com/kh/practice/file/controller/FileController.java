package com.kh.practice.file.controller;

import com.kh.pratice.file.model.dao.FileDAO;

public class FileController {
	FileDAO fd = new FileDAO();
	
	//�̸��� �����ϴ��� Ȯ���ϴ� �ڵ� �ۼ�
	public boolean chechName(String file) {
		return fd.chechName(file);
	}
    //�������� ���� �ۼ�
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
	}
	//���Ͽ���
	public StringBuilder fileOpne(String file) {
			return fd.fileOpen(file);
	}
	//���ϼ���
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}

}