package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

/*
 FileWrite : ���Ͽ� ���ڸ� ���� ���� ��ü
 	������ ���ٸ� ������ �����ϰ� ���Ͽ� �����͸� �ٷ� �� �� ����
 	
�޼��� 

write() : �ۼ��ϰ���� ������ ���Ͼȿ� �ۼ�
flush() : ��Ʈ���� ���� ��� �����͸� ��� (��� �ۼ��� ������)
close() : �����ִ� ������ ����


 * */
public class FileWriteEx {

	public static void main(String[] args) {
		          			//���ϸ�      "���ϸ�,Ȯ����" 
		try {
			// �����̸� �տ� �ּҰ� ������ ���� �ڹ��ڵ带 �ۼ��ϴ� ���� �ٷ� �ؿ� ����
			//"���ϸ�,Ȯ����" ,  true�� ���̸� �̾ �ۼ� ��
			FileWriter �۾��� = new FileWriter("��������.txt",true);
		
			//���Ͽ� ���ھ���
			�۾���.write("�ȳ��ϼ���. ȯ���մϴ�.");
			System.out.println("�۾���Ϸ�");
			
			�۾���.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
