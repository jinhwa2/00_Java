package com.kh.oop.constructor;
//1.ȸ������
public class Join {
	// �ʵ� ȸ����ȣ ���̵� �̸� ����ó
	public int memberNo; //ȸ�������� ����
	public String memberId; //ȸ���� �ۼ��� ���̵� nickName
	public String memberName;
	public String phoneNumber;

	// ������ �⺻  �ʼ�
	public Join() { //�ʼ�x
		
	}
	// �ʼ�������
	public Join(int memberNo,String memberId,String memberName, String phoneNumber) { //�ʼ�o �츮 ȸ�翡�� �ʿ��� ������ ��� ���� ��
	//()�ȿ� ���� ������ �߿����� �ʴ�. 
		//�̰��� �ʵ忡 �ִ� memberNo �� = ���߿� �ۼ��� memberNo�� �ְڽ��ϴ�.
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.phoneNumber = phoneNumber;
	}
	// �޼��� = Ŭ���� �ȿ� �����ϰ�, Ư�� ����� �� �� �ֵ��� ������� �ڵ� ����
		//void �޼��� : ����� �������� ����
	public void memberInfo() {
		System.out.println("��� ��ȣ  : "+memberNo);
		System.out.println("��� ���̵�: "+memberId);
		System.out.println("����̸�   : "+memberName);
		System.out.println("�������  : "+phoneNumber);
		System.out.println("---------------");
	}
	//�������� �������ִ� ���� �޼���
	public static void main(String[] args) {
		System.out.println("=== kh ���� ȸ�� ���� Ȯ�� ====");
		
		// ȸ��1�� ���� ���� Ȯ��
		// ȸ������ ��ü ����
		Join member1 = new Join();
		
		//�ʼ��� ����
		member1.memberId = "������";
		member1.phoneNumber ="���׶��";
		member1.phoneNumber ="���׶��";
		
		member1.memberInfo();
		System.out.println("================");
		Join member2 = new Join();
		member1.memberId = "�л��޸�";
		//ȸ�������� �� �ʼ��� �ۼ��ؾ� �ϴ� �ʼ� �ۼ��� ����
		//
		Join member3 = new Join(3,"�Ŀ�����","�ڿ���","010-111-1111");
		member3.memberInfo();
	
	//member4  member5 ȸ������ ��Ŵ
	//member4 �⺻������ ������ ȸ������ ��Ű��
	//�ɹ���ȣ �ɹ��̸� memberInfo() member4
	//4 ���ƴ�
		
	//member5 �ʼ� ������ ������ ȸ������ ��ũ��
	//member5 info()
	//5 "���۸�" "�� ����" "010-1938-1932"
	
		Join member4 = new Join();
		member4.memberNo  = 4;
		member4.memberId = "���ƴ�";
		
		member4.memberInfo();
		System.out.println("================");
		Join member5 = new Join(5,"���۸�","�� ����","010-1938-1392");
	
		member5.memberInfo();
	}

}
