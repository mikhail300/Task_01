package by.htp.les03.logic;

public class Task34 {
// 34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
	public static void task() {
		System.out.println("34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.");
		
		long Bytes;
		Bytes = 94567562469789L;
		
		System.out.println("\t" + Bytes + " байт это ");
		System.out.println();
		
		long kBytes;
		kBytes = (long) (Bytes / Math.pow(1024, 1));
		
		System.out.println("\t" + kBytes + " Кб");
		
		long mBytes;
		mBytes = (long) (Bytes / Math.pow(1024, 2));
		
		System.out.println("\t" + mBytes + " Мб");
		
		long gBytes;
		gBytes = (long) (Bytes / Math.pow(1024, 3));
		
		System.out.println("\t" + gBytes + " Гб");
		
		long tBytes;
		tBytes = (long) (Bytes / Math.pow(1024, 4));
		
		System.out.println("\t" + tBytes + " Тб");
		System.out.println();
	}
}
