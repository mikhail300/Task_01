package by.htp.les03.logic;

public class Task27 {
// 27. Дано значение a. Не используя никаких функций и никаких операций, 
// кроме умножения, получить значение а8 за три операции и а10 за четыре операции.
	public static void task() {
		System.out.println("27. Дано значение a. Не используя никаких функций и никаких операций,");
		System.out.println("кроме умножения, получить значение а8 за три операции и а10 за четыре операции.");
		
		double a;
		a = 2;
		
		double b;
		a = a * a;
		b = a * a;
		b = b * b;
		
		System.out.println("\t" + "a^8 = " + b);
		
		a = a * b;
		
		System.out.println("\t" + "a^10 = " + a);
		System.out.println();
	}

}
