package com.kh.array.ex;

import java.util.Arrays;

public class ArraysEx2 {
	
	//�⺻ ������
	public ArraysEx2() {
		
	}
	
	public void method1() {
		//���� �迭 �����ϱ�
		int[] num = {  6   ,   4   ,   2   ,3 ,  5,  7,  9};
		//���� �����ϱ� Arrays.sort
		Arrays.sort(num);
		System.out.println(num);
		//���ĵ� ���� ����ϱ�
		System.out.println(Arrays.toString(num));
		//num �迭 �����ϱ�
		int[] abc = Arrays.copyOf(num, num.length);
				//num�� abc�� �� ���� �Ǿ�����
		System.out.println("����"+Arrays.toString(abc));
		//num�� abc�� ������ ���ϱ�
		System.out.println(Arrays.equals(num, abc));
		
	
	
	
	
	
	
	
	
	}
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}

}
