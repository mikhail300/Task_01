package by.htp.les03.logic;

public class Task11 {
// 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
	public static void task() {
		System.out.println("11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.");

		double a;
		double b;

		double P;
		double S;

		a = 4;
		b = 3;
		
		System.out.println("\t" + "Сторона a = " + a);
		System.out.println("\t" + "Сторона b = " + b);
		System.out.println();
		
		S = a * b / 2;
		P = a + b + Math.sqrt(a * a + b * b);

		System.out.println("\t" + "Площадь треугольника  = " + S + " кв. ед.");
		System.out.println("\t" + "Периметр треугольника = " + P + " ед.");
		System.out.println();
	}

}
