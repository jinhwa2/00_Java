package com.kh.example.practice5.model.vo;

import java.security.DomainCombiner;
import java.security.ProtectionDomain;
import java.util.Random;

//�ʵ�
public class Lotto {
private int lotto;

public int getLooot() {
	return lotto;
}

public void setLooot(int looot) {
	this.lotto = looot;
}
//������
public Lotto() {
	
}
//���
public void information() {
	Random ran = new Random();
	for(int num=1; num<=6; num++) {
		int randomNumber = ran.nextInt(10) + 1;
		System.out.println("�������� "+num+" : "+randomNumber);
	}
}
	//���� �޼���
	public static void main(String[] args) {
		Lotto �����ζ� = new Lotto();
		�����ζ�.information();
		
		
		
	
	

	}
}




