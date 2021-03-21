package by.htp.les03.logic;

public class Task24 {
// 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
	public static void task() {
		System.out.println("24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.");
		
		double a;
		double b;
		double alfa;
		
		a = 4;
		b = 3;
		alfa = 45;
		
		System.out.println("\t" + "Основание a = " + a + " ед.");
		System.out.println("\t" + "Основание b = " + b + " ед.");
		System.out.println("\t" + "Угол alfa = " + alfa + "");
		System.out.println();
		
		double s;
		s = ((a * a - b * b) / 4.0) * Math.tan( alfa * Math.PI / 180.0 );
		
		System.out.println("\t" + "Площадь трапеции = " + s + "кв.ед.");
		System.out.println();
	}

}
