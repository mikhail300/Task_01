package by.htp.les03.logic;
// Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а. 
public class Task_24 {
	
	public static void task() {
	System.out.println("Task 24 Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.");
	
	double a;
	double b;
	double alfa;
	a = 5;
	b = 3;
	alfa = 45;
	System.out.println ("\t" + "Основание a = " + a);
	System.out.println ("\t" + "Основание b = " + a);
	System.out.println ("\t" + "Угол = " + alfa);
	
	double s;
	s = ((a * a - b * b) / 4.0) * Math.tan( alfa * Math.PI / 180.0 );
	System.out.println("\t" + "Площадь трапеции с a = " + a + ", b = " + b + " и углом а = " + alfa + " равна " + s);
	
	System.out.println();
	}
}
