package day10_ClassVariable;

import java.util.Scanner;

public class UpAndDown_Method {
	Scanner sc = new Scanner(System.in);
	public int rN, sN, iN, t=0, bT=0;
	
	public int display() {
		while(true) {
			rN = (int) (Math.random()*100);
			System.out.println("=== Up & Down Game ===");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.print(">>> ");						
			sN = sc.nextInt();
			
			switch(sN) {
			case 1:start(); break;
			case 2:score(); break;
			case 3:
				System.out.println("���� ����");
				System.exit(0);
			}
		}
	}
	
	public void start() {
		System.out.println("=== START ===");
		while(true) {
			System.out.print("Input Number --> ");
			iN = sc.nextInt();
			++t;
			if(rN==iN) {
				if(bT==0 || bT>t) {
					bT = t;
					System.out.println(t+"ȸ ���� ������ϴ�!!!");
					System.out.println("�ְ����� �����߽��ϴ�!!!");
					System.out.println();
					
				}
				else {
					System.out.println(t+"ȸ ���� ������ϴ�!!!");
					System.out.println();
				}
				t = 0;
				break;
			}
			else if(rN<iN) {
				System.out.println("=== DOWN ===");
				System.out.println();
			}
			else {
				System.out.println("=== U  P ===");
				System.out.println();
			}
			
		}
		
	}
	public void score() {
		if(bT==0) {
			System.out.println("������ �������� �ʾҽ��ϴ�");
			System.out.println();
		}
		else {
			System.out.println("�ְ� ������ "+bT+"ȸ �Դϴ�");
			System.out.println();
		}
		
	}

}
