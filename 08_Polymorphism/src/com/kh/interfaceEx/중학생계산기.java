package com.kh.interfaceEx;

//���� ���⸦ ������ͼ� ���� �� �޼��� �ϼ�!
public class ���л����� implements ���,���� {

	/* ���� interface �� �������� ���� */
	@Override
	public int ��(int a, int b) {
		return a + b ;
	}
	@Override
	public int ��(int a,int b) {
		return a - b ;
	}
	@Override
	public int ��(int a,int b) {
		return a * b ;
	}
	@Override
	public double ��(int a,int b) {
		return a / b ;
	}
	@Override
	public int ������(int a,int b) {
		return a % b ;
	}
	//��� �������̼� �����ͼ� �ϼ�
	@Override
	public void �����ѱ�() {
		System.out.println("���л��� ���⸦ ŵ�ϴ�.");
	}
	
	@Override
	public void ��������() {
		System.out.println("���л��� ���⸦ ���ϴ�.");
	}



}
