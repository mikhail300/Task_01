package by.htp.les03.logic;

public class Task12 {
// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
	public static void task() {
		System.out.println("12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).");
		double x1;
		double x2;
		
		double y1;
		double y2;
		
		double distance;
		
		x1 = 0;
		x2 = 3;
		
		y1 = 4;
		y2 = 0;

		System.out.println("\t" + "Точка x1 = " + x1 + ", y1 = " + y1);
		System.out.println("\t" + "Точка x2 = " + x2 + ", y2 = " + y2);
		System.out.println();
		
		distance = Math.sqrt((x1 - x2)*(x1 - x2)+(y1 - y2)*(y1 - y2));
				
		
		System.out.println("\t" +"расстояние между точками = " + distance + " ед.");
		System.out.println();
	}

}
