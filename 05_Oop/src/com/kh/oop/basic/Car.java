package com.kh.oop.basic;

public class Car {
	// �ʵ�
	public String color; //���� ����
	public int speed; // ���� �ӵ�
	public String door; 
	public String window; 
	public String sunRoof;
	public String insurance;
	
	//������ = �޼ҵ带 ��ų� �ʱ�ȭ�� ���� ������
	public Car() {

	}
	// ������ = �ʼ� �ɼ�
	//�����ڴ� Ŭ�����̸��� �Ȱ��ƾ� �Ѵ�
	//�������̸� = Ŭ�����̸� = ���ϸ�
	//public Car(���ڷ� ���� �� ����, ���ڷ� ���� �� �ӵ�) {����� �ӵ��� �ʼ��� ��
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	// �޼���
	public void displayInfo() {
		System.out.println("   �� ����: ");
		System.out.println("Color :"+color);
		System.out.println("Speed :"+speed);
	}
	//���� �޼���
	public static void main(String[] args) {
		//Car �� ������ ��������
		Car myCar = new Car();
		myCar.color = "������";
		System.out.println("���� �� ���� : "+myCar.color);
		
		//���忡�� ���� ������ �ϰ� �����̶� ������� �����̵� ��Ȳ
		//����������� �����̶� ������� ����������� ���ϴ� ���·� �� ���
		//order = (������)�ֹ�
		Car orderCar = new Car("black",60);
		
		orderCar.displayInfo();
		
		
		// storeCar �ֹ� ���� white ���ǵ� �ִ� 100
		//����� ���ǵ带 ���
		
		Car storeCar = new Car("white",100);
		storeCar.displayInfo();
	}
}
