package com.kh.array.ex;

import java.util.ArrayList;

/*
 ArrayList는 정말정말 중요해요
 리스트는 배열과 비슷하지만 크기가 제한이 되어있지 않기 때문에 따름
 원하는 만큼 담을 수 있음
 
이름은 ArrayList로 사용하지 말것!!! 정말 중요하다 별표 다섯개
ArrayListEx<자료형> 변수명 = new ArrayList<자료형>();

아래 것은 미안하지만 외우세요 외우셔야 되요

int -> Inteber  //앞자리를 대문자로 바꿔져서 써라 인트,스트링 젤 많이 씀
String -> String
double -> Double
add       추가
get       반환
set       수정
remove    삭제
size      개수 확인
isEmpty   비어있는지 확인
clear     모두 삭제
 */
public class ArrayListEx {
	public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<Integer>();
	//index 자리위치 0
	//숫자 추가학
	//자리가 비어 있기 때문에 true
	System.out.println(num.isEmpty());
	num.add(10);
	System.out.println("추가 확인 :  "+num.get(0));
	//비어 있지 않기 때문에 false 나옴
	System.out.println(num.isEmpty());
	
	//크기 확인 = size length 사용하지 않음 
	 System.out.println(num.size());
	 //set 수정하기 위치 어떻게 수정할거야?
	 //           key  value
	 num.set(     0, 20);   //너무 중요하다  10의 위치가 0이여서 20으로 바꿔줄때 앞에 0
	 System.out.println("수정후 : "+num.get(0));
	 // 삭제, 다 만들어놓고 중간에 삭제 하고 싶을떄 있잖어
	 num.remove(0);
	 //삭제 했기 때문에 아무것도 없음
	 System.out.println(num.isEmpty()); //비어 있는지 확인
}
}
