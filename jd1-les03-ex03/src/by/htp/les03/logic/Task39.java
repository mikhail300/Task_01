package by.htp.les03.logic;

public class Task39 {
// 39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, 
//	кроме умножения, сложения и вычитания, вычислите за минимальное число операций:	2x^4 - 3х^3 + 4х^2 - 5х + 6.
	public static void task() {
		System.out.println("39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями,");
		System.out.println("кроме умножения, сложения и вычитания, вычислите за минимальное число операций:	2x^4 - 3х^3 + 4х^2 - 5х + 6.");
		
		double x = 1;

		double result = x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6;

		System.out.println();
		System.out.println("\t" + "При х = " + x + " значение выражения равно " + result);

		System.out.println();
	}
}