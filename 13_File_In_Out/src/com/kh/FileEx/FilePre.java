package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {
	
    public FilePre() {
		
	}
	
	public void �޼���1() {
		File �ؽ�Ʈ���� =  new File("c:/Users/user1/Desktop/newFFF/���ϻ���.txt");
	
		if(�ؽ�Ʈ����.exists()) {
			System.out.println("������ �����մϴ�.");
		} else { //�������� �ʴ´ٸ�
			//���࿡ ���� ����� ����!
			try {
				
				
				�ؽ�Ʈ����.createNewFile();
				System.out.println(�ؽ�Ʈ����.getName()+"������ �����Ǿ����ϴ�.");
				
			} catch (IOException e) {
				System.out.println("���ϸ���� �����߽��ϴ�.");
				e.printStackTrace();
			}
		}
	
	}
	
    public void �޼���2() {
		//����ȭ�鿡 ��������� ���� �����ϰ� ������ �ȿ� ���ϻ���.txt ���� �����
    	String ������� = "c:/Users/user1/Desktop/������";
    	
    	//����ȭ�� ��θ� �����ϴ� ���             c:/Users/user1
    	String ����ȭ���� = System.getProperty("user.home")+"/Desktop";
    	
    	System.out.println(����ȭ����);
    	
    	
    	
    	
    	
    	
    	
    	File ��������ŷ = new File(�������);
    	//����ȭ�鿡 ������ ��� ������ �����ϴ��� Ȯ��
    	System.out.println("�����մϱ�? :"+��������ŷ.exists());
    	
    	//���࿡ ������ �����Ѵٸ� ������ �̹� ����ȭ�鿡 �����մϴ�.��� �ֱ��ϰ�
    	if(��������ŷ.exists()) {
    		System.out.println("������ �̹� �����մϴ�.");
    	} else {
    		//��������
    		��������ŷ.mkdir();
    		System.out.println(��������ŷ.getName());
    		System.out.println(��������ŷ.getPath());
    	}
    	//�ؽ�Ʈ ���� �����
    	File ���ϻ��� = new File(��������ŷ +"/���ϻ���.txt");
    		if(���ϻ���.exists()) {
    			System.out.println("���ϻ����� �����մϴ�.");
    		} else {
    			//�������� �ʴ´ٸ�
    			try {
    				
    				���ϻ���.createNewFile();
    				System.out.println(���ϻ���.getName()+"������ �����Ǿ����ϴ�.");
    				
    				
    			} catch (IOException e) {
    				System.out.println("���ϻ����� ���� �߽��ϴ�.");
    				e.printStackTrace();
    			}
    		}
    	
	}
	
    public void �޼���3() {
    	String ����ȭ���� = System.getProperty("user.home")+"/Desktop";
    	
    	//��� ���� ����
    	File ������ = new File(����ȭ���� + "��1/��2/��3");
    	������.mkdirs();
    	
    	//���� ����
    	File ���� = new File(������ + "/���ο�����.txt");
    	
    	
    	try {
    		
    		boolean ���ϻ���Ȯ�� = ����.createNewFile();
    		System.out.println("������ �����Ǿ�����?"+ ���ϻ���Ȯ��);
    		
    		//���� ũ�� Ȯ��
    		System.out.println(����.length());
    		
    		//���� ������ ������ Ȯ��
    		System.out.println(����.lastModified());
    		
    		//���� ����
    		����.delete();
    		
    		
    	} catch (IOException e) {
			e.printStackTrace();
		}
	}

    public void �޼���4() {
    	//�����̸� �������ֱ� 
    	String ����ȭ���� = System.getProperty("user.home")+"/Desktop";
    	File �ؽ�Ʈ���� = new File(����ȭ���� +"/newFFF/���ϻ����̸��ٲٱ�.txt");
    	try {
			�ؽ�Ʈ����.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    
    public void �޼���5()	{
    	String ����ȭ���� = System.getProperty("user.home")+"/Desktop";
    	File �ؽ�Ʈ���� = new File(����ȭ���� +"/newFFF/���ϻ���.txt");
    	File ���ο��̸� = new File(����ȭ���� +"/newFFF/������̸�.txt");
    	
    	//���� �̸� �����ϱ�
    	//���࿡ ������ ������ ��� -> ���� �̸� ���� �������� ������ ���� X
    	if(�ؽ�Ʈ����.exists()) {
    		//���࿡ ���� �̸��� ���������� �����ߴٸ�
    		if(�ؽ�Ʈ����.renameTo(���ο��̸�)) {
    			System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
    		} else {
    			System.out.println("���� �̸� ���濡 �����߽��ϴ�.");
    		}
    	} else {
    		System.out.println("���� �̸��� �������� �ʽ��ϴ�. ������ּ���^^.");
    	}
    }
    
    //main �޼��� �ϳ� �����
    public static void main(String[] args) {
		FilePre ���� = new FilePre();
		//����.�޼���1();
		//����.�޼���2();
		//����.�޼���3();
		����.�޼���5();
	}
}
