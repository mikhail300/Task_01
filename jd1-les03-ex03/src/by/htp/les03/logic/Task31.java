package by.htp.les03.logic;

public class Task31 {
// 31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, 
// скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
	public static void task() {
		System.out.println("31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,");
		System.out.println("скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.");
		
		double v;
		double v1;
		double t1;
		double t2;

		v= 25.0;
		v1= 2.0;
		t1 = 3.0;
		t2= 1.5;
		
		System.out.println("\t" + "v = " + v);
		System.out.println("\t" + "v1 = " + v1);
		System.out.println("\t" + "t1 = " + t1);
		System.out.println("\t" + "t2 = " + t2);
		System.out.println();
		
		double s = t1 * v + t2 * (v - v1);
		
		System.out.println("\t" + "Путь = " + s);
		System.out.println();
	}
}
