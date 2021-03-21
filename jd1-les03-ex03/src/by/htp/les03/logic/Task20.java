package by.htp.les03.logic;

public class Task20 {
// 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
	public static void task() {
		System.out.println("20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.");
		
		double c;
		c = 5;
		
		System.out.println("\t" + "Длинна окружности = " + c + " ед.");
		System.out.println();
		
		double r;
		r = c / (2 * Math.PI);
		
		double s;
		s = Math.PI * r * r;
		
		System.out.println("\t" + "Площадь круга = " + s + " кв.ед.");
		System.out.println();
	}

}
