package by.htp.les03.logic;
// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//  Целое число N является четным двузначным числом.
//  Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
//  Сумма цифр данного трехзначного числа N является четным числом.
//  Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
//  Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
//  Треугольник со сторонами а,b,с является равнобедренным.
//  Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
//  Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
//  График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
public class Task_37 {
	
	public static void part_01() {
		
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// part 1
		int n1 = 100;
		
		if (n1 / 100 == 0 && n1 % 2 == 0 && n1 > 9) {
			System.out.print("\t" + "True: ");
		}
		else{
			System.out.print("\t" + "False: ");
		}
		System.out.println("Целое число " + n1 + " является четным двузначным числом.");
		}
	
	public static void part_02() {
		
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// part 2
		int n2;
		n2 = 1414;
		int tmp;
		tmp = n2;
		int sum1;
		int sum2;
		
		sum1 = n2 % 10;
		n2 = n2 / 10;
		sum1 = sum1 + (n2 % 10);
		n2 = n2 / 10;
		sum2 = n2 % 10;
		n2 = n2 / 10;
		sum2 = sum2 + (n2 % 10);
		
		if (sum1 == sum2) {
			System.out.print("\t" + "True: ");
		}
		else{
			System.out.print("\t" + "False: ");
		}
		System.out.println("Сумма двух первых цифр четырехзначного числа " + tmp + " равна сумме двух его последних цифр.");
	}	
	
	public static void part_03() {
		
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// part 3
		int n3 = 122;
		
		int sum3 = 0;
		int newNumber3 = n3;
		int count = 0;
		while (count < 3) {
			sum3 = sum3 + (newNumber3 % 10);
			newNumber3 = newNumber3 / 10;
			count++;
		}
		
		if (sum3 % 2 == 0) {
			System.out.print("\t" + "True: ");
		}
		else{
			System.out.print("\t" + "False: ");
		}
		System.out.println("Сумма цифр трехзначного числа " + n3 + " является четным числом.");
	}
	
	public static void part_04() {
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// part 4
		int x = 1;
		int y = 1;
		int m = 2;
		int n = 3;
		
		if (x >= m && x <= n) {
			System.out.print("\t" + "True: ");
		}
		else{
			System.out.print("\t" + "False: ");
		}
		System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит части плоскости, лежащей между прямыми х = " + m + ", х = " + n + " (m < n).");
	}
		
	public static void part_05() {
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// part 5
		int n5 = 100;
		int sum5 = 0;
		int newNumber5 = n5;
		int count = 0;
		while (count < 3) {
			sum5 = sum5 + (newNumber5 % 10);
			newNumber5 = newNumber5 / 10;
			count++;
		}
		
		if (n5 * n5 == Math.pow(sum5, 3)) {
			System.out.print("True: ");
		}
		else{
			System.out.print("False: ");
		}
		System.out.println("Квадрат трехзначного числа " + n5 + " равен кубу суммы цифр этого числа");
	}
	
	public static void part_06() {
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// часть 6
		double a = 3.0;
		double b = 2.0;
		double c = 2.0;
		
		if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
			System.out.print("True: ");
		}
		else{
			System.out.print("False: ");
		}
		System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " является равнобедренным");
	}
	
	public static void part_07() {
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// часть 7
		int n7 = 583;
		
		int newNumber7 = n7;
		int digit1 = newNumber7 % 10;
		newNumber7 = newNumber7 / 10;
		int digit2 = newNumber7 % 10;
		newNumber7 = newNumber7 / 10;
		int digit3 = newNumber7 % 10;
		
		if (digit1 + digit2 == digit3 || digit1 + digit3 == digit2 || digit3 + digit2 == digit1) {
			System.out.print("True: ");
		}
		else{
			System.out.print("False: ");
		}
		System.out.println("Сумма каких-либо двух цифр трехзначного натурального числа " + n7 + " равна третьей цифре.");
	}
	
	public static void part_08() {
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// часть 8
		int n8 = 32;
		int a8 = 2;
		
		if ((n8 == 1) || (n8 == a8) || (n8 == a8 * a8) || (n8 == Math.pow(a8, 3)) || ((n8 == Math.pow(a8, 4)))) {
			System.out.print("True: ");
		}
		else{
			System.out.print("False: ");
		}
		System.out.println("Число " + n8 + " является степенью числа " + a8 + " (показатель степени может находиться в диапазоне от 0 до 4).");
	}
		
	public static void part_09() {
		System.out.println("Task 37 Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:");
		
		// часть 9
		double a9 = 1.0;
		double b9 = 3.0;
		double c9 = -4.0;
		double x9 = 1.0;
		double y9 = 0.0;
		if (y9 == a9 * x9 * x9 + b9 * x9 + c9) {
			System.out.print("True: ");
		}
		else{
			System.out.print("False: ");
		}
		System.out.println("График функции у = " + a9 + "х2 + " + b9 + "х+ " + c9 + " проходит через заданную точку с координатами (" + x9 + ", " + y9 + ")");
		System.out.println();
	}
}