package practice3.model.vo;

// abstract 추상 메서드를 쓰기 위해서는 class도 추상클래스이어야지만 사용할 수 있음
public abstract class Animal {
//필드
	private String name;
	private String kind;
	//메서드
	//Setter
public void setName(String name) {
		this.name = name;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getKind() {
		return kind;
	}
	
	//생성자 : 기본   컨트롤 스페이스 엔터
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//생성자 : 필수   알트 시프트 에스 오
	public Animal(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}
	
	//toString  ,qhduwnsms rjt
	@Override //javaAPI String toString
	public String toString() {
		return "저의이름은 "+ name +"이고, 종류는 "+ kind +"입니다.";
	}
	
	public abstract void speak();
	
}
