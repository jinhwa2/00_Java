package com.kh.oop.constructor;

/* ������
	 ������ ���ϴ� ������ �ʱ�ȭ�� �� ����
	 
	 �ʱⰪ�� = 0; ���� �Ǿ� ���� �� �ʱⰪ�� 1�� �־��ָ�
	 �ʱⰪ�� 1�� �ʱ�ȭ��
	 
	 1. ��ȯ���� ����(return ��� X ,void X �� �� ���� �������� ����
	 2. ��ü(Ŭ����)�� �ʱ�ȭ �ϴ� ����� ���� ��� ��� ��� ����
	 
	 	���� ����
	 		1.�⺻ ������ - �ʼ��� ����
	 		  public Ŭ�����̸�() {
	 	
	 		 }
	 		2.�ʼ� ������ - �ʼ��� �޾ƾ� �ϴ� ���� ������
	 		 			-�ʼ��� �޾ƾ� �ϴ� ���� �ʵ忡 ���� ���� ����
	 		  public Ŭ�����̸�(String ����, int ����	, char ����) {
	 		  	  (���⼭ ������� �ʵ尪�� ����)
	 		  	  this.������1 = ����;
	 		  	  this.������2 = ����;
	 		  	  this.������3 = ����;
	 		  		
	 		  		}
	 		 3.���� ������ ������ 
	 		 	�ʵ峪 �����ڿ��� ���� �������� ������
	 		 		
	 
	 
 * */
public class ConstructorEx {
	//�ʵ� ������ ����
	public String name;
	public String phone;
	public    int idNo;
	public    int money;
	//���� ������ ������
	//������ �⺻, �ʼ�������, ���� ������ ������
	// �⺻������
	public ConstructorEx() {
		
	}
	// �ʼ������� ��ȣ�ȿ� �Ű������� �ʼ��� �����ϴ� ������
	//�� ��(�߸�) ˿ ��(����,����) ܨ ��(���ϴ�) � ��(���ڰ�)
	
	
	//                   �ʼ��� �̸� 
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	
	
	/*
	public ConstructorEx(String inputName,String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
	}
	*/
	//                   �ʼ��� �̸� �ڵ�����ȣ ���̹�ȣ �ݾ�
	public ConstructorEx(String inputName,String inputNumber,int inputId) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
	}
	//
	public ConstructorEx(String inputName,String inputNumber,int inputId,int inputmoney) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
		this.money = inputmoney;
	}
	
	//���� ������ ������
	/* ���� ������ �����ڴ� �ʱ��� ���� �������ֱ� ������
	 �Ű�������(�Ķ����) �ʼ��� �־����� �ʾƵ�������
	 �⺻ �����ڿ� ������� �Ȱ��Ƽ� �������� ���� ������
	 ����� ���Ƿ� �Ű������� �־���
	 ������ public ConstructorEx(){}����Ҽ� ����
	 ��� ���� ���� ����
	 
	 */
	public ConstructorEx(int a) {
		//�⺻���� ���� �����ؼ� �����ϴ� ������
		//������ ������ ���� �������ְ� ���� ���� ������ �� �ֵ��� ����
		name = "�̸��� �Է����ּ���."; //String �̱� ������ ���ڿ��� �־����
		phone = "��ȣ�� �Է����ּ���."; //String �̱� ������ ���ڿ��� �־����
		idNo=             1; //int �̱� ������ ���ڰ��� �־����
		money =           0;//int �̱� ������ ���ڰ��� �־����
		
		
	}
	
	
	public static void main(String[] args) {

	}

}
