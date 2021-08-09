package day10_ClassVariable;

import java.util.Scanner;

public class UpAndDown_Method {
	Scanner sc = new Scanner(System.in);
	public int rN, sN, iN, t=0, bT=0;
	
	public int display() {
		while(true) {
			rN = (int) (Math.random()*100);
			System.out.println("=== Up & Down Game ===");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 전적");
			System.out.println("3. 게임 종료");
			System.out.print(">>> ");						
			sN = sc.nextInt();
			
			switch(sN) {
			case 1:start(); break;
			case 2:score(); break;
			case 3:
				System.out.println("게임 종료");
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
					System.out.println(t+"회 만에 맞췄습니다!!!");
					System.out.println("최고기록을 갱신했습니다!!!");
					System.out.println();
					
				}
				else {
					System.out.println(t+"회 만에 맞췄습니다!!!");
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
			System.out.println("게임을 시작하지 않았습니다");
			System.out.println();
		}
		else {
			System.out.println("최고 점수는 "+bT+"회 입니다");
			System.out.println();
		}
		
	}

}
