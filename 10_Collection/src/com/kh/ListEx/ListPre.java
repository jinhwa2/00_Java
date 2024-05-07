package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 List ┌Vector : Java1 버전 대에서 제일 먼저 등장에서 사용된 것, 사용하다 보니 메모리 사용이 너무 큼
      ├ArrayList : 검색에 좋음 삽입과 삭제가 빈번한 경우 부적합
  	  └linkedList : 검색엔 부적합 데이터 삽입과 삭제에는 좋음
 * */

public class ListPre {
	//생성자 : 기본 컨트롤 스페이스 엔터
	public ListPre() {
		
	}
//void : 백터
	public void VectorEx() {
		//List<String> 백터 = new Vector<>(); 이렇게 사용해도 되지만 아래 사용 권장
		Vector<String> 백터 = new Vector<>();
		백터.add("자바");
		백터.add("파이썬");
		백터.add("C");
		System.out.println(백터);
		
	}
	public void LinkedEx( ) {
		//LinkedList<String> 링크드리스트 = LinkedList<>(); 
		LinkedList<String> 링크드리스트 = new LinkedList<>();
		링크드리스트.add("말");
		링크드리스트.add("호랑이");
		링크드리스트.add("송아지");
		System.out.println(링크드리스트);
	}
	
	public void ArrayEx() {
		ArrayList<String> 어레이리스트 = new ArrayList<>();
		
		어레이리스트.add("사과");
		어레이리스트.add("바나나");
		어레이리스트.add("포도");
		System.out.println(어레이리스트);
	
	}

	//main main 컨트롤 스페이스바
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}
	
	
	
}
