package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
	// 인스턴스 변수로 선언
	// 입력, 출력 기능으로 나누시오
	public int age;
	public String name;
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("나이 입력");
		age = sc.nextInt();
		
	}
	
	public void output() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}

}
