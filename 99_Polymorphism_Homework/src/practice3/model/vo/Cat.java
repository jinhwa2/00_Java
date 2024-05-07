package practice3.model.vo;

public class Cat extends Animal {
//필드
	private String location;
	private String color;
	
//메서드
	//세터
	public void setLocation(String location) {
		this.location = location;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//게터
	public String getLocation() {
		return location;
	}

	public String getColor() {
		return color;
	}


	//생성자 : 기본 컨트롤 스페이스 엔터를 동시에 누르는게 아니라 컨트롤 스페이스 누른다음에 아래로 메뉴 뜨면 컨스트럭터 선택후 엔터
	public Cat() {
		
	}	

	//생성자  " 필수 
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
