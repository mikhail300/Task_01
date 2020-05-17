package by.htp.les03.logic;
// Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.
public class Task_40 {
	public static void task () {
	System.out.println("Task 40 Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.");
	double x = 2.7;
	
	double temp1 = 2 * x + 4 * x * x * x;
	double temp2 = 3 * x * x;
	
	double result1 = - temp1 + temp2;
	double result2 = temp1 + temp2 + 1;
	
	System.out.println("При х = " + x + " значения выражений равны " + result1 + " и " + result2);
	
	System.out.println();
	}
}