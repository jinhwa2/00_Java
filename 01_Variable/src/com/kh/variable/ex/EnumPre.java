package com.kh.variable.ex;

public class EnumPre {
	public enum �Һ��� {
		�л�, ������, ������
	};

	public enum �Ǹ��� {
		�Ҹž�, ���ž�, �߸ž�
	};

//������ : �⺻	
	public EnumPre() {

	}

//�޼���
	// void
	public void �޼���2() {
		System.out.println("�Һ���");
		�Һ���[] �Һ��ڵ� = �Һ���.values();
		for(�Һ��� ��: �Һ��ڵ�) {
			System.out.println(��);
		}
	}

	// void �޼���2�� ���� �Һ��ڿ� �Ǹ��ڸ� for-each ����ؼ� ���� ���
	
	public void �޼���3() {
	System.out.println("===�Ǹ���===");
	�Ǹ���[] �Ǹ��ڵ� = �Ǹ���.values();
	for(�Ǹ��� ��: �Ǹ��ڵ�) {
		System.out.println(��);

	}
	// �Һ��� �л� �Ǹ��� �Ҹž� ordinal() if�� ����ؼ� ���ϴ� ������ �޼��� 2 �ۼ�
	�Һ��� c = �Һ���.�л�;
	�Ǹ��� p = �Ǹ���.�Ҹž�;
	if(c.ordinal()>p.ordinal()) {
		System.out.println();
	} else {
		System.out.println();
	}
	
	
	}

	// ���θ޼���
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.�޼���3();
	}
}
