package by.htp.les03.logic;
// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения. 
public class Task_30 {
	
	public static void task() {
	System.out.println("Task 30 Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.");
	
	double r1;
	double r2;
	double r3;
	r1 = 3;
	r2 = 6;
	r3 = 6;
	System.out.println ("\t" + "Сопротивление R1 = " + r1);
	System.out.println ("\t" + "Сопротивление R1 = " + r2);
	System.out.println ("\t" + "Сопротивление R1 = " + r3);
	
	double r;
	r = 1 / (1 / r1 + 1 / r2 + 1 / r3);
	System.out.println("\t" + "Сопротивление = " + r);
	
	System.out.println();
}
}
