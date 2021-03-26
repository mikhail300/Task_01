package by.htp.les02.start;

// 4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class Task04 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 3.0;
		b = 5.0;
		c = 4.0;

		double z;

		z = ((a - 3) * b / 2) + c;

		System.out.println("Для a = " + a + ", b = " + b + ", c = " + c + " значение функции ( ( a - 3 ) * b / 2) + c = " + z);
	}

}
