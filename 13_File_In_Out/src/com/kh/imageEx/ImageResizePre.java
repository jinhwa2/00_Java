package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	//�����̹��� pig.jpg  pigs_cute.jps  ���� = 400  ���� = 200
	public static void main(String[] args) {
		//���� �̹��� ���
		
		String �����̹��� = "src/com/kh/imageEx/pigs.jpg";
		String �����������̹��� = "src/com/kh/imageEx/pigs_cute.jpg";
		
		//�̹��� ���� ���� ũ�� ����
		int ���� = 400;
		int ���� = 200;
		
		//�����̹����� ���ؼ� �̹��� �ҷ�����
		
		try {
			
			
			
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
			
			//���ο� ũ���� �̹��� ����
			
			BufferedImage ũ�������̹��� = new BufferedImage(����,����,BufferedImage.TYPE_INT_RGB);
			
			//�̹��� ũ�⸦ �����ؼ� ���ο� �̹����� �׸� ��!
			
			Image �̹����׸��� = �����̹���������.getScaledInstance(����, ����, Image.SCALE_SMOOTH);
			
			//��� �غ� �Ϸ� �̹��� �׸��� ����!
			ũ�������̹���.createGraphics().drawImage(�̹����׸���,0,0,null); //00null�� �� ������
			
			//���� ���� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(ũ�������̹���,"jpg",new File(�����������̹���));
			
			System.out.println("�̹��� ũ�� ����!");
		} catch (IOException e) {
			System.out.println("�̹��� ���忡 ���� �߽��ϴ�.");
			e.printStackTrace();
		}
		
		
	}



}
