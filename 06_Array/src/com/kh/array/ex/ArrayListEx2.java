package com.kh.array.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	//�⺻������
	public ArrayListEx2 () {
		
	}
	
	public void method1() {
		//���� �ٳ��� ���
		ArrayList<String> list = new ArrayList<>();
		
		// add�� ����ؼ� ���� �ٳ��� ��� �߰�
		list.add("����");
		list.add("�ٳ���");
		list.add("���");
		
		//get 0 1 2 ����ؼ� ��  index �ڸ��� �� ����ϱ�
		
		System.out.println("list.get(0) : " + list.get(0)); //����
		System.out.println("list.get(1) : " + list.get(1)); //�ٳ���
		System.out.println("list.get(2) : " + list.get(2)); //���
		
		//�ٳ��� ->Ű�� ����, set�� ����ؼ�
		list.set(1,"Ű��");
		
		//size �� �̿��ؼ� ũ�� Ȯ�� 
		System.out.println("�ٱ��� ũ�� : " +list.size());
		
		//remove ����ؼ� Ű�� ����
		list.remove(1);
		
		//isEmpty() ��� �ִ��� Ȯ��
		System.out.println("��ٱ��� ��� �ֳ��� ? : "+list.isEmpty());		
		//��ٱ��� ���� �� �ִ��� Ȯ��!
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//������ ����� for ��
		System.out.println("==============");
//	for( ���� ������� ������: �ݺ��Һ�����      ) {
//		System.out.println();
//	}
		for(String ����:list) {
			System.out.println(����);
		}
		
		
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//����Ű�� ���� �����ؼ� �ؿ� �ٿ��ֱ� ctrl + alr + �� 
		//���� ȣ���� ����� ������ add
		animal.add("����"); 
		animal.add("ȣ����");
		animal.add("�����");
		animal.add("������");
		
		//size() ������ ��� �ִ��� Ȯ��
		System.out.println(animal.size());
		//����� ->�䳢�� ���� set
		animal.set(2, "�䳢");
		//get���� ���� Ȯ��
		System.out.println("����1: "+animal.get(0));
		System.out.println("����2: "+animal.get(1));
		System.out.println("����3: "+animal.get(2));
		System.out.println("����4: "+animal.get(3));
		//remove ������ ����
		animal.remove(3);
		//animal.remove(������); >�����ϴ�
		//for���� Ȯ���ؼ� get���
		for(String name:animal) {
			System.out.println("����! :"+name);
		}
		//clear ����ؼ� ��� ����
		animal.clear();
		//���������� isEmpty() ��� ������ �ƴ��� Ȯ��
		System.out.println("��� �̻��սô�.");
		System.out.println("�������� ��� ����ֳ���? "+animal.isEmpty());
		
	}
	
	public void method3() {
		// ���� ����
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== ���ڸ޴� ===");
		// pizza �������� ������������ ����δ� ���ڵ��� �߰����ּ���
		pizza.add("��������");
		pizza.add("������������");
		pizza.add("����δ�����");
	
		//get �� Ȱ���ؼ� ���
		System.out.println("���� 1��: "+pizza.get(0));
		System.out.println("���� 2��: "+pizza.get(1));
		System.out.println("���� 3��: "+pizza.get(2));
		//get�� �ϳ��ϳ� ���� ����ϰ�
		//��κ��� �Ҷ��� �Ʒ�ó�� ���
		System.out.println("��� �޴� ����:"+ pizza);
		
		//set Ȱ���ؼ� ����δ� -> ���ξ���
		pizza.set(2, "���ξ���");
		
		//remove ���ξ���
		pizza.remove("���ξ���");
		
		//for �� Ȱ���ؼ� ���
		for(String ���� : pizza) {//String ���� = ���� for������ int i =0 -> int i/String i = 0 ->String i
			System.out.println("���ڵ���: "+ ����);
		}
		System.out.println("���ڰ��԰� ����� �����Դϴ�.");
		//�޴� ��� ����
		pizza.clear();
		//�޴� ��� �����ƴ��� Ȯ�� isEmpth()
		System.out.println("�޴��� ��� �����Ǿ�����? "+pizza.isEmpty());
	
	
	}
	
		
	
	
	
	
	
	
	
	
	//����
	public static void main(String[] args) {
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		ae.method3();

	}

}
