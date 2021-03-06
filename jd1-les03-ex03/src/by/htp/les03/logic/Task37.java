package by.htp.les03.logic;

public class Task37 {
// 37. Составить линейную программу, печатающую значение true, 
// если указанное высказывание является истинным, и false — в противном случае:
//	1 Целое число N является четным двузначным числом.
//	2 Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
//	3 Сумма цифр данного трехзначного числа N является четным числом.
//	4 Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n).
//	5 Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
//	6 Треугольник со сторонами а,b,с является равнобедренным.
//	7 Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
//	8 Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
//	9 График функции у = ах^2 + bх+ с проходит через заданную точку с координатами (m, n).
	public static void part1() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "1 Целое число N является четным двузначным числом.");
		
		int N;
		N = 11;

		System.out.println();
		System.out.println("\t" + "Целое число N = " + N + " является четным двузначным числом.");
		
		if (100 > Math.abs(N) && Math.abs(N) > 9 && (N % 2) == 0) {
			
			System.out.println("\t" + "true");
			
		}else {
			
			System.out.println("\t" + "false");
			
		}
				
		System.out.println();
	}
		
	public static void part2() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "2 Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.");
		
		int N;
		N = 1011;

		System.out.println();
		System.out.println("\t" + "Сумма двух первых цифр заданного четырехзначного числа " + N + " равна сумме двух его последних цифр.");
				
		int N0;
		int N1;
		int N2;
		int N3;
		
		N0 = N / 1 % 10;
		N1 = N / 10 % 10;
		N2 = N / 100 % 10;
		N3 = N / 1000 % 10;
		
		if ((N0 + N1) == (N2 + N3)) {
			
			System.out.println("\t" + "true");
			
		}else {
			
			System.out.println("\t" + "false");
			
		}
		
		System.out.println();
	}
	
	public static void part3() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "3 Сумма цифр данного трехзначного числа N является четным числом.");
		
		int N;
		N = 111;
		
		System.out.println();
		System.out.println("\t" + "Сумма цифр данного трехзначного числа N = " + N + " является четным числом.");
				
		int N0;
		int N1;
		int N2;
				
		N0 = N / 1 % 10;
		N1 = N / 10 % 10;
		N2 = N / 100 % 10;
				
		if ((N0 + N1 + N2) % 2 ==0) {
			
			System.out.println("\t" + "true");
			
		}else {
			
			System.out.println("\t" + "false");
			
		}
		
		System.out.println();
	}
	
	public static void part4() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "4 Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n).");

		double x;
		double y;
		
		x = 6;
		y = 5;

		double m;
		double n;
		
		m = 2;
		n = 5;
		
		System.out.println();
		System.out.println("\t" + "Точка с координатами (x = " + x + ", y = " + y + ") принадлежит части плоскости, лежащей между прямыми x = " + m + ", x = " + n);

		if (x >= m && n >= x) {
			
			System.out.println("\t" + "true");
			
		}else {
			
			System.out.println("\t" + "false");
			
		}
		
		System.out.println();
	}
	
	public static void part5() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "5 Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.");

		int N;
		N = 345;
		
		System.out.println();
		System.out.println("\t" + "Квадрат заданного трехзначного числа " + N + " равен кубу суммы цифр этого числа.");
				
		int N0;
		int N1;
		int N2;
				
		N0 = N / 1 % 10;
		N1 = N / 10 % 10;
		N2 = N / 100 % 10;
		
		if ((N * N) == ((N0 + N1 + N2) * (N0 + N1 + N2) * (N0 + N1 + N2))) {
			
			System.out.println("\t" + "true");
			
		}else {
			
			System.out.println("\t" + "false");
			
		}	
		
		System.out.println();
	}
	
	public static void part6() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "6 Треугольник со сторонами а,b,с является равнобедренным.");

		double a;
		double b;
		double c;
		
		a = 2;
		b = 2;
		c = 3;

		System.out.println();
		System.out.println("\t" + "Треугольник со сторонами a = " + a + ", b = " + b + ", c = " + c + " является равнобедренным.");
				
		if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a) || (a == b && b == c)) {

			System.out.println("\t" + "true");

		}else{
		
			System.out.println("\t" + "false");

		}
		
		System.out.println();
	}
	
	public static void part7() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "7 Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.");

		int N;
		N = 342;
		
		System.out.println();
		System.out.println("\t" + "Сумма каких-либо двух цифр заданного трехзначного натурального числа N = " + N + " равна третьей цифре.");
				
		int N0;
		int N1;
		int N2;
				
		N0 = N / 1 % 10;
		N1 = N / 10 % 10;
		N2 = N / 100 % 10;
		
		if (N0 + N1 == N2 || N0 + N2 == N1 || N2 + N1 == N0) {

			System.out.println("\t" + "true");

		}else{
		
			System.out.println("\t" + "false");

		}
		
		
		System.out.println();
	}
	
	public static void part8() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "8 Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).");
		
		int N = 16;
		int a = 2;
		
		System.out.println();
		System.out.println("\t" + "Заданное число N = " + N + " является степенью числа a = " + a + " (показатель степени может находиться в диапазоне от 0 до 4).");
				
		if ((N == 1) || (N == a) || (N == a * a) || (N == Math.pow(a, 3)) || ((N == Math.pow(a, 4)))) {

			System.out.println("\t" + "true");

		}else{
		
			System.out.println("\t" + "false");

		}
		
		System.out.println();
	}
	
	public static void part9() {
		System.out.println("37. Составить линейную программу, печатающую значение true,");
		System.out.println("если указанное высказывание является истинным, и false — в противном случае:");
		System.out.println("\t" + "9 График функции у = ах^2 + bх+ с проходит через заданную точку с координатами (m, п).");
		
		double a;
		double b;
		double c;
		double x;
		double y;
		
		a = 1.0;
		b = 3.0;
		c = -4.0;
		x = 1.0;
		y = 0.0;

		System.out.println();
		System.out.println("\t" + "График функции у = " + a + "х^2 + " + b + "х+ " + c + " проходит через заданную точку с координатами (x = " + x + ", y = " + y + ")");
				
		if (y == a * x * x + b * x + c) {
			
			System.out.println("\t" + "true");
			
		}else{
			
			System.out.println("\t" + "false");
			
		}
		
		System.out.println();
	}
}
