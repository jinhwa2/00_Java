package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

//Product 를 자녀와서 실행하는 클래스
public class Run {
	//메인 메서드
	public static void main(String[] args) {
		//Product 객체 생성
		Product product = new Product(); //빨간줄 뜨면 마우스 위에 올려놓고 import한다 이폴더에서 프로덕트 파일을 가져올거야 적어준것
		
		//정보 저장 : 사과 사과가격 사과 브랜드
		product.setName("사과");
		product.setBrand("브랜드");
		product.setPrice(5000);
		
		//원본을 보여주지 않고 셋해서 저장해서 겟을 해서 보여줄거야
		
	}

}
