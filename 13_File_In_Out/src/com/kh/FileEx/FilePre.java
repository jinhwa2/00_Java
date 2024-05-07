package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {
	
    public FilePre() {
		
	}
	
	public void 메서드1() {
		File 텍스트파일 =  new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
	
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		} else { //존재하지 않는다면
			//만약에 파일 만들기 성공!
			try {
				
				
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName()+"파일이 생성되었습니다.");
				
			} catch (IOException e) {
				System.out.println("파일만들기 실패했습니다.");
				e.printStackTrace();
			}
		}
	
	}
	
    public void 메서드2() {
		//바탕화면에 뉴폴더라는 폴더 생성하고 뉴폴더 안에 파일생성.txt 파일 만들기
    	String 폴더경로 = "c:/Users/user1/Desktop/뉴폴더";
    	
    	//바탕화면 경로를 설정하는 방법             c:/Users/user1
    	String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
    	
    	System.out.println(바탕화면경로);
    	
    	
    	
    	
    	
    	
    	
    	File 폴더메이킹 = new File(폴더경로);
    	//바탕화면에 뉴폴더 라는 폴더가 존재하는지 확인
    	System.out.println("존재합니까? :"+폴더메이킹.exists());
    	
    	//만약에 폴더가 존재한다면 폴더가 이미 바탕화면에 존재합니다.라고 애기하고
    	if(폴더메이킹.exists()) {
    		System.out.println("폴더가 이미 존재합니다.");
    	} else {
    		//폴더생성
    		폴더메이킹.mkdir();
    		System.out.println(폴더메이킹.getName());
    		System.out.println(폴더메이킹.getPath());
    	}
    	//텍스트 파일 만들기
    	File 파일생성 = new File(폴더메이킹 +"/파일생성.txt");
    		if(파일생성.exists()) {
    			System.out.println("파일생성이 존재합니다.");
    		} else {
    			//존재하지 않는다면
    			try {
    				
    				파일생성.createNewFile();
    				System.out.println(파일생성.getName()+"파일이 생성되었습니다.");
    				
    				
    			} catch (IOException e) {
    				System.out.println("파일생성에 실패 했습니다.");
    				e.printStackTrace();
    			}
    		}
    	
	}
	
    public void 메서드3() {
    	String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
    	
    	//모든 폴더 생성
    	File 폴더들 = new File(바탕화면경로 + "뉴1/뉴2/뉴3");
    	폴더들.mkdirs();
    	
    	//파일 생성
    	File 파일 = new File(폴더들 + "/새로운파일.txt");
    	
    	
    	try {
    		
    		boolean 파일생성확인 = 파일.createNewFile();
    		System.out.println("파일이 생성되었나요?"+ 파일생성확인);
    		
    		//파일 크기 확인
    		System.out.println(파일.length());
    		
    		//파일 마지막 수정일 확인
    		System.out.println(파일.lastModified());
    		
    		//파일 삭제
    		파일.delete();
    		
    		
    	} catch (IOException e) {
			e.printStackTrace();
		}
	}

    public void 메서드4() {
    	//파일이름 변경해주기 
    	String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
    	File 텍스트파일 = new File(바탕화면경로 +"/newFFF/파일생성이름바꾸기.txt");
    	try {
			텍스트파일.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    
    public void 메서드5()	{
    	String 바탕화면경로 = System.getProperty("user.home")+"/Desktop";
    	File 텍스트파일 = new File(바탕화면경로 +"/newFFF/파일생성.txt");
    	File 새로운이름 = new File(바탕화면경로 +"/newFFF/변경된이름.txt");
    	
    	//파일 이름 변경하기
    	//만약에 파일이 존재할 경우 -> 파일 이름 변경 존재하지 않으면 변경 X
    	if(텍스트파일.exists()) {
    		//만약에 파일 이름이 성공적으로 변경했다면
    		if(텍스트파일.renameTo(새로운이름)) {
    			System.out.println("파일 이름이 성공적으로 변경되었습니다.");
    		} else {
    			System.out.println("파일 이름 변경에 실패했습니다.");
    		}
    	} else {
    		System.out.println("파일 이름이 존재하지 않습니다. 만들어주세요^^.");
    	}
    }
    
    //main 메서드 하나 만들기
    public static void main(String[] args) {
		FilePre 파일 = new FilePre();
		//파일.메서드1();
		//파일.메서드2();
		//파일.메서드3();
		파일.메서드5();
	}
}
