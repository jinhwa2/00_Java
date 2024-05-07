package com.kh.practice.charCheck.exception;
              //Exception
public class CharCheckException extends Exception{
	
//생성자 : 기본	
	public CharCheckException() {
		super();
	}

//생성자 : 필수 어떤 문자가 들어오면 Exception 참조해서 처리하겠다.
	public CharCheckException(String msg) {
		super(msg);
	}


}
