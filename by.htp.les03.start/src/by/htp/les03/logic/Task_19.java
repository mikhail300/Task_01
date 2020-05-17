package by.htp.les03.logic;
// Дана сторона равностороннего треугольника. 
// Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
public class Task_19 {
	
	public static void task() {
	System.out.println("Task 19 Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.");
	
	double a;
	a = 4;
	System.out.println("\t" + "Cторона равностороннего треугольника a = " + a + " ед.");
	
	double s;
	s =  (Math.pow ( a , 2 ) * Math.sqrt(3)) / 4;
	System.out.println("\t" + "Площадь треугольника " + s + " кв.ед.");
	
	double h;
	h = (a * Math.sqrt(3)) / 2 ;
	System.out.println("\t" + "Высота равностороннего треугольника " + h + " ед." );
	
	double r;
	r = a / (2 * Math.sqrt(3));
	System.out.println("\t" + "Радиус вписанной окружности " + r + " ед." );
	
	double R;
	R = a / Math.sqrt (3);
	System.out.println("\t" + "радиус описанной окружности " + R + " ед." );
	
	System.out.println();
	}
}
