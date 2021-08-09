package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_Final {
	public final String KOREA = "대한민국";
	public void func() {
		System.out.println("변경 전 KOREA : "+KOREA);
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		//KOREA = sc.next();
			// final을 붙여서 KOREA를 생성했기 때문에 변경이 불가능
		System.out.println("변경 후 KOREA : "+KOREA);
		
	}
}
