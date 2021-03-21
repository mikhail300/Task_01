package by.htp.les03.logic;

public class Task18 {
// 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
	public static void task() {
		System.out.println("18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.");
		
		double a;
		
		a = 2;
		
		System.out.println("\t" + "Длина ребра куба a = " + a + " ед.");
		System.out.println();
		
		double s;
		double sFull;
		double v;
		
		s = a * a;

		System.out.println("\t" + "Площадь грани = " + s + " кв.ед.");
		
		sFull = s * 6;
		
		System.out.println("\t" + "Площадь полной поверхности = " + sFull + " кв.ед.");
		
		v = Math.pow(a, 3);
		
		System.out.println("\t" + "Объем куба = " + v + " куб.ед.");
		System.out.println();
	}

}
