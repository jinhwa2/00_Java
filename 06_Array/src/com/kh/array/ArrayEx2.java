package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {
	/*public ArrayEx2(){
		//for 문을 활용한 배열 출력하기
		int numbers[] = new int[5]; //장바구니 표시 해야함 좌측과 우측 모두
		// 1 부터 4까지 배열에 숫자를 넣기
		//왜 0 부터 시작하냐면 index 0부터 시작하기 때문에 i = 0
		//length =길이 ,값의 크기나 값의 길이로 쓴다
		System.out.println("최대길이 : "+numbers.length);
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" +i+ "] = "+i);
		}
		*/
	public ArrayEx2() {
		
	}
	public void practice1() {
		int[]number = new int[10];
		for(int i=0; i<number.length; i++) {
			number[i]=i+1;
				System.out.println("number["+i+"] = "+number[i]);	
		}
	}	
		
	public void practice2() {
		int[] number = new int[10];
		for(int i=0;i<number.length;i++) {
			number[i] = number.length-i;
			System.out.println(number[i]);
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int size = sc.nextInt();
		int[] number = new int[size];
		for(int i=0; i<number.length;i++) {
			number[i] = i+1;
			System.out.println(number[i]);
		}
	}
		
	public void practice4() {
		String[] fruit = {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String inputString = sc.next();
		// 문자열을 문자 배열로 변환
		char[] charArray = inputString.toCharArray();
		// 검색한 문자 입력 받기
		System.out.print("검색한 문자를 입력하세요:");
		char searChchar = sc.next().charAt(0);
		
		// 검색할 문자의 개수를 저장할 변수 count 초기화
		int count = 0;
		//검색할 문자의 인덱스를 출력하기 위한 안내 메시지
		System.out.println("문자열에"+searChchar+" 가 포함된 인덱스: ");
		//문자열을 반복하여 검색할 문자의 개수와 위치를 출력
		for(int i=0; i<charArray.length;i++) {
			//문자열의 각 문자가 검색할 문자와 일치하는지 확인
			if(charArray[i]==searChchar) {
				System.out.println(i+"");
				//검색할 문자의 개수 증가
				count++;
			}
		}
	}

	public void practice6() {
		    //length      7  
		// index          0   1    2    3   4     5   6
		String[] week = {"월","화","수","목","금","토","일"};
		Scanner sc = new Scanner(System.in);
		System.out.print("0부터 6까지 숫자를 입력하세요: ");
		int inputNumber = sc.nextInt();
		// 입력한 숫자가 0 ~ 6 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if(inputNumber>=0 && inputNumber<=6) {
			System.out.println(week[inputNumber] + "요일");
		} else {
			System.out.println("잘못 입력 했습니다.");
		}
	
	}
	
	
	public void practice9() {
		//길이가 7인 배열을 생성
		//길이가 7인 배열을 생성하고, 1 ~ 45까지 랜덤한 숫자값을 넣어서 출력
			//num의 최종길이를 알기위해서 num.length를 사용
		int[] num = new int[7];
		//랜덤으로 숫자 랜덤으로 숫자 출력하기
			//랜덤으로 숫자를 출력하는 방법
			//1.Random 객체 사용 : 조금 더 넓은 범위로 랜덤을 사용
			//2.Math 객체에서 random() 메서드 사용:위 Random객체보다 작은범위
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45+1); //45 0 ~ 44 => 1 ~ 45
			System.out.println("num["+i+"]="+num[i]);
		}
	}
	
	public void practice7() {
		 Scanner sc = new Scanner(System.in);
		 // 배열의 길이 입력 받기
		 System.out.print("배열의 길이를 입력하세요: ");
		 int length = sc.nextInt();
		 // 입력된 길이로 배열 생성
		 int[] array = new int[length];
		 //배열의 각 인덱스에 값을 입력받아 초기화
		 for(int i =0; i<length; i++) {
			 System.out.print("인덱스 "+i+" 에 저장할 값을 입력하세요: ");
			 array[i] = sc.nextInt();
		 }
		 
		 //배열의 모든 요소 출력
		 System.out.println("배열의 값:");
		 	for(int i =0; i<length; i++) {
		 		System.out.println(array[i]+"");
		 	}
		 System.out.println();
		 //배열의 각 인덱스에 저장된 값들의 합 계산 및 출력
		 int sum = 0;
		 for(int i=0; i<length; i++) {
			 sum +=array[i];
		 }
		 System.out.println("배열의 값들의 합: "+sum);
	 }

	public void method1() {
		// 정수 0 1 2  10 20 30 출력하기
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		// 문자열 각 자리에 월 화 수 목 금 토 일 각 자리에 어떤 요일이 들어가 있는지 출력
		String [] str = {"월","화","수","목","금","토","일"};
		//for 문을 이용하여 출력  
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]+" "); //" " 해주나 안해주나 똑같은데 왜 해주는지 물어보기
		}
		// 실수 index 2 까지 만들어주고 출력  실수는 자유
		double[] dbl = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 12.1;
		for(int i=0; i<dbl.length; i++) {
	      System.out.println(dbl[i]+" ");
	}
		// 문자 'A' 'B'  'C' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A','B','C'};
		/*chr[0]= 'A';
		chr[1]= 'B';
		chr[2]= 'C';
		System.out.println(chr[0]);
		System.out.println(chr[1]);
		System.out.println(chr[2]); */
		for(int i=0; i<chr.length; i++) {
			System.out.println(chr[i]+" ");
		}
	
	}	
	public void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달가능 없으면 없는 치킨입니다. 출력
		String[] chickenMenu = {"양념치킨","후라이드치킨","간장치킨"};
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 메뉴를 입력하세요: ");
		String inputChic = sc.next();
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		for(String 칙킨:chickenMenu) {
			if(칙킨.equals(inputChic)) {
				found = true;
				break;
			}
		} if(found) {
			System.out.println(inputChic+" 배달 가능합니다.");
		} else {
			System.out.println(inputChic+"은 없는 메뉴입니다.");
		}
		
	}
		
		
	
	
	
	public static void main(String[] args) {
		ArrayEx2 ae2 = new ArrayEx2();
		//ae2.practice1();
		//ae2.practice2();
		//ae2.practice3();
		//ae2.practice4();
		//ae2.practice5();
		//ae2.practice6();
		//ae2.practice7();
		//ae2.method1();
		//ae2.practice17();
		//ae2.practice9();
		
		
	}

}
