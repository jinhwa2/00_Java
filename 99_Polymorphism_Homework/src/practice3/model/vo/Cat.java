package practice3.model.vo;

public class Cat extends Animal {
//�ʵ�
	private String location;
	private String color;
	
//�޼���
	//����
	public void setLocation(String location) {
		this.location = location;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//����
	public String getLocation() {
		return location;
	}

	public String getColor() {
		return color;
	}


	//������ : �⺻ ��Ʈ�� �����̽� ���͸� ���ÿ� �����°� �ƴ϶� ��Ʈ�� �����̽� ���������� �Ʒ��� �޴� �߸� ����Ʈ���� ������ ����
	public Cat() {
		
	}	

	//������  " �ʼ� 
	public Cat(String name, String kinds,String location, String color) {
		super(name,kinds);
		this.location = location;
		this.color = color;
	}
	
	//void
	public void speak() {
		System.out.println(super.toString()+location+color);
	}
	
}
