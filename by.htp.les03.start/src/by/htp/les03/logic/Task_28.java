package by.htp.les03.logic;
// Составить программу перевода радианной меры угла в градусы, минуты и секунды. 
public class Task_28 {
	
	public static void task() {
	System.out.println("Task 28 Составить программу перевода радианной меры угла в градусы, минуты и секунды.");
	
	double rad;
	rad= 0.245;
	double degr; 
	degr= rad * 180 / Math.PI;
	
	int degrees; 
	degrees = (int) degr;

	double tmp;
	tmp = (degr - degrees) * 60;
	int minutes;
	minutes = (int) tmp;

	double seconds;
	seconds = (int)((tmp - minutes) * 60);

	System.out.println("\t" + "Исходная мера угла в радианах: " + rad);
	System.out.println("\t" + degrees + "гр. " + minutes + "мин. " + seconds + "c.");
	
	System.out.println();
	}
}
