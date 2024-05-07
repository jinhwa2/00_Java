package practice3.model.vo;
//
public class Horse extends Animal {
//필드
	private String location;
	private String color;
	//메서드
		//Setter
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Getter
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}
	
	
	//생성자 : 기본
	public Horse() {
		
	}
	//생성자 : 필수
	public Horse(String name, String kind,String location, String color) {
		super(name,kind);
		this.location = location;
		this.color = color;
	}
	
	
	//@Override
	public void speak() {
		System.out.println(super.toString()+location+color);
	}
}
