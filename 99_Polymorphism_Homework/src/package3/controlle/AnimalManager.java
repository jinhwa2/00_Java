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
			//만약에 랜덤으로 true false 를 가져오게 한 다음 trud면 강아지
			//false 면 고양이 를 칸에 넣을 예정
				//radom.nextBoolean() : 랜덤으로 거짓과 참이 나옴
			if(random.nextBoolean()) {
				animals[i] = new Dog("멍멍이"+i,"개",random.nextInt(30)+1);
			} else {
				animals[i] = new Cat("야옹이"+i,"고양이","집","검은색");
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
//		사이즈 5짜리 Animal 타입의 객체 배열 생성하여 
//		
//		각 인덱스별로 무작위로 Dog, Cat 클래스를 이용하여 객체 생성하고 
//		반복문으로 각 인덱스별 객체의 speak() 메소드 실*/
//		Random random = new Random();

		
		
		
	}

}
