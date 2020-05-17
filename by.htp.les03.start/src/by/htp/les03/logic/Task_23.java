package by.htp.les03.logic;
// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r). 
public class Task_23 {
	
	public static void task() {
	System.out.println("Task 23 Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).");
	
	double r;
	double R;

	r = 1.3;
	R = 2.5;
	System.out.println ("\t" + "Внутренний радиус кольца r = " + r);
	System.out.println ("\t" + "Внешний радиус кольца r = " + R);
	
	double s;
	s = Math.PI * (R * R - r * r);
	System.out.println("\t" + "Площадь кольца с внутренним радиусом = " + r + " и внешним радиусом = " + R + " равна " + s + "кв.ед.");
	
	System.out.println();
	}
}
