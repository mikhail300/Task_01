package by.htp.les03.logic;
// Вычислить корни квадратного уравнения ах^2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а!=0 и что дискриминант уравнения неотрицателен). 
public class Task_25 {
	
	public static void task() {
	System.out.println("Task 25 Вычислить корни квадратного уравнения ах^2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а!=0 и что дискриминант уравнения неотрицателен).");
	
	double a = 2;
	double b = 4;
	double c = -6;
	System.out.println ("\t" + "a = " + a);
	System.out.println ("\t" + "b = " + b);
	System.out.println ("\t" + "c = " + c);
	
	double d;
	d = b * b - 4 * a * c;
	System.out.println ("\t" + "d = " + d);
	
	double x1;
	x1 = (- b + Math.sqrt(d)) / (2 * a);
	double x2;
	x2 = (- b - Math.sqrt(d)) / (2 * a);
	System.out.println("\t" + a + "х^2 + " + b + "х + " + c + " = 0");
	System.out.println("\t" + "Корни квадратного уравнения x1 = " + x1 + ", x2 = " + x2);
	
	System.out.println();
	}
}
