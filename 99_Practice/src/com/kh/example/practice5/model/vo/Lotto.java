package com.kh.example.practice5.model.vo;

import java.security.DomainCombiner;
import java.security.ProtectionDomain;
import java.util.Random;

//필드
public class Lotto {
private int lotto;

public int getLooot() {
	return lotto;
}

public void setLooot(int looot) {
	this.lotto = looot;
}
//생성자
public Lotto() {
	
}
//출력
public void information() {
	Random ran = new Random();
	for(int num=1; num<=6; num++) {
		int randomNumber = ran.nextInt(10) + 1;
		System.out.println("랜덤숫자 "+num+" : "+randomNumber);
	}
}
	//메인 메서드
	public static void main(String[] args) {
		Lotto 랜덤로또 = new Lotto();
		랜덤로또.information();
		
		
		
	
	

	}
}




