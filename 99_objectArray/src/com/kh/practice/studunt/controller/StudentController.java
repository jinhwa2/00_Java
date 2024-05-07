package com.kh.practice.studunt.controller;

import com.kh.practice.studunt.model.vo.Student;

public class StudentController {
 //�ʵ�
	 //5���� �� �迭�� ������ִµ� �л����� ������ּ���
		/*Student[] sArr = new Student[5]
		 * 
		 * 
		 * Studunt �� sArr[0] ��浿 �ڹ� 100
		 *   sArr  �� sArr[1] �ڱ浿 ��� 50
		 *         �� sArr[2] �̱浿 ȭ�� 85
		 *         �� sArr[3] ���浿 ���� 60
		 *         �� sArr[4] ȫ�浿 �ڹ� 20
		 * 
		 * 
		 * 
		 * */
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	//������ : �⺻
	public StudentController() {
		
		sArr[0] = new Student("��浿","�ڹ�",100);
		sArr[1] = new Student("�ڱ浿","���",50);
		sArr[2] = new Student("�̱浿","ȭ��",85);
		sArr[3] = new Student("���浿","����",60);
		sArr[4] = new Student("ȫ�浿","�ڹ�",20);
		
	}
	//��ü �迭�� �ִ� ������ ��ȯ
	public Student[] printStudent() {
		  return sArr;
	}
	//��ü �迭�� ������ ���� �� ����
	public int sumScore() {
		int sum =0;
		for(Student s : sArr) {
			 sum += s.getScore();
		}
		return sum;
	}
	// double�迭�� �����~
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
		
		return avgArr;
		
	}
    //�� �л��� �հ� ���θ� Ȯ���ϰ� ����ϴ� �޼���
	public void printPass( ) {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName()+"�л���"+ (s.isPassed() ? " �հ�" : " ���հ�"));
		}
	}

/*
 if�� ���� boolean ������
 if(s.getScore() >== CUT_LINE){
    System.out.println(s.getName()+" �л��� �հ��Դϴ�"); 
 * } else {
 * 	System.out.println(s.getName()+ " �л��� ���հ��Դϴ�.")
 * }
 * 
 * 
 * 
 * 
 * */


}


