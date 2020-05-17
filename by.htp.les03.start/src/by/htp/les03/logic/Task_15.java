package by.htp.les03.logic;
// Написать программу, которая выводит на экран первые четыре степени числа π.
public class Task_15 {
	
	public static void task() {
		System.out.println("Task 15 Написать программу, которая выводит на экран первые четыре степени числа π.");
		
		double a;
		
		for (int i = 1 ; i <= 4  ; i++) {
		a = Math.pow(Math.PI, i);
		System.out.println("\t" + "Степень " + i + " числа ПИ = " + a);
		} 
	System.out.println();
	}
}
