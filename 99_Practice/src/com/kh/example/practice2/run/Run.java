package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

//Product �� �ڳ�ͼ� �����ϴ� Ŭ����
public class Run {
	//���� �޼���
	public static void main(String[] args) {
		//Product ��ü ����
		Product product = new Product(); //������ �߸� ���콺 ���� �÷����� import�Ѵ� ���������� ���δ�Ʈ ������ �����ðž� �����ذ�
		
		//���� ���� : ��� ������� ��� �귣��
		product.setName("���");
		product.setBrand("�귣��");
		product.setPrice(5000);
		
		//������ �������� �ʰ� ���ؼ� �����ؼ� ���� �ؼ� �����ٰž�
		
	}

}
