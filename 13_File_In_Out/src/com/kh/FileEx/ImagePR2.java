package com.kh.FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePR2 {
 public static void main(String[] args) {
	String ������� = System.getProperty("user.home")+"/Desktop";
	//����ȭ�鿡 �̹������� / �����̸�.txt ���� ������� ��
                        //  �������� �ۼ��� ������ / �� �����ϴ��� Ȯ��
	File �̹������� = new File(�������+"/�̹�������");
	//���࿡ �̹����� �����ϴ��� �������� �ʴ��� ȣ����
	�̹�������.mkdir(); // �̹������� 1�� ����
	
	//�����̸�.txt ���� ���� �� �����̸� �ۼ�/,true �̾ �ۼ��ϱ�
	try {
		FileWriter �۾��� = new FileWriter(�̹�������+"/�����̸�.txt");
		�۾���.write("��\n�����\n����\n�䳢\nȣ����");
		System.out.println("�����̸� ���Ͽ� �̸��� �ۼ��Ǿ����ϴ�.");
		�۾���.close();
		//�۾��� �۾��� �Ϸ�Ǿ����ϴ�.
		//�����ϴ� �����̸����� �����̸� ������ ����
		//�����̸�.txt -> �����ϴµ����̸�.txt ���ϸ� �����ϱ�
		//FileWriter�� �۾��°� �������� ������ �̸��� ���ϰų� �ٸ��۾��� �ϱ� �����
		File �������� = new File(�̹�������+"/�����̸�.txt");
		File ���ο��̸� = new File(�̹�������+"/�����ϴµ����̸�.txt");
		
		if(��������.renameTo(���ο��̸�)) {
			System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
		} else {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.");
		}
		//�����ϱ�
			//���� ���� ���� ����
			//���� ������ �� �� ���� �ȿ� ������ �����Ѵٸ� ���� ������ ���� �ʽ��ϴ�.
		//���� �ȿ� ������ �����ϴ��� Ȯ���ϰ� ���� �ȿ� ������ �ϳ��� �������� �ʴ´ٸ� ����
			//�迭�� �̿��ؼ� ���ϸ���� �ް� ���ϸ���� ���ٸ� ����
		File[] ���ϸ�� = �̹�������.listFiles();
		System.out.println("�����ȿ� ���� ��� ���� : "+���ϸ��);
		//for - each
		for(File f : ���ϸ��) {
			System.out.println(f.getName());
		}
		��������.delete();
		���ο��̸�.delete();
		if(�̹�������.delete()) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			//���࿡ ������ �����ְų� ������̸� ������ �ȵ�
			//���� �ȿ� ������ ������ ���� ���
			//���� ���� ����
			System.out.println("���� ������ �����Ͽ����ϴ�.");
		}
		
	} catch (IOException e) {
		System.out.println("���� �̸� �ۼ��ϴµ� ������ �߻��߽��ϴ�.");
		e.printStackTrace();
	}
	
}

}
