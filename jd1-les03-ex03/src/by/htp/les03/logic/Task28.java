package by.htp.les03.logic;

public class Task28 {
// 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
	public static void task() {
		System.out.println("28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.");
				
		double rad;
		rad = 0.245;
		
		System.out.println("\t" + "Исходная мера угла в радианах: " + rad);
		System.out.println();
		
		double degr;
		degr = rad * 180 / Math.PI;

		int degrees;
		degrees = (int) degr;

		double tmp;
		tmp = (degr - degrees) * 60;
		int minutes;
		minutes = (int) tmp;

		double seconds;
		seconds = (int) ((tmp - minutes) * 60);

		System.out.println("\t" + degrees + "гр. " + minutes + "мин. " + seconds + "c.");

		System.out.println();
	}

}
