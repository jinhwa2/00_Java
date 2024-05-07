package practice3.model.vo;

//���ϸ� �ͽ�����
public class Rabbit extends Animal{
//�ʵ�
	private int weight;
	private String color;
	//�޼���
		//Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Getert
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	

	//������:�⺻
	public Rabbit() {
		
	}
	
	//������:�ʼ� alt shift s o �����Ѵ��� �θ�Ŭ�������� �ִ� �ʵ� �߰�
	public Rabbit(String name, String kind,int weight, String color) {
		super(name,kind);
		this.weight = weight;
		this.color = color;
	}
	
	
	//@Override speak ������ͼ� ����ϱ�/��Ʈ�� �����̽� �Ʒ� ã�Ƽ� ����
	@Override
		public void speak() {
			System.out.println(super.toString()+"�䳢�ǹ���"+weight+"�䳢�ǻ���"+color);
			
		}
}
