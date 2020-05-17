package by.htp.les03.logic;
// Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с? 
public class Task_32 {
	public static void task() {
	System.out.println("Task 32 Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?");
	
	int hoursCurrent;
	int minutesCurrent;
	int secondsCurrent;
	hoursCurrent = 23;
	minutesCurrent = 23;
	secondsCurrent = 14;
	System.out.println("\t" + "Сейчас: " + hoursCurrent + " ч. " + minutesCurrent + " мин. " + secondsCurrent + " c.");
	
	int hoursInterval;
	int minutesInterval;
	int secondsInterval;
	hoursInterval= 48;
	minutesInterval = 1;
	secondsInterval = 1;
	System.out.println("\t" + "Через: " + hoursInterval + " ч. " + minutesInterval + " мин. " + secondsInterval + " c.");
	
	int currentInSeconds;
	currentInSeconds = hoursCurrent * 3600 + minutesCurrent * 60 + secondsCurrent;
	int intervalInSeconds;
	intervalInSeconds = hoursInterval * 3600 + minutesInterval * 60 + secondsInterval;
	
	int finalInSeconds;
	finalInSeconds = currentInSeconds + intervalInSeconds;
	
	int hoursFinal;
	hoursFinal = (finalInSeconds / 3600);
	
	int tmp;
	tmp = finalInSeconds - (hoursFinal * 3600);
	int minutesFinal;
	minutesFinal = tmp / 60;
	
	int secondsFinal;
	secondsFinal = tmp - (minutesFinal * 60);
	
	int hours24Format;
	hours24Format = 0;
	if (hoursFinal > 23){
		tmp = (hoursFinal / 24);
		hours24Format = hoursFinal - tmp * 24;
	}
	else {
		hours24Format = hoursFinal;
	}
	
	
	System.out.println("\t" + "Будет: " + hours24Format + " ч. " + minutesFinal + " мин. " + secondsFinal + " c.");
	
	System.out.println();
	}
}
