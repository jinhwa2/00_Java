package com.kh.array.ex;

import java.util.ArrayList;

/*
 ArrayList�� �������� �߿��ؿ�
 ����Ʈ�� �迭�� ��������� ũ�Ⱑ ������ �Ǿ����� �ʱ� ������ ����
 ���ϴ� ��ŭ ���� �� ����
 
�̸��� ArrayList�� ������� ����!!! ���� �߿��ϴ� ��ǥ �ټ���
ArrayListEx<�ڷ���> ������ = new ArrayList<�ڷ���>();

�Ʒ� ���� �̾������� �ܿ켼�� �ܿ�ž� �ǿ�

int -> Inteber  //���ڸ��� �빮�ڷ� �ٲ����� ��� ��Ʈ,��Ʈ�� �� ���� ��
String -> String
double -> Double
add       �߰�
get       ��ȯ
set       ����
remove    ����
size      ���� Ȯ��
isEmpty   ����ִ��� Ȯ��
clear     ��� ����
 */
public class ArrayListEx {
	public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<Integer>();
	//index �ڸ���ġ 0
	//���� �߰���
	//�ڸ��� ��� �ֱ� ������ true
	System.out.println(num.isEmpty());
	num.add(10);
	System.out.println("�߰� Ȯ�� :  "+num.get(0));
	//��� ���� �ʱ� ������ false ����
	System.out.println(num.isEmpty());
	
	//ũ�� Ȯ�� = size length ������� ���� 
	 System.out.println(num.size());
	 //set �����ϱ� ��ġ ��� �����Ұž�?
	 //           key  value
	 num.set(     0, 20);   //�ʹ� �߿��ϴ�  10�� ��ġ�� 0�̿��� 20���� �ٲ��ٶ� �տ� 0
	 System.out.println("������ : "+num.get(0));
	 // ����, �� �������� �߰��� ���� �ϰ� ������ ���ݾ�
	 num.remove(0);
	 //���� �߱� ������ �ƹ��͵� ����
	 System.out.println(num.isEmpty()); //��� �ִ��� Ȯ��
}
}
