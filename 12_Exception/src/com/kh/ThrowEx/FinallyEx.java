package com.kh.ThrowEx;
/*
 Exception ���� try catch finally
 
  try ctrl space catch finally
  
  try {
  //���ܰ� �߻��� �� ������ �����ϴ� �ڵ�
  
  } catch(Exception e) {
  //���ܰ� ���ܼ� ����̳� �����ϴ� �ڵ�
   
   
  }finally {
  //���� �߻��� ������� ������ �����ϴ� �ڵ�
  //���ϴݱ�, ���� ���� ��
  }
 * */
public class FinallyEx {
 public static void main(String[] args) {
	try {
		int ��� = 10 / 0 ;
		
		
	} catch(Exception e) {
		System.out.println("���� 0�� �ȵ˴ϴ�. ^^!");
	} finally {
		System.out.println("���� �̸� ������~~~!");
	}
}

}
