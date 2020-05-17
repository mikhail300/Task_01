package by.htp.les03.logic;
// Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а^8 за три операции и а^10 за четыре операции. 
public class Task_27 {
	
	public static void task() {
	System.out.println("Task 27 Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.");
	
	int a;
	int b;
	
	a = 2;
	System.out.println ("\t" + "a = " + a);
	
	b = a = a * a;
	a = a * a;
	a= a * a;
	System.out.println ("\t" + "a^8 = " + a);
	
	a = a * b;
	System.out.println ("\t" + "a^10 = " + a);

	System.out.println();
	}
}
