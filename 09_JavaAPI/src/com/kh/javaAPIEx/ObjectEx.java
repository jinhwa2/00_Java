
package com.kh.javaAPIEx;
/*
 Object : ��� �ڹ� Ŭ������ �ֻ��� Ŭ����
  		  ��� Ŭ������ �⺻���� ��ӹ޴� Ŭ����
  		  
	  Object Ŭ������ �⺻���� ����Ѵٶ�� ������ �ֱ� ������
	  		 ���� new Object�� ����ؼ� ������� ����
  		 �⺻���� ��� Ŭ������ Object�� �⺻���� �� �� �ְ� �������
	 ��ǥ �޼��� equals toString
 
 Ob Old Boy
 Yb Young Boy
 
 ject : �л��ϴ� ������
 �� ���� ��
 �� ���� ��
 */
public class ObjectEx {
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return  "Object���� ���� �������� �޼��� �Դϴ�.";
	}
	
	public static void main(String[] args) {
		//Object�� �⺻�̱� ������ ���� new�� ����ؼ� ��������x
		//�׷��ٰ� ����� ���� ���� �ƴ�
		
		//Object ���� ���콺�� �ø��� ����� ȭ������ @ ���� �ִ� �������� ������
		//Object ���Ϸ� �̵��ؼ� �� �� ����
		Object ������Ʈ = new Object();
		System.out.println(������Ʈ);
	}
}
