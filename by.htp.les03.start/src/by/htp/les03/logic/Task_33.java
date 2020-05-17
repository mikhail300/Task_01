package by.htp.les03.logic;
// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. 
public class Task_33 {
	
	public static void task() {
	System.out.println("Task 33 Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.");
	
	char currChar = 'D';
	int asciiCurr = (int) currChar;
	System.out.println("\t" + "Исходный символ: " + currChar + ", номер: " + asciiCurr);
	
	int asciiPrev = asciiCurr - 1;
	char prevChar = (char) asciiPrev;
	System.out.println("\t" + "Предыдущий символ: " + prevChar + ", номер: " + asciiPrev);
	
	int asciiNext = asciiCurr + 1;
	char nextChar = (char) asciiNext;
	System.out.println("\t" + "Следующий символ: " + nextChar + ", номер: " + asciiNext);
	
	System.out.println();
	}
}
