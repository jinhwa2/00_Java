package com.kh.oop.method.ex;

public class IceCream {
//�ʵ�
	private String name;
	private int suger;
	private boolean milk;
//�޼���
	//setter
	//getter
	public void setName(String name) {
		this.name = name;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public String getName() {
		return name;
	}
	public int getSuger() {
		return suger;
	}
	public boolean isMilk() {
		return milk;
	}
	
	//������ : �⺻
	public IceCream() {
		
	}
	//������: �ʼ� �̸� ���� ��������
	public IceCream(String name,int suger,boolean milk) {//Ÿ���� �߿��Ѱ��� ������ �߿����� ����
		this.name = name;
		this.suger = suger;
		this.milk = milk;
	}
	//void makeIceCrem() {
	//���̽�ũ�� ����� �̸� ���� 
	//�����߰��ϸ� �����߰� �������߰� �ϸ� ���� ���߰� �������� ���
	//���̽�ũ�� ��> ���θ޼��� ���ٲ���
	
	public void makeIceCrem() {
		System.out.println("�̸���: "+name);
		System.out.println("������: "+suger+" g");
		if(milk) {
			System.out.println("�����߰�");
		} else {
			System.out.println("�������߰�");
		}
		System.out.println("���̽�ũ���� ����������.");	
		
	}
}
