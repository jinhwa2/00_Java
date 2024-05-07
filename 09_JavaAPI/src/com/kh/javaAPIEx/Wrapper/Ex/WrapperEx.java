package com.kh.javaAPIEx.Wrapper.Ex;
/*
Wrapper = ���δ� 
�⺻������ Ÿ�� : primitive types
	�⺻ �ڷ��� Ÿ���� ��ü�� ���μ� ����� �� �ִ� Ŭ����
	�⺻���� �������ִ� int, double, char, short, long, boolean, float, byte
	ArrayList �θ� �� ��� ������
	Byte = byte
	Short = short
	Integer = int
	Long = long
	Float = float
	Double = double
	Character = char
	Boolean = boolean
 */
public class WrapperEx {
   public static void main(String[] args) {
	//Byte
	 Byte ����Ʈ�� = 10;
	 //Byte ��ü�� �� ���� ��ü�� �ƴ� �⺻ byte������ ����� ��
	 byte �⺻����Ʈ�� = ����Ʈ��.byteValue();
	 System.out.println("����Ʈ �� : "+����Ʈ��);
	 System.out.println("�⺻����Ʈ �� : "+�⺻����Ʈ��);
	 
	 //Short
	 Short ��Ʈ�� = 20;
	 short �⺻��Ʈ�� = ��Ʈ��.shortValue();
	 System.out.println("   ��Ʈ�� :"+��Ʈ��);
	 System.out.println("�⺻��Ʈ��:"+�⺻��Ʈ��);
	 
	 //Integer
	 Integer �������� = 30;
	 int �⺻�������� = ��������.intValue();
	 System.out.println(" �������� : "+��������);
	 System.out.println("�⺻��������: "+�⺻��������);
	 //Integer -> int �⺻��������
	 //��ü�� �⺻���� ������ ���
	 
	 //Long
	 Long �հ� = 40L;
	 long �⺻�հ� = �հ�.longValue();
	 System.out.println("�հ� : "+�հ�);
	 System.out.println("�⺻�հ� :"+�⺻�հ�);
	 //Long -> long �⺻�հ�
	 
	 //Float
	 Float �÷԰� = 50.5f;
	 float �⺻�÷԰� = �÷԰�.floatValue();
	 System.out.println("�÷԰� :"+�÷԰�);
	 System.out.println("�⺻�÷԰� :"+�⺻�÷԰�);
	 //Float -> floa �⺻�÷԰�
	 
	 //Double
	 Double ���� = 60.6;
	 double �⺻���� = ����.doubleValue();
	 System.out.println("����: "+����);
	 System.out.println("�⺻����: "+�⺻����);
	 //Double -> double �⺻����
	 
	 Character ĳ���Ͱ� = 'A';
	 char �⺻ĳ���Ͱ� = ĳ���Ͱ�.charValue();
	 System.out.println("ĳ���Ͱ� :"+ĳ���Ͱ�);
	 System.out.println("�⺻ĳ���Ͱ� :"+�⺻ĳ���Ͱ�);
	 //Character -> char
	 
	 //Boolean
	 Boolean �Ҹ��� = true;
	 boolean �⺻�Ҹ��� = �Ҹ���.booleanValue();
	 System.out.println("�Ҹ��� :"+�Ҹ���);
	 System.out.println("�⺻�Ҹ���:"+�⺻�Ҹ���);
	 //Boolean ->boolean
}
}
