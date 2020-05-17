package by.htp.les03.logic;
// Дана длина ребра куба. 
// Найти площадь грани, площадь полной поверхности и объем этого куба.
public class Task_18 {
	
	public static void task() {
	System.out.println("Task 18 Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.");
	
	double a;
	a = 2;
	System.out.println("\t" + "Длина ребра куба a = " + a + " ед.");
	
	double s;
	s =  Math.pow ( a , 2 );
	System.out.println("\t" + "Площадь грани " + s + " кв.ед.");
	
	double s_full;
	s_full = s * 6;
	System.out.println("\t" + "Площадь полной поверхности " + s_full + " кв.ед." );
	
	double v;
	v = Math.pow( a , 3);
	System.out.println("\t" + "Объем этого куба " + v + " куб.ед." );
	System.out.println();
	}
}
