package by.htp.les03.logic;

public class Task14 {
// 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
	public static void task() {
		System.out.println("14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.");
		
		double R;
		
		double C;
		double S;
		
		R = 3;
		
		System.out.println("\t" + "Радиус окружности R = " + R + " ед.");
		System.out.println();
		
		C = 2 * Math.PI * R;
		
		S = Math.PI * (R * R);
		
		System.out.println("\t" + "Длинна окружности = " + C + " ед.");
		System.out.println("\t" + "Площадь окружности = " + S + " кв. ед.");
		System.out.println();
	}

}
