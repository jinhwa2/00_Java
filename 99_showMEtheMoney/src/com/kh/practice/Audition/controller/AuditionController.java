
import com.kh.practice.Audition.model.vo.Audition;
package com.kh.practice.Audition.controller;
public class AuditionController {
//�ʵ�
	private Audition[] sArr = new Audition[5];
	public static final int CUT_LINE = 60;
//�޼���
	//������ : �⺻
	public AuditionController() {	
		//5���� �����͸���ü�� �ʱ�ȭ���ִ� �۾�
	sArr[0] = new Audition("�迵��","�߶��",100);
	sArr[1] = new Audition("�ڿ���","����",50);
	sArr[2] = new Audition("�̿���","������",85);
	sArr[3] = new Audition("������","��",60);
	sArr[4] = new Audition("ȫ����","��",20);
	}
	//��ü �迭�� �ִ� ������ ��ȯ
	public Audition[] printStudent() {
		return sArr;
	}
	
	//��ü �迭�� ������ ���� �� ����
	public int sumScore() {
		int sum = 0;
		for(Audition audition : sArr) {
			sum += audition.getScore();
		}
		return sum;
	}
	
	//double�迭�� ����� sumScore�� ���ϰ��� 0��° ��ٱ��Ͽ� ���
	//��������� 1��° ��ٱ��Ͽ� ��ƶ�
	 public double[] avgScore() {
		double[] avgScore = new double[2];
		avgScore[0] = sumScore();
		avgScore[1] = avgScore[0] / sArr.length;
			return avgScore;
	}
	
	
	public void printPass() {
		for(Audition a : sArr) {
			a.setPassed(a.getScore() >= CUT_LINE);
			System.out.println(a.getName()+" �л��� "+(a.isPassed() ? "���" : "�հ�"));
		}
	}
}
