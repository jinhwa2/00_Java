package com.kh.oop.method.oop;

public class DrinkStore {
//�ʵ�
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout; //ok
	//�޼���
	//setter
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	//getter
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
		//������ : �⺻
	public DrinkStore() {
		
	}
		//������ : �ʼ� ����Ŀ �����̼� ���� ����ũ�ƿ�
	public DrinkStore(DrinkMaker maker,String location,String name,boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeout = takeout;
	}
		//void ordermakeDrink
	public void ordermakeDrink() {
		System.out.println(location+" "+name+" �� �ֹ��� ����");
		maker.makeDrink(); //�ռ� ������ ������� �Լ��� �����
		if(takeout) {
			System.out.println("����ũ�ƿ� ���ּ���.");
		} else {
			System.out.println("���峻���� �����Ҳ���.");
		}
		
	}
	//System.out.println(location+" "+name+" �� �ֹ��� ����");
	//���� takeout true ����ũ�ƿ� �ֹ�
	//else ���峻 ����
	
	
}
