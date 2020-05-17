package by.htp.les03.logic;
// Даны два числа. 
// Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел
public class Task_17 {
	
	public static void task() {
	System.out.println("Task 17 Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел");
	
	double a;
	double b;
		
	a = 2;
	b = -3;
	System.out.println("\t" + "a = " + a );
	System.out.println("\t" + "b = " + b );
	
	double c;
	c = ( Math.pow ( a , 3 ) + Math.pow ( b, 3 )) / 2;
	System.out.println("\t" + "среднее арифметическое кубов чисел " + c );
	
	double d;
	d = Math.sqrt((Math.abs(a) * Math.abs(b)));
	System.out.println("\t" + "среднее геометрическое модулей чисел " + d );
	
	System.out.println();
	}
}
