package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {

	public static void practice8() {
		// 주민번호 이용해서 남자인지 여자인지 구분해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 주민번호를 입력해주세요: ");
		String idNumber = sc.next();
		char genderCode = idNumber.charAt(7);
		String gender;
		if(genderCode == '1' || genderCode == '3') {
			gender = "남자";
		} else if(genderCode == '2' || genderCode == '4') {
			gender = "여자";
		} else {
			System.out.println("올바른 주민번호가 아닙니다.");
			//1.gender = "올바른 주민번호가 아닙니다.
			//2.else에서 돌려보내는 return
			return;
		}
		//여자인지 남자인지에 대한 결과
		System.out.println("입력한 주민번호는 "+gender+"입니다.");
			
		}
		
	public static void castingPractice1() {
		//키보드로 문자 하나를 입력받아 그 문자의 유니코드를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력라세요: ");
		char inputChar = sc.next().charAt(0);
		
		// 유니코드 출력 16진수
		// 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하기 위한 방식
		// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		int unicode = inputChar;//char 2byte int 4byte
		System.out.println("입력한문자 "+inputChar+" 의 유니코드는 "+unicode + "입니다.");
	}
	
	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;//기본값이 double 이기 때문에 float으로 변경해주는 f 붙여줌
		double dNum = 2.5;
		char ch = 'A';
		System.out.println(iNum1 / iNum2); // 2 몫 2로 떨어진다면?
		System.out.println((int) dNum);//2
		//double 실수로 되어 있는 것을 정수로 변경
		//double 8byte int 4byte 강제 형변환을 (int) 변경하겠다는 표시를 작성 후 시켜줄 것
		System.out.println((double)iNum2 * dNum);//10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double)필수가 아님
		System.out.println((double)iNum1);//10.0
		System.out.println((double) iNum1 / iNum2);//2.5 //정수 -> 실수형
		System.out.println(dNum);//2.5
		
		System.out.println((int)fNum);//3 실수형 -> 정수형
		System.out.println((int)iNum1 / fNum); // 3 //나누기를 해서 몫이3
		//int와 float 은 같은 크기의 byte 정수인지 실수인지 표기
		//float 소수점 이하 6자리 까지만 보여줌 기본으로
		System.out.println((double)iNum1 / fNum);//3.33333333
		
		System.out.println((double)iNum1 / fNum);// 3.3333333333333335
		System.out.println(ch);//'A'
		System.out.println((int)ch);// 65
		
		System.out.println((int)ch + iNum1);//75
		// 'A' 값이 (int)ch를 통해 65
		//큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨짐
		//65+ (int iNum1 = 10) = 75
		
		System.out.println((char)(ch +iNum1)); //75 'k'
		
	}
	
	public static void controPractice1() {
		//키보드로 입력받고 입력 수정 조회 삭제 종료 버튼눌러서 실행하기
		Scanner sc = new Scanner(System.in);
		
		//메뉴 출력하기
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		
		//메뉴 번호 입력 받기
		System.out.println("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		//선택된 메뉴에 따라 동작 수행
		switch(menuNumber) {
		case 1:
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴 종료됩니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			default:
				System.out.println("해당하는 메뉴가 없습니다.");
				return;
		}
		
	}
	
	public static void controlPractice10() {
		Scanner sc = new Scanner(System.in);
		// System.out.println() 에서 출력할 내용이 길어져서
		//줄 바꿈으로 글을 작성하고 싶다면 \n이용해서 줄바꿈해서 출력하겠다는
		// 역슬래쉬 표기방법 떠블유 가운데 줄간거
		// \n = 세로로 줄바꿈 해서 출력
		// \r = 키보드 입력하는 위치를 현재 줄의 맨 처음으로 이동 
		// System.out.printlr();
		// +는 ); 붙이지 않는 한 줄을 바꿔서 계속 이어서 작성할 수 있음
		
		
		System.out.println("1.메뉴 출력\n"
				+ "2.짝수/홀수\r\n" //둘중 하나만 사용해도됨 보통 역슬래시 엔을 많이 씀, 역슬래시알 과 역슬래시 앤은 필수가 아니란 뜻
				+ "3.합격/불합격\r\n"
				+ "4.계절\r\n"
				+ "5.로그인\r\n"
				+ "6.권한 확인\r\n"
				+ "7.BMI\r\n"
				+ "8.계산기\r\n"
				+ "9.P/F ");
		System.out.println("실행할 기능을 선택하세요: ");
		
		
//		 1. 메뉴 출력
//		 2. 짝수/홀수
//		 3. 합격/불합격
//		 4. 계절
//		 5. 로그인
//		 6. 권한 확인
//		 7. BMI
//		  8. 계산기
//		 9. P/F	
		
		int menuNum = sc.nextInt();
		//선택된 메뉴에 따라 동작 수행
		switch(menuNum) {
			case 1:
				System.out.println("메뉴 출력");
				break;
			case 2:
				System.out.println("짝수/홀수");
				break;
			case 3:
				System.out.println("합격/불합격");
				break;
			case 4:
				System.out.println("계절");
				break;
			case 5:
				System.out.println("로그인");
				break;
			case 6:
				System.out.println("권한 확인");
				break;
			case 7:
				System.out.println("BMI");
				break;
			case 8:
				System.out.println("계산기");
				break;
			case 9:
				System.out.println("P/F");
				break;
			default:
				System.out.println("잘못된 입력방식입니다.");
				return;
				
		}
		
	}

	public static void controlpractice5() {
		/*아이디가 비밀번호 지정 후 아이디 비밀번호가 일치하는지 확인*/
		// 사용자가 지정한 아이디 비밀번호
		String userID = "user123";
		String userPW = "user12345";
		
		// 사용자한테 입력받을 아이디 비밀번호
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String inputId = sc.nextLine();
		System.out.println("비밀번호: ");
		String inputPW = sc.nextLine();
		
		
		
		
		// 입력받은 값이 저장된 아이디 비밀번호와 일치하는지 확인
		if(userID.equals(inputId) && userID.equals(inputPW)) {
			System.out.println("로그인 되었습니다.");
			//아이디가 틀렸는지  //비밀번호가 틀렸는지 구분해서 출력
			// ! 특정 조건을 부정하는데 사용
			/* correctNumber.equals(inputUserName) :correctNumber 와 inputUserName가 일치하는지 확인 일치하면 참
			 * !correctNumber.equals(inputUserName) : correctNumber 와 inputUserName가 둘이 일치하지 않음
			 *                                        !가 붙으면 아이디가 틀렸을때 참이 된다.
			 *       
			 *       */
		} else if(!userID.equals(inputId)) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (!userPW.equals(inputPW)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else { 
			System.out.println("잘못된 입력된 값 입니다.");
		}
			
}	
	
	public static void controlpractice6() {
		// 사용자로부터 회원 등급 입력 받기
		Scanner sc =  new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급");
		//권한이나 규칙을 설정할때 자주 사용하는 변수명 : Role
		String userRole = sc.next();
		
		//권한 출력
		System.out.println("해당 회원 등급의 권한");
		
		switch(userRole) {
		case "관리자":
			System.out.println("회원관리\r\n"
					+ "	게시글작성\r\n"
					+ "	게시글조회\r\n"
					+ "	댓글 작성");
		break;
		case "회원":
			System.out.println("게시글작성\r\n"
					+ "	게시글조회\r\n"
					+ "	댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("비회원은 게시글 조회만 가능합니다.");
		}
	
		
	}

	public static void controlpractice8() {
		/*
		키보드 두개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		연산결과 출력
		(두 개의 정수 모두 양수일때만 작동하며 없는 연산기호를 입력했을 경우
		"잘못 입력했습니다." 출력) 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("num2을 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.print("연산기호를 입력하세요: (+,-,*,/,%)");
		String operator = sc.next();
		String result;
	
		switch(operator) {
		case "+":
			result = "num1 + num2";
			break;
		case "-":
			result = "num1 - num2";
			break;
		case "*":
			result = "num1 * num2";
			break;
			// / % 0으로 나눌 수 없기 때문에 if문으로 값이 0이 될 경우 처리를 해줘야함 
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = "num1 / num2";
		case "%":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = "num1 % num2";
		default:
			System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
		return;
		}	
		System.out.println( num1 + " "+operator+" "+ num2 + "=" +result);
	}
	
  	public static void main(String[] args) {
		practice8();
		//castingPractice1();
		//castingPractice3();
		//controPractice1();
		//controlPractice10();
		//controlpractice5();
	//controlpractice6();
		//controlpractice8();

	}

}








