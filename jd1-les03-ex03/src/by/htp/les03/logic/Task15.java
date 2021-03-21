package by.htp.les03.logic;

public class Task15 {
// 15. Написать программу, которая выводит на экран первые четыре степени числа π.
	public static void task() {
		System.out.println("15. Написать программу, которая выводит на экран первые четыре степени числа π.");
		
		for (int i = 1; i < 5; i++) {
		
			System.out.println("\t" + i + "я степень числа π = " + Math.pow(Math.PI, i));
		
		}
		
		System.out.println();

	}

}
