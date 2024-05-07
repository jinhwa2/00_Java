package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;


public class MapPre {
	//기본생성자 컨트롤 스페이스 엔터
	public MapPre() {
		// 
	}
	//void 메서드 생성
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2,"에그마요");
		map.put(1, "스파이스쉬림프");
		map.put(3,"로티세리바베큐");
		System.out.println(map);
	}
	
	public void pratice2() {
		//                                <> 자료형을 넣어도 되고 안 넣어도 됨
		Map<String,String> map = new HashMap<>();
		//map.put을 활용해서 학원 서울시 강남구 등산-서울시 관악구 롯데타워 서울시-송파구
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		//전체출력하기 System.out.println();
		System.out.println(map);
		
		//get 이용해서 롯데타워가 어디 있는지 출력
		map.get("롯데타워");
		System.out.println("롯데타워 어딨어:"+map.get("롯데타워"));
		
		//remove 활용해서 등산 삭제하기
		map.remove("등산");
		System.out.println(map);
		
		//for-each keySet()을 활용해서 전체 목록 출력하기
		for(String m : map.keySet()) {
			String 명칭 = map.get(m);
			System.out.println(명칭 + "-"+m);
		}
	}
	
	public void practice3() {
		//특정 값이 존재하는지 확인
		//String Integer 과일-가격
		Map<String,Integer> map = new HashMap<>();
		map.put("사과", 100	);
		map.put("바나나",200	);
		map.put("체리", 300	);
		
		//200원 짜리 과일이 존재하는가?
		System.out.println("200원 과일이 존재하는가?"+map.containsValue(200));
		//containsValue 와 containsKey 모두  true false 값으로 보여짐
		//체리 과일이 존재하는가?
		System.out.println("체리 과일이 존재하는가?"+map.containsKey("체리"));
		
		//크기조회
		System.out.println(map.size());
		
	}
	
	public void practice4() {
		
		//변수명은  map
		Map<Integer,String> map = new HashMap<>();
		//put 을 이용해서 1-에그마용 2-로티세리바베큐 3-스테이크앤치즈 4-스파이시쉬림프
		map.put(1, "에그마요"); //1번에서 에그마요를 가져온다가 제일 중요
		map.put(2, "로티세리바베큐");
		map.put(3,"스테이크앤치즈");
		map.put(4,"스파이시쉬림프");
		//get 을 이용해서 3번에 뭐가 들어있는지 확인
		System.out.println(map.get(3));
		
		//size() 를 이용해서 총 메뉴가 몇개인지 확인
		System.out.println(map.size());
		
		//remove 활용해서 4번을 지원줌
		map.remove(4);
		System.out.println(map);
		
		//isEmpty() map이 비어있는지 확인
		System.out.println(map.isEmpty());;//비어있지 않기 때문에 false
		
		//keySet()을 이용해서 for-each 모두 보기
		for(int num :map.keySet()) {
			String 메뉴이름 = map.get(num);
			System.out.println(메뉴이름);
		}
	
		//clera() 최종삭제
		map.clear();
		//Map.Entry 키- 값을 동시에 가져오는 방법  뒤에는 변수명.entrySet()
		for(Map.Entry<Integer,String>  e : map.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
	}
	
	//최종 메인 메서드
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		mp.pratice2();
			//mp.practice3();
	}


}

