package by.htp.les03.logic;
// Найти частное произведений четных и нечетных цифр четырехзначного числа. 
public class Task_36 {
	
	public static void task() {
	System.out.println("Task 36 Найти частное произведений четных и нечетных цифр четырехзначного числа.");
	
	int number;
	number= 6246;
	System.out.println("\t" + "Число: " + number);
	
	double quotient;
	
	int odd;
	int even;
	
	odd = number % 10;
	number = number / 10;
	even = number % 10;
	number = number / 10;
	odd = odd * (number % 10);
	number = number / 10;
	even = even * (number % 10);
	System.out.println("\t" + "Произведение четных = " + even);
	System.out.println("\t" + "Произведение нечетных = " + odd);
	
	quotient = (double)even /(double)odd;
	System.out.println("\t" + "частное произведений четных и нечетных цифр = " + quotient);
		
	System.out.println();
	}
}
