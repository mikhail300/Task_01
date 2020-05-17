package by.htp.les03.logic;
// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
public class Task_11 {

	public static void task() {
		System.out.println("Task 11 Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.");
		
		double a;
		double b;
		
		a = 3;
		b = 4;
		System.out.println("\t" + "сторона a = " + a + " ед.");
		System.out.println("\t" + "сторона b = " + b + " ед.");
		
		double s; // площадь
		double p; // периметр
		
		s = 0.5 * a *b ;
		p = a + b + Math.sqrt( a * a + b * b );
		
		System.out.println("\t" + "Площадь треугольника " + s + " кв.ед.");
		System.out.println("\t" + "Периметр треугольника " + p + " ед.");
		System.out.println();
	}
}
