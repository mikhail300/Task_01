package by.htp.les03.logic;

public class Task35 {
// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
	public static void task() {
		System.out.println("35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.");
		
		double m;
		double n;
		
		m = 235423;
		n = 2233;
		
		System.out.println("\t" + "Даны m = " + m + ", n = " + n);
		
		double mn;
		mn = m / n;
		
		System.out.println("\t" + "Частное m / n = " + mn);
		System.out.println();
		
		int rezLo;
		rezLo = (int) mn - ((int) (mn / 10)) * 10;
		
		System.out.println("\t" + "Младшая цифра целой части = " + rezLo);
		
		int rezHi;
		rezHi = (int) (mn * 10) - ((int) (mn * 10) / 10) * 10;
		
		System.out.println("\t" + "Cтаршая цифра дробной части = " + rezHi);
		System.out.println();
	}
}
