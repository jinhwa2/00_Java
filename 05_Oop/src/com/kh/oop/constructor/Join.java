package com.kh.oop.constructor;
//1.회원가입
public class Join {
	// 필드 회원번호 아이디 이름 연락처
	public int memberNo; //회원가입한 순서
	public String memberId; //회원이 작성한 아이디 nickName
	public String memberName;
	public String phoneNumber;

	// 생성자 기본  필수
	public Join() { //필수x
		
	}
	// 필수생성자
	public Join(int memberNo,String memberId,String memberName, String phoneNumber) { //필수o 우리 회사에서 필요한 내용을 모두 담을 것
	//()안에 들어가는 변수들 중요하지 않다. 
		//이것은 필드에 있는 memberNo 에 = 나중에 작성한 memberNo를 넣겠습니다.
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.phoneNumber = phoneNumber;
	}
	// 메서드 = 클래스 안에 존재하고, 특정 기능을 할 수 있도록 묶어놓은 코드 모음
		//void 메서드 : 결과를 전달하지 않음
	public void memberInfo() {
		System.out.println("멤버 번호  : "+memberNo);
		System.out.println("멤버 아이디: "+memberId);
		System.out.println("멤버이름   : "+memberName);
		System.out.println("멤버폰번  : "+phoneNumber);
		System.out.println("---------------");
	}
	//최종으로 실행해주는 메인 메서드
	public static void main(String[] args) {
		System.out.println("=== kh 쇼핑 회원 정보 확인 ====");
		
		// 회원1에 대한 정보 확인
		// 회원가입 객체 생성
		Join member1 = new Join();
		
		//필수가 없음
		member1.memberId = "직장인";
		member1.phoneNumber ="동그라미";
		member1.phoneNumber ="동그라미";
		
		member1.memberInfo();
		System.out.println("================");
		Join member2 = new Join();
		member1.memberId = "학생휴먼";
		//회원가입할 때 필수로 작성해야 하는 필수 작성이 생김
		//
		Join member3 = new Join(3,"파워보이","박영희","010-111-1111");
		member3.memberInfo();
	
	//member4  member5 회원가입 시킴
	//member4 기본생성자 가지고 회원가입 시키기
	//맴버번호 맴버이름 memberInfo() member4
	//4 블랙아담
		
	//member5 필수 생성자 가지고 회원가입 시크기
	//member5 info()
	//5 "슈퍼맨" "딘 케인" "010-1938-1932"
	
		Join member4 = new Join();
		member4.memberNo  = 4;
		member4.memberId = "블랙아담";
		
		member4.memberInfo();
		System.out.println("================");
		Join member5 = new Join(5,"슈퍼맨","딘 케인","010-1938-1392");
	
		member5.memberInfo();
	}

}
