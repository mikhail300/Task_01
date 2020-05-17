package by.htp.les03.logic;
// Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у. 
public class Task_26 {
	
	public static void task() {
	System.out.println("Task 26 Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.");
	
	double a = 5.0;
	double b = 4.0;
	double alfa = 30;
	
	double s;
	s = 0.5 * a * b * Math.sin(alfa * Math.PI / 180.0);

	System.out.println("\t" + "Площадь треугольника с a = " + a + ", b = " + b + " и угол = " + alfa + " равна " + s);
	
	System.out.println();
	}
}
