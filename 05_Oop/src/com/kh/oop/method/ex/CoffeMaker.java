package com.kh.oop.method.ex;

public class CoffeMaker {
// �ʵ�
	private String coffeType; //Ŀ�� ����
	private int sugar; //������
	private boolean milk; //���� ����//���ҽ� �Ҹ����� ���� �ƴ϶� ���� üũ
	
	//getter - boolean ���� ��� get �� �ƴ϶� is ǥ��
	public void setCoffeType(String coffeType) {
		this.coffeType = coffeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public String getCoffeType() {
		return coffeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}

	
//�޼��� ���� ���ְ� ����
	//������ : �⺻
	public CoffeMaker() {
		
	}
	//������ : �ʼ� 
	public CoffeMaker(String coffeType,int sugar,boolean milk) {
		this.coffeType = coffeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	//void
	public void makeCoffee() {
		System.out.println("Ŀ�Ǹ� �����մϴ�.");
		System.out.println("����: "+coffeType);
		System.out.println("����: "+sugar+" g");
		//���࿡ ������ �߰� �ƴٸ�
		if(milk) {
			System.out.println("���� �߰�");
		} else {
			System.out.println("���� ���߰�");
		}
		System.out.println("Ŀ�ǰ� �غ�Ǿ����ϴ�.");
	}
}
