package by.htp.les03.logic;

public class Task22 {
// 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.
	public static void task() {
		System.out.println("22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.");
		System.out.println("Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.");
				
		int T;
		T = 16747;
		
		System.out.println("\t" + "Число T = " + T);
		System.out.println();
		
		int hours;
		hours = T / 3600;
		
		int minutes;
		minutes = (T - hours * 3600 ) / 60;
		
		int seconds;
		seconds = (T - hours * 3600 - minutes * 60);

		System.out.print("\t" + "Результат: ");
		System.out.printf("%02dч %02dмин %02dс.", hours, minutes, seconds);
		System.out.println();
		System.out.println();
	}

}
