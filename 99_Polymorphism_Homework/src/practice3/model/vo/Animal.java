package practice3.model.vo;

// abstract �߻� �޼��带 ���� ���ؼ��� class�� �߻�Ŭ�����̾������ ����� �� ����
public abstract class Animal {
//�ʵ�
	private String name;
	private String kind;
	//�޼���
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
	
	//������ : �⺻   ��Ʈ�� �����̽� ����
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//������ : �ʼ�   ��Ʈ ����Ʈ ���� ��
	public Animal(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}
	
	//toString  ,qhduwnsms rjt
	@Override //javaAPI String toString
	public String toString() {
		return "�����̸��� "+ name +"�̰�, ������ "+ kind +"�Դϴ�.";
	}
	
	public abstract void speak();
	
}
