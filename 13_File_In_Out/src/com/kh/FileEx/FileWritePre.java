package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
	public static void main(String[] args) {
		// Hello world.txt ���Ͽ� ���� �ڹٰ� �ʹ� ��մ� ��� ������ �ۼ��ϰ�
		//������ �����ϱ�
		//��ο���忡 �ڹٴ� ����������մ�. ��� ���� �̾��
		String ��ο���� = "Hello world.txt";
		
		try {
			
			FileWriter �۾��� = new FileWriter(��ο����,true);
		    //   \n  ������ �ٹٲ����� �̾�� ����
			String ���� = "\n �ڹٴ� �������� ��մ�.";
			
			�۾���.write(����);
			
			�۾���.close();
			
			System.out.println("�۾���Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}