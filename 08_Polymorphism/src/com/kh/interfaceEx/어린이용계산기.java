package com.kh.interfaceEx;

// ���� �⺻ ��� �޼��� implements �� ��������
// ���� 220v ����ؼ� ����� ��
// �������̽� ���~~~~~ �������̽��� ������� ������ ������ ������ �ü� ����
// ���������� ������ �ö� , �Ἥ(�ĸ� �Ἥ) interface ���ϸ��� �ۼ����ָ��
public class ��̿���� implements ����, ��� {
	/* ���.java �������̽����� ������ �����ѱ�� �������� */
	@Override
	public void �����ѱ�() {
		System.out.println("������ ŵ�ϴ�.");
	}

	@Override
	public void ��������() {
		System.out.println("������ ���ϴ�.");
	}

	/* ����.java �������̽����� ������ �� �� �� �� ������ */
	@Override
	public int ��(int a, int b) {
		return a + b;
	}

	@Override
	public int ��(int a, int b) {
		return a - b;
	}

	@Override
	public int ��(int a, int b) {
		return a * b;
	}

	@Override
	public double ��(int a, int b) {
		return a / b;
	}

	@Override
	public int ������(int a, int b) {
		return a % b;
	}

}
