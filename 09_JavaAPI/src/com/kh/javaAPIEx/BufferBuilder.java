package com.kh.javaAPIEx;
/*
String : ���� �� ����;
���ڳ� ���ڿ��� ����� �� ��� �� ������ �ٸ� ���� �־��ִ� ������
�����ϰų� �����ϴ� ���� ����

�޸� ũ�Ⱑ ���� �� �ִ� ȯ��, �����ϰ� ������ �ص� ������ ����
StringBuffer : ���� �����忡�� ���ÿ� ���Ǿ �����ϰ� �۾��� ó�� (����ȭ)
StringBuilder : �ϳ��� �����忡�� ����ϴ� ���� ȿ�� (�񵿱�, ��õ)

Thread : ��ǻ�� ������ ����Ǵ� �������� ���� �帧
���� : ��û�� ����� ���ÿ� �Ͼ ���� �̾߱���
�񵿱� : ��û�� ����� ���ڸ����� ���ÿ� �Ͼ�� ���� 
 */
public class BufferBuilder {
	//���� �ൿ�� ������ �� �޼���
	
	//�ٷ� �����ϰ� ����ϰ� �;� -> main
	public static void main(String[] args) {
		//1. StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append("World");
		System.out.println(buffer.toString());
		
		//2. StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append("World");
		System.out.println(builder.toString());
		
	
	}
	
}
