package com.kh.ListEx;

import java.util.ArrayList;
import java.util.List;

/*List : �ڷḦ ���������� ������ �ڷ� ����(�迭�� ���)
 �ε����� ������
 �ε����� ������ ���еǱ� ������ �ߺ� ������ ���� ����
 �������̽� ��ü�� ������ �Ұ����� ���������� �̿��� �� ����
 
 ��뿹��
 	List list = new ArrayList(3); // 3ĭ¥�� ����
 	
 E(Element) : ��Ҹ� ���ϴ� ��¡���� ����(�ڷ��� X)
            == Object String Student ��
               ��ü�� ������ �ʰ� ���� �� ����
 
 */
public class ListEx {
 public static void main(String[] args) {
	
	 //List ��ü �����ϰ� ArrayList �ν��Ͻ� ����
	 /*
	  * List list = new ArrayList(3);���� List�� ����
	  * List<�ڷ���> list = new ArrayList(3); <>�� Ÿ���� ���������� �ʾ�
	  * ����� ��� �߻�
	  * ���࿡ ������� ���ְ� �ʹٸ� List<�ڷ���>�� �־ ����� �� ����
	  * List<Object>�� �־ ����� �� ����
	  * Object = String Integer Boolean ��� ��� ��� ����
	  * 
	  * 
	  */
	 List list = new ArrayList(3); //3ĭ�� ���� �� ����
	 list.add("�ƹ��ų�"); //add�� ����ؼ� �߰��Ҽ� ����
	 list.add(new Object());
	 list.add(123123);
	 System.out.println(list);
	 
	 list.add(false); //3�� �ʰ��ؼ� ũ�Ⱑ �ڵ����� �þ�� ������ �����߻� X, �ڵ����� �þ�� ��
	 
	 System.out.println(list);
 
 
 }
}
