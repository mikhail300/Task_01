package by.htp.les03.logic;
// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc. 
public class Task_22 {
	
	public static void task() {
	System.out.println("Task 22 Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.");
	System.out.println("\t" +"Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.");
	
	int T;
	T = 13985;
	System.out.println("\t" + "Длительность прошедшего времени " + T + " секунд.");
	
	int hours;
	hours = (T / 3600);

	int temp;
	temp = T - (hours * 3600);
	int minutes;
	minutes = temp / 60;

	int seconds;
	seconds = temp - (minutes * 60);

	System.out.println("\t" + hours + "ч. " + minutes + "мин. " + seconds + "c.");
	
	System.out.println();
	
	}
}
