package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
	// �ν��Ͻ� ������ ����
	// �Է�, ��� ������� �����ÿ�
	public int age;
	public String name;
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		name = sc.next();
		System.out.println("���� �Է�");
		age = sc.nextInt();
		
	}
	
	public void output() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}

}
