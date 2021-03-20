package by.htp.les02.start;

public class Task08 {
//	8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		double rez;

		a = 2.0;
		b = 8.0;
		c = 4.0;

		rez = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("Значение выражения = " + rez);
	}

}
