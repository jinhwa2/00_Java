package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		// substing �޼��带 ����ؼ� ���ڿ��� Today ����
		String ����1 = "Today is a beautiful day.";//������ �Ƹ��ٿ� ���̴�.
		String ���꽺Ʋ = ����1.substring(0,5);
		System.out.println(���꽺Ʋ);
		
		// toUpperCase �޼��带 ����ؼ� ��� �빮�ڷ� ��ȯ
		String ����2 = "Programmin is fun and challenging";
		String ������ = ����2.toUpperCase();
		System.out.println("�빮�ڴ�? "+������);
		
		// toLowerCase �޼��带 ����ؼ� ��� �ҹ��ڷ� ��ȯ
		String ����3 = "Leanrning new things is exciting";//���ο� ���� ���� ���� ��̷ο� ���̴�
		String ���ο� = ����3.toLowerCase();
		System.out.println("�ҹ��ڴ�? "+���ο�);
		
		// split Ȱ���ؼ� ���ڿ��� " " �� �����ϱ�
		String ����4 = "A good medicine tastes bitter"; //���� ���� ����
		String[] ����Ʈ = ����4.split(" ");
		for(String ���� :����Ʈ) {
			System.out.println(����);
		}
		
		// replace Ȱ���ؼ� more �� less �� ��ü
		String ����5 = "The more, the better";
		String ���÷� = ����5.replace("more", "less");
		System.out.println(���÷�);
		
		// charAt ����ؼ� 6��° ���ڸ� ��������			
		String ����6 = "Walls have ears"	; //������ �����Ե� ���� ���� �ִ�.
		char ����Ʈ = ����6.charAt(5);
		System.out.println(����Ʈ);
		
		// substing �޼��带 ����ؼ� his���� ������ ����
		String ����7 = "Every dog has his day";
		String ���꽺Ʋ2 = ����7.substring(14);
		System.out.println(���꽺Ʋ2);
		

	}

}
