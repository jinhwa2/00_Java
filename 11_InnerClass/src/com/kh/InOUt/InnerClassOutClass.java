package com.kh.InOUt;
/*
 Ŭ���� �ȿ� �̸��� �ٸ� Ŭ������ ���� 
 * */
public class InnerClassOutClass {
	private int ���� = 10 ;
	
	//�⺻������ ctrl space enter
	public InnerClassOutClass() {
		
	}
	
	//���� Ŭ���� �����
	class InnerClass{
		void �ۿ��������ֱ�() {
			System.out.println("���ں��� :"+����);
			
		}
	}
	public static void main(String[] args) {
		InnerClassOutClass �ξƿ� = new InnerClassOutClass();
		InnerClassOutClass.InnerClass �� = �ξƿ�.new InnerClass();
		��.�ۿ��������ֱ�();
		
		
	}
}
