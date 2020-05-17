package by.htp.les03.logic;
// Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N. 
public class Task_35 {
	
	public static void task() {
	System.out.println("Task 35 Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.");
	int m = 24435;
	int n = 65;
	System.out.println("\t" + "m = " + m );
	System.out.println("\t" + "n = " + n );
	
	double result;
	result = (double) m / n;
	System.out.println("\t" + m + " / " + n + " = " + result);
	
	int younger;
	younger = (int) (result % 10);
	System.out.println("\t" + "Младшая цифра целой части: " + younger);
	
	int older;
	older = (int) ((result * 10) % 10);
	System.out.println("\t" + "Старшая цифра дробной части: " + older);
	
	
	System.out.println();
	}
}
