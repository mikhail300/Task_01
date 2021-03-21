package by.htp.les03.logic;

public class Task21 {
//	21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
//	Поменять местами дробную и целую части числа и вывести полученное значение числа
	public static void task() {
		System.out.println("21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).");
		System.out.println("Поменять местами дробную и целую части числа и вывести полученное значение числа.");
				
		double R;
		R = 234.567;
		
		System.out.println("\t" + "Число R = " + R);
		System.out.println("");
		
		R = R % 1 * 1000 + ((int)(R)/1000d);
		
		System.out.print("\t" + "Результат = ");
		System.out.printf("%3.3f", R);
		System.out.println();
		System.out.println();
	}
}

