package com.kh.oop.method.ex;

public class IceCreamRun {
	//main
	public static void main(String[] args) {
		IceCream ice = new IceCream();
		ice.setName("������");
		ice.setSuger(3);
		ice.setMilk(false);
		ice.makeIceCrem();
		
		
		IceCream ice1 = new IceCream("�ٴҶ�",1,true);
		ice1.makeIceCrem();
	}
	
}
