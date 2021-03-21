package by.htp.les03.logic;

public class Task26 {
// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
	public static void task() {
		System.out.println("26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.");
		
		double a;
		double b;
		double alfa;
		
		a = 3;
		b = 4;
		alfa = 90;
		
		System.out.println("\t" + "Сторона a = " + a);
		System.out.println("\t" + "Сторона b = " + b);
		System.out.println("\t" + "Угол alfa = " + alfa);
		System.out.println();
		
		double s;
		s = a * b * Math.sin(alfa * Math.PI / 180) /2;
		
		System.out.println("\t" + "Площадь тереугольника = " + s + " кв.ед.");
		System.out.println();
	}

}
