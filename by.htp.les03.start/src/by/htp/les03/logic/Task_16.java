package by.htp.les03.logic;
// Найти произведение цифр заданного четырехзначного числа.
public class Task_16 {
	
	public static void task() {
		System.out.println("Task 16 Найти произведение цифр заданного четырехзначного числа.");
		
		int a;
		a = 1234;
		
		int pos;
		pos = 1;
		
		System.out.println("\t" + "Заданное число a = " + a);
		
		while (a > 0){
			pos = pos * (a % 10);
			System.out.print((a % 10) + ", ");
			a = a / 10;
		}

		System.out.println("\t" + "Произведение цифр числа равно " + pos);
		System.out.println();
	}
}
