package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	//원본이미지 pig.jpg  pigs_cute.jps  가로 = 400  세로 = 200
	public static void main(String[] args) {
		//원본 이미지 경로
		
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 사이지조정이미지 = "src/com/kh/imageEx/pigs_cute.jpg";
		
		//이미지 가로 세로 크기 설정
		int 가로 = 400;
		int 세로 = 200;
		
		//버퍼이미지를 통해서 이미지 불러오기
		
		try {
			
			
			
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			//새로운 크기의 이미지 생성
			
			BufferedImage 크기조정이미지 = new BufferedImage(가로,세로,BufferedImage.TYPE_INT_RGB);
			
			//이미지 크기를 조정해서 새로운 이미지에 그릴 것!
			
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로, 세로, Image.SCALE_SMOOTH);
			
			//모든 준비 완료 이미지 그리기 시작!
			크기조정이미지.createGraphics().drawImage(이미지그리기,0,0,null); //00null이 왜 들어가는지
			
			//새로 만든 이미지를 파일로 저장하기
			ImageIO.write(크기조정이미지,"jpg",new File(사이지조정이미지));
			
			System.out.println("이미지 크기 성공!");
		} catch (IOException e) {
			System.out.println("이미지 저장에 실패 했습니다.");
			e.printStackTrace();
		}
		
		
	}



}
