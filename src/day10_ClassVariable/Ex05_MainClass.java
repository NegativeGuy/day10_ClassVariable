package day10_ClassVariable;

public class Ex05_MainClass {
	public static void main(String[] args) {
		Ex05_Variable.cnt = 888;
		System.out.println(Ex05_Variable.cnt);
		Ex05_Variable.func();
		// static으로 만든 변수는 클래스명을 써줘야함
		// 아래 객체를 생성해서 변수(ex)를 만들기 전이기 때문에
		
		Ex05_Variable ex = new Ex05_Variable();
		// 객체를 만듬
		ex.cnt = 999;
		// 객체를 만들었기 때문에 클래스명으로 접근하지 않는다
		
	}
}
