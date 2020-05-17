package by.htp.les03.logic;
// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с. 
public class Task_29 {
	
	public static void task() {
	System.out.println("Task 29 Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.");
	
	double a;
	double b;
	double c;
	a = 3.0;
	b = 4.0;
	c = 5.0;
	System.out.println("\t" + "Исходный треугольник со сторонами " + a + " " + b + " " + c);
	
	double LARad = Math.acos((b * b + c * c - a * a) / (2 * b * c));
	double LADegr = LARad * 180 / Math.PI;
	System.out.println("\t" + "Угол 1 = " + LARad + " рад., " + LADegr + " гр.");
	
	double LBRad = Math.acos((a * a + c * c - b * b) / (2 * a * c));
	double LBDegr = LBRad * 180 / Math.PI;
	System.out.println("\t" + "Угол 2 = " + LBRad + " рад., " + LBDegr + " гр.");
	
	double LCRad = Math.acos((a * a + b * b - c * c) / (2 * a * b));
	double LCDegr = LCRad * 180 / Math.PI;
	System.out.println("\t" + "Угол 3 = " + LCRad + " рад., " + LCDegr + " гр.");
	
	System.out.println();
	}
}
