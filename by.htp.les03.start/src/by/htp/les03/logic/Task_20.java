package by.htp.les03.logic;
// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью. 
public class Task_20 {
	
	public static void task() {
	System.out.println("Task 20 Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.");
	
	double l;
	l = 4;
	System.out.println ("\t" + "Длинна окружеости l = " + l);
		
	double s;
	s =  Math.pow ( l , 2 ) / (4 * Math.PI);
	System.out.println("\t" + "Площадь круга " + s + " кв.ед.");
	
	System.out.println();
	}
}
