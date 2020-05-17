package by.htp.les03.logic;
// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
public class Task_14 {
	
	public static void task() {
		System.out.println("Task 14 Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.");
		
		double r;
		r = 10;
		System.out.println("\t" + "Радиус окружности R = " + r + " ед.");
		
		double c;
		c = 2 * Math.PI * r;
		System.out.println("\t" + "Длинна окружности " + c + " ед.");
		
		double s;
		s = Math.PI * r * r;
		System.out.println("\t" + "Площадь круга " + s + " кв.ед.");
		System.out.println ();
	}
}
