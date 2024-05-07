package practice3.model.vo;

//에니멀 익스텐즈
public class Rabbit extends Animal{
//필드
	private int weight;
	private String color;
	//메서드
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
	

	//생성자:기본
	public Rabbit() {
		
	}
	
	//생성자:필수 alt shift s o 선택한다음 부모클래스에서 있는 필드 추가
	public Rabbit(String name, String kind,int weight, String color) {
		super(name,kind);
		this.weight = weight;
		this.color = color;
	}
	
	
	//@Override speak 가지고와서 출력하기/컨트롤 스페이스 아래 찾아서 엔터
	@Override
		public void speak() {
			System.out.println(super.toString()+"토끼의무게"+weight+"토끼의색상"+color);
			
		}
}
