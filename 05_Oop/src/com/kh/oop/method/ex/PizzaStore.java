package com.kh.oop.method.ex;

public class PizzaStore {
	//�ʵ� art shift s /�ٸ��� üũ ��/
	//�ʵ� �ܿ��� ��� �޼���
	private String pizzaName; //���ڸ�
	private int pizzaPrice; //���ڰ���
	
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	
	//���� ���� �����Ͷ�
	
	//�޼��� : ������ : �⺻
	
	public PizzaStore() {
	
  }
	//�޼��� : ������ : �ʼ� ������ �̸� ������ ����
	public PizzaStore(String pizzaName,int pizzaPrice) {
		this.pizzaName = pizzaName ;
		this.pizzaPrice = pizzaPrice;
	}
	//�޼��� : void
	public void inforPizza() {
		System.out.println("�����̸�: "+pizzaName);
		System.out.println("���ڰ���: "+pizzaPrice);
		
	}
	
	//�޼��� : main /����Ű main + ctrl + space
	public static void main(String[] args) {
		//���� ��ü
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("����δ� ����");
		pizza1.setPizzaPrice(11000);
		pizza1.inforPizza();
		
		System.out.println("-------------------------");
	
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("������������");
		//���� ���� ���� ���� ���°��� ���� �ʱ� ���ؼ� ���� ��� ���ټ� �ֳĸ�
		pizza2.inforPizza();
		System.out.println("-------------------------");
		//�ʼ� �����ڷ� ���� ����
		PizzaStore pizza3 = new PizzaStore("ġ������",13000);
		pizza3.inforPizza();
	}
	
	
}
