package com.kh.ThrowEx;
/*
Ŭ���� �̸� ��ġ�� �ۼ��� �ѹ��� ���༭ try catch �ۼ��� ������ 
try - catch ���� �ۼ��ϰų� throw �� ����ؼ� ���� ó���� ����
 * */
public class ThrowEx {
	
	public ThrowEx() {
		// TODO Auto-generated constructor stub
	}
	public void �޼���()	throws Exception {
		System.out.println("���ܰ� �߻��߽��ϴ�.");
	}
	public static void main(String[] args) throws Exception {
		ThrowEx ���ο쿹�� = new ThrowEx();
		���ο쿹��.�޼���();
		
	}
}
