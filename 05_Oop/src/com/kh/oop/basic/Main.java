package com.kh.oop.basic;

public class Main {
	
	//������ (�ʼ��� ���� �־�� �ϰų� �Ǵ� �ʱ⿡ ���� ������ �����ϴ� �޼���)
	public Main() {
		
	}
	
	//���� ���� ���� �߿��� ���������� ����� ���ϸ� ����
	public static void main(String[] args) {
		Main main = new Main();
		//public static void practice2() {}
		//������ �޸� ������ �������� �־��������
		//���� static�� �ƴ϶� ���� ����
		main.practice2();
	}
	// ���� ���� ���� �߿��� ���������� ����� ���ϸ� ����
		public void practice1() {
			// ��Ű Ŭ������ ��ü ����
			��Ű myCoockie = new ��Ű();
			
			//��Ű�� ũ��� ����� ����
			//��ü�� �Ӽ� ����
			myCoockie.size = "����";
			myCoockie.shape = "���׶��";
			
			//��Ű�� ���� ���� ���
			System.out.println("��Ű�� ũ�� :" + myCoockie.size);
			System.out.println("��Ű�� ���� :" + myCoockie.shape);
			
			��Ű ī���Ǹſ���Ű = new ��Ű();
			ī���Ǹſ���Ű.size = "�ƴ���";
			ī���Ǹſ���Ű.shape = "�����";
			
			System.out.println("��Ű�� ũ��: "+ī���Ǹſ���Ű.size);
			System.out.println("��Ű�� ���: "+ī���Ǹſ���Ű.shape);
		}
	
		
		public void practice2() {
	// Nation ��ü ����
		Nation ���� = new Nation();
		
		����.name = "ȫ�浿";
		����.age = 55;
		����.gender = 'F';
		����.jumin = "550101-2345678";
		
		System.out.println("�̸� :" +����.name);
		System.out.println("���� :"+����.age);
		System.out.println("���� :"+����.gender);
		System.out.println("�ֹι�ȣ : "+ ����.jumin);
		
		����.speakkorean();
		����.welfare();
		
		Nation ����2 = new Nation();
		����2.name = "��¯��";
		����2.age = 5;
		����2.gender = '��';
		System.out.println("�̸� :"+����2.name);
		System.out.println("���� :"+����2.age);
		
	
		
		
		//ȫ�浿 ��¯�� ������ �ǹ�
		����.�������ǹ�();
		����2.�������ǹ�();
			
		
	}
	
}
