package package3.controlle;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		
		Random random = new Random();
		
		for (int i = 0; i < animals.length; i++) {
			//���࿡ �������� true false �� �������� �� ���� trud�� ������
			//false �� ����� �� ĭ�� ���� ����
				//radom.nextBoolean() : �������� ������ ���� ����
			if(random.nextBoolean()) {
				animals[i] = new Dog("�۸���"+i,"��",random.nextInt(30)+1);
			} else {
				animals[i] = new Cat("�߿���"+i,"�����","��","������");
			}
		}
		for(Animal a : animals) {
			a.speak();
		}
		
			//System.out.println(animals[0]);
//			for(Animal  a  :  animals) {
//				a.speak();
//			}
//		}
//		
//		/*
//		������ 5¥�� Animal Ÿ���� ��ü �迭 �����Ͽ� 
//		
//		�� �ε������� �������� Dog, Cat Ŭ������ �̿��Ͽ� ��ü �����ϰ� 
//		�ݺ������� �� �ε����� ��ü�� speak() �޼ҵ� ��*/
//		Random random = new Random();

		
		
		
	}

}
