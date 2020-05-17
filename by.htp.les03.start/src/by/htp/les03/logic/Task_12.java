package by.htp.les03.logic;
// ¬ычислить рассто€ние между двум€ точками с данными координатами (х1, у1)и (x2, у2).
public class Task_12 {
	
	public static void task() {
		System.out.println("Task 12 ¬ычислить рассто€ние между двум€ точками с данными координатами (х1, у1)и (x2, у2).");
		
		double x1;
		double y1;
		double x2;
		double y2;
		
		x1 = 1;
		y1 = 1;
		x2 = 4;
		y2 = 5;
		System.out.println("\t" + "“очка x1 = " + x1 + ", y1 = "+ y1 );
		System.out.println("\t" + "“очка x2 = " + x2 + ", y2 = "+ y2 );
		
		double v;
		
		v = Math.sqrt( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) );
		
		System.out.println("\t" + "–ассто€ние между двум€ точками " + v + " ед.");
		System.out.println();
	}
}
