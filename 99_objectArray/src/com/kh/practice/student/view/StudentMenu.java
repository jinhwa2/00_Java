package com.kh.practice.student.view;

import com.kh.practice.studunt.controller.StudentController;
import com.kh.practice.studunt.model.vo.Student;

//������� ���忡�� �ٶ󺸴� ��ǻ��
public class StudentMenu {
//�ʵ�
	private StudentController ssm = new StudentController();

//������ : �⺻
	public StudentMenu() {
		
	}
	//void �л������� ���� ��� ����ϴ� �޼���
	public void printStudentMenu() {
		System.out.println("�л�    �̸�      ����     ����");
		System.out.println("----------------------------");
		//for - each
		//String ���� �ߴٸ� �л��� �̸� or ���� or ����
		//Student �̸��� ���� �� ������ ���~~~������ ���ڴٴ� �ǹ�
		  /*     [  ,    ,]			�� �� �� �� ȫ  �浿    */
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("------------------------------");
		System.out.println("���� :"+ssm.sumScore()); //ssm.avgScore()[0] = ssm.sumScore()
		System.out.printf("��� : %.2f",ssm.avgScore()[1]);
		System.out.println("�հݿ���: "+ (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		
		ssm.printPass();
		
		  /*
		   * 
		   * boolean�� �Ἥ true���� false ������ ������ ���µ�
		   * �� Ʈ��� ������ �������ϱ�?
		   *       �л����� ���     >=		�հ�ĿƮ����
		   * 	ssm.avgScore()[1] >= StudentController.CUT_LINE
		   *         80                 60
		   *         
		   *        ���� ���ų� ũ�ų� �۴ٴ� ���� ǥ���ϴ� �ε�ȣ�� true false ���и� �ϱ� ���� ����
		   *         
		   * 
		   * 
		   * */
		
	}
	
	
	
	
	
}
