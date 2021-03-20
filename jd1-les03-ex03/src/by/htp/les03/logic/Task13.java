package by.htp.les03.logic;

public class Task13 {
// 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
	public static void task() {
		System.out.println("13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.");
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double x3;
		double y3;
		
		double P;
		double S;
		
		double a;
		double b;
		double c;
		
		x1 = 0;
		y1 = 0;
		
		x2 = 3;
		y2 = 0;
		
		x3 = 0;
		y3 = 4;
				
		System.out.println("\t" + "x1 = " + x1 + ", y1 = "+ y1 );
		System.out.println("\t" + "x2 = " + x2 + ", y2 = "+ y2 );
		System.out.println("\t" + "x3 = " + x2 + ", y3 = "+ y3 );
		System.out.println();
		
		a = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
		b = Math.sqrt((x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3));
		c = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));
		
		P = a + b + c;
		
		S = Math.sqrt(P/2*(P/2 - a)*(P/2 - b)*(P/2 - c));
		
		System.out.println("\t" + "Периметр треугольника = " + P + " ед.");
		System.out.println("\t" + "Площадь треугольника = " + S + " кв. ед.");
		System.out.println();
	}

}
