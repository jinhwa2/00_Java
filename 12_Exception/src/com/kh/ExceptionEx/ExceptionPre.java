package com.kh.ExceptionEx;

public class ExceptionPre {
	public static void main(String[] args) {
		
		
		// 0���� ������ �Ҷ� if �ۼ��ϸ� ����ó�� �߻�����
		try {
			//���ܰ� �߻��� �� ������ ����!
		int �������� = 10 / 0 ;
		
		System.out.println(��������);
				//������� Exception    ������
		} catch (ArithmeticException ������ܹ߻�) {
			System.out.println("��� ������ �߻��߽��ϴ�.");
		}
	
	 //try ����Ű try �ۼ��� ctrl space 
		try {
			//���ܰ� �߻��� �� ������ �õ��ϰ� ���� �ڵ� �ۼ�
			
			//index       0  1  2  [] �ȿ� �� �� �ִ� �ִ� ���� 2
			int[] �迭 = { 1, 2, 3};
			System.out.println(�迭[3]);
			
			
		} catch (Exception e) {
			System.out.println("������ ������ϴ�.");
		}
	
	}
}
