package com.kh.interfaceEx;

public class ������ {

	public static void main(String[] args) {
		��ǻ�� ������ = new ��ǻ��();
		������.�����ѱ�();
		������.��������();
	
		��Ź�� ������ = new ��Ź��();
		������.�����ѱ�();
		������.��������();
		
		//��̿� ��� ����
		��̿���� c1 = new ��̿����();
		c1.�����ѱ�();
		c1.��������();
		
		//��̿� ���� ��� �׽�Ʈ
		int a = 10;
		int b = 5;
		// ctrl alt ȭ��ǥ �Ʒ����
		System.out.println(a + " + " + b + " = "+c1.��(a,b));
		System.out.println(a + " - " + b + " = "+c1.��(a,b));
		System.out.println(a + " * " +b + " = "+c1.��(a,b));
		System.out.println(a + " / " + b + " = "+c1.��(a,b));
		System.out.println(a + " % " + b + " = "+c1.������(a,b));
		
		//���л��� ��� ����
		���л����� c2 = new ���л�����();
		c2.�����ѱ�();
		c2.��������();
		
		//���л��� ���� ��� �׽�Ʈ
		a = 20 ;  //�տ� ��Ʈ ����� ������ �ٽ� �Ƚᵵ ��
		b = 12;
		
		System.out.println(a + " + " + b + " = "+c2.��(a,b));
		System.out.println(a + " - " + b + " = "+c2.��(a,b));
		System.out.println(a + " * " +b + " = "+c2.��(a,b));
		System.out.println(a + " / " + b + " = "+c2.��(a,b));
		System.out.println(a + " % " + b + " = "+c2.������(a,b));
		
		
	
	}

}
