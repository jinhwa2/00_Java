package practice3.model.vo;

//���� �߻�Ŭ���� ��������
public class Dog extends Animal{
//�ʵ�
	public static final String PLACE = "�ְ�ī��";
	//�޼���
	//Setter
	private int weight;
public void setWeight(int weight) {
		this.weight = weight;
	}
	//����
	public int getWeight() {
		return weight;
	}
	//������ : �⺻
		 
	

public  Dog () {
	
	
	
	
}
	public Dog(String name, String kinds,int weight) {
		super(name,kinds);  //Animal �ؿ� �̹� �ִ� name kinds�� �ٶ󺸰� �ϱ� ���ؼ�
		this.weight = weight;
	}

	//
	public void speak() {
		System.out.println(super.toString()+ "�����Դ�"+weight+"kg �Դϴ�.");
	}







}