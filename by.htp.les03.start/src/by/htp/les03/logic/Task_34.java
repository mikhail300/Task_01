package by.htp.les03.logic;
// Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации 
public class Task_34 {
	
	public static void task() {
	System.out.println("Task 34 Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации");
	long Bytes;
	Bytes = 9456756246L;
	System.out.println("\t" + Bytes + " байт это ");
	
	double kBytes;
	kBytes = Bytes / Math.pow(1024, 1);
	System.out.println("\t" + kBytes + " Кб");
	
	double mBytes;
	mBytes = Bytes / Math.pow(1024, 2);
	System.out.println("\t" + mBytes + " Мб");
	
	double gBytes;
	gBytes = Bytes / Math.pow(1024, 3);
	System.out.println("\t" + gBytes + " Гб");
	
	double tBytes;
	tBytes = Bytes / Math.pow(1024, 4);
	System.out.println("\t" + tBytes + " Тб");
	
	System.out.println();
	}
}
