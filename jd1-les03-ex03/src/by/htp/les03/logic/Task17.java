package by.htp.les03.logic;

public class Task17 {
// 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
	public static void task() {
		System.out.println("17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.");
		
		double a;
		double b;
		
		a = - 2;
		b = 2;
		
		System.out.println("\t" + "a = " + a );
		System.out.println("\t" + "b = " + b );
		System.out.println();
		
		double c;
		c = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		System.out.println("\t" + "Среднее арифметическое кубов = " + c);
		
		double d;
		d = Math.sqrt(Math.abs(a) * Math.abs(b)); 
		
		System.out.println("\t" + "Среднее геометрическое модулей чисел = " + d);
		System.out.println();
	}

}
