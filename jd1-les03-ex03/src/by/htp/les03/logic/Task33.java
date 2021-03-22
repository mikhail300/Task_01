package by.htp.les03.logic;

public class Task33 {
// 33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
	public static void task() {
		System.out.println("33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.");
		
		char currChar;
		currChar = 'D';
		
		int asciiCurrChar;
		asciiCurrChar = (int) currChar;
		
		System.out.println("\t" + "Заданный символ " + currChar + " его номер " + asciiCurrChar);
		System.out.println();
		
		char nextChar;
		nextChar = (char) (asciiCurrChar + 1);
		
		System.out.println("\t" + "Следующий символ " + nextChar);
		
		char prevChar;
		prevChar = (char) (asciiCurrChar - 1);
		
		System.out.println("\t" + "Предыдущий символ " + prevChar);
		System.out.println();
	}
}
