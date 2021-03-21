package by.htp.les03.logic;

public class Task25 {
// 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
// (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
	public static void task() {
		System.out.println("25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с");
		System.out.println("(предполагается, что а≠0 и что дискриминант уравнения неотрицателен).");
		
		double a;
		double b;
		double c;
		
		a = 2;
		b = 4;
		c = -6;
		
		System.out.println("\t" + "Коэффициент а = " + a);
		System.out.println("\t" + "Коэффициент b = " + b);
		System.out.println("\t" + "Коэффициент c = " + c);
		System.out.println();
		
		double d;
		d = b * b - 4 * a * c;

		System.out.println("\t" + "D = " + d);
		
		double x1;
		x1 = (- b + Math.sqrt(d)) / (2 * a);
		double x2;
		x2 = (- b - Math.sqrt(d)) / (2 * a);
		
		System.out.println("\t" + "x1 = " + x1 + " x2 = " + x2);
		System.out.println();
	}

}
