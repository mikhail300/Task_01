package by.htp.les03.logic;

public class Task16 {
// 16. Найти произведение цифр заданного четырехзначного числа.
	public static void task() {
		System.out.println("16. Найти произведение цифр заданного четырехзначного числа.");
		
		int a;
		
		a = 1234;
		
		System.out.println("\t" + "Задано число a = " + a);
		System.out.println();
		
		int rez;
		rez = 1; 
		
		int tmp;
		
		int lastTmp;
		lastTmp = 0;
		
		for (int i = 1; i < 5; i++) {
			tmp = a % (int)(Math.pow(10, i));
			rez = rez * ((tmp - lastTmp) / (int)(Math.pow(10, i-1)));
			lastTmp = tmp;
		}
		
		System.out.println("\t" + "Произведение цифр числа = " + rez);
		System.out.println();
		
	}

}
