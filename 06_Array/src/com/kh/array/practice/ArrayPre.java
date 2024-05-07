package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
//메서드
	//생성자 : 기본
	public ArrayPre() {
		
	}
	//void
	public void practice1() {
		//배열을 사용해서 전체 합 구하기
		//배열을 사용할 때 제일 먼저
		// 숫자인지 문자열인지 문자인지 실수인지 구분을 해준 후 [] 장바구니 표시 작성
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;
				//결과는 하나이기 때문에 장바구니 모양이 없습니다.
		//for-each 문 처음부터 끝까지 반복해서 무언가를 진행할 때 사용
		for(int 숫자   : num     ) {
		///뒤에는 처음부터 내가 보고싶은 모음집을 넣어줘요, 앞에는 자료형 우리가 숫자라는 식으로 넣어줄께요
		// num안에 있는 모든 숫자가 하나씩 숫자 안에 들어가고
			// 숫자들의 합
			result += 숫자;  //결과로 더해줘야 하기에 
		}
	 System.out.println("숫자들의 합 : " + result);
 }

	public void practice2()	{
		//ArrayList 사용해서 물건 추가하기 어레이가 오프라인 장바구니라면 어레이리스트는 온라인 장바구니
		//ArrayList<>() <>안에 String을 넣어도 되고 안넣어도됨,뒤에 자료형은 생략해도 됨
		ArrayList<String> goods = new ArrayList<>();
		//상품을 추가할 때는 add 더하기
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("T  V");
		goods.add("에어컨");
		
		//모두보기 2가지
		System.out.println(goods);
		
		//for - each 이치문은 크게 사용하지는 않음 이름만 붙여진것
		for(String a   : goods) {
			//a ->여러분이 정하기 나름
			System.out.print(a+" ");
		}
	}

	public void practice3() {
		// 배열을 사용해서 최대값 찾기
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0];
		
		for(int num    :   numbers) {
			if(num>max) {
				max = num;
			}
		
		}
		System.out.println("최대값 : "+max);
	}

	public void practice4() {
		// 찾음 못찾음~~!
		//과일가게 사과 바나나 딸기 오렌지
		String[] fruits = {"사과", "바나나", "딸기", "오렌지"};
		
		String search = "바나나";         //여러개쓸때는 장바구니 하나쓸땐 장바구니 안넣는다
						///찾았으면 찾았다 하려고 boolean넣어줌
		boolean found = false;			//아직은 찾았는지 안찾았는지 모르기 때문에 false
		// for - each 문 활용해서 바나나 찾기
		//           {"사과", "바나나", "딸기", "오렌지"};
		for( String f  : fruits)
			///사과 들어오면 에프에 넣을거고 바나나 들어오면 에프에 넣을거고 반복, 왜케 변덕이 심해 변수니깐
			//만약에 내가 찾는 과일과 이름이 똑같다면 찾았다~! 해주기
			if(f.equals(search)) {
				found = true;
				break;
			}
		System.out.println(search + " 찾음?" + (found ? "찾음" : "못찾음"));
	}

	public void practice5() {
		//스캐너 동물을 입력하고 배열에 동물이 있는지 확인할 것
		// 4 serch 스캐너로 변경
		String[] zoo = {"코끼리", "원숭이", "푸바오", "토끼", "공작"};
		Scanner sc = new Scanner(System.in);
		System.out.print("동물을 입력하세요: ");
		String search = sc.next();
	
		boolean found = false;
		for(String anmimal : zoo) {
			//if(zoo.equals(동물)) {
			if(anmimal.equals(search)) {
				found = true;
				break;
			}
		}
	System.out.print(search + " 찾았습니까? " + (found ? "찾았어요." : "못찾았어요."));
	


}
}
