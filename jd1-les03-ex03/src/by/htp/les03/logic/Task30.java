package by.htp.les03.logic;

public class Task30 {
// 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
	public static void task() {
		System.out.println("30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.");
		
		double R1;
		double R2;
		double R3;
		
		R1 = 3;
		R2 = 3;
		R3 = 3;
		
		System.out.println("\t" + "Сопротивления R1 = " + R1 + ", R2 = " + R2 + ", R3 = " + R3);
		System.out.println();
		
		double R;
		R = 1 / (1 / R1 + 1 / R2 + 1 / R3);
		
		System.out.println("Сопротивление соединения R = " + R);
		System.out.println();
	}
}
