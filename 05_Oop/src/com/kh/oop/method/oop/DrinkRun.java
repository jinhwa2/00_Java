package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		//���� ���� ��ü ����
		DrinkMaker drinkMaker = new DrinkMaker("�Ƹ޸�ī��",2,3);
		//���� ���� ��ü ����
	    DrinkStore drinkStore = new DrinkStore(drinkMaker,"����","�����ڷ���",true);
	     
	     drinkStore.ordermakeDrink();
	     //���� ���� ��ü ����
	     
	}

}
