package by.htp.les03.logic;

public class Task19 {
// 19. Дана сторона равностороннего треугольника. 
//Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
	public static void task() {
		System.out.println("19. Дана сторона равностороннего треугольника.");
		System.out.println("Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.");
		
		double a;
		a = 3;
		
		System.out.println("\t" + "Сторона a = " + a);
		System.out.println();		
		
		double s;
		s = (a * a * Math.sqrt(3)) / 4;
		
		System.out.println("\t" + "Площадь треугольника = " + s + " кв.ед.");
		
		double h;
		h = (Math.sqrt(3) / 2) * a;
		
		System.out.println("\t" + "Высота треугольника = " + h + " ед.");
		
		double r;
		r = a / (Math.sqrt(3) * 2);
		
		System.out.println("\t" + "Радиус вписанной окружности = " + r + " ед.");
		
		double R;
		R = a / Math.sqrt(3);
		
		System.out.println("\t" + "Радиус описанной окружностей = " + R + " ед.");
		System.out.println();
	}

}
