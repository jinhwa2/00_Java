package com.kh.inheritance.ex;

//�ڽ�Ŭ����
public class ������ extends ����Ʈ��{

//�ʵ�
	private int IOS ; // ������ �ü��
//�޼���
	//Setter
	public void setIOS(int iOS) {
		IOS = iOS;
	}
	//Getter
	public int getIOS() {
		return IOS;
	}
	
	
	//������ : �⺻
	public ������() {
		
	}
	//������ : �ʼ�
	public ������(String ȭ��, String ��Ż�, String ����,int iOS) {
		super(ȭ�� , ��Ż�, ����);
		this.IOS = iOS; //���� �빮�ڴ� ���� �ȵȴ�
	}
	
	
	//toString
	public String toString() {
		return "������ ���� : " + IOS + "/" + super.toString();
	}
	
	
	
	
}
