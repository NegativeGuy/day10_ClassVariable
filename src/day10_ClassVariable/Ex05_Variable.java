package day10_ClassVariable;

public class Ex05_Variable {
	public static int cnt = 777;
	// static은 main class에서 객체를 만들기 전에 미리 변수를 만들어줌

	public static void func() {
		System.out.println("func"+cnt);
	}
}
