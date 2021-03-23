package by.htp.les03.logic;

public class Task36 {
// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
	public static void task() {
		System.out.println("36. Найти частное произведений четных и нечетных цифр четырехзначного числа.");
		
		int a;
		a = 4534;
		
		System.out.println("\t" + "Четырехзначное число a = " + a);
		System.out.println();
		
		int a0;
		int a1;
		int a2;
		int a3;
		
		a0 = a / 1 % 10;
		a1 = a / 10 % 10;
		a2 = a / 100 % 10;
		a3 = a / 1000 % 10;
		
		int even;
		even = a0 * a2;
		
		int odd;
		odd = a1 * a3;
		
		System.out.println("\t" + "Произведение четных = " + even);
		System.out.println("\t" + "Произведение нечетных = " + odd);
		System.out.println();			
	}
}
