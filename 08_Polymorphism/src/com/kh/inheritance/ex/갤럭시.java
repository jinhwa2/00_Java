package com.kh.inheritance.ex;

// extends ����Ʈ�� ��ӹޱ�
/*
 * 
 */
public class ������ extends ����Ʈ�� {
//�ʵ�
	private int �ȵ���̵�;

	// �޼���
	// Setter
	public void set�ȵ���̵�(int �ȵ���̵�) {
		this.�ȵ���̵� = �ȵ���̵�;
	}

	// Getter
	public int get�ȵ���̵�() {
		return �ȵ���̵�;
	}

	// ������ : �⺻ ��Ʈ��+�����̼� ����
	public ������() {

	}

	// ������ : �ʼ� ��Ʈ ����Ʈ ���� ��
	public ������(String ȭ��, String ��Ż�, String ����, int �ȵ���̵�) {
		super();
		this.�ȵ���̵� = �ȵ���̵�;

	}
	//@Override toString  alt shift s s
	@Override
	public String toString() {
		return "������ ���� : " + �ȵ���̵� +  " / "  + super.toString() + "]";
	}
	
	

	// @Override toString ��Ʈ ����Ʈ ��������

}
