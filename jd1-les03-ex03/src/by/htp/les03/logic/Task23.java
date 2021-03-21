package by.htp.les03.logic;

public class Task23 {
// 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
	public static void task() {
		System.out.println("23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).");

		double r;
		double R;
		r = 3;
		R = 5;
		
		System.out.println("\t" + "Внутренний радиус r = " + r + " ед.");
		System.out.println("\t" + "Внешний радиус R = " + R + " ед.");
		System.out.println();
		
		double rez;
		rez = (Math.PI * R * R) - (Math.PI * r * r);
		
		System.out.println("\t" + "Площадь кольца = " + rez + " кв.ед.");
		System.out.println();
	}

}
