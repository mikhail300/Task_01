package by.htp.les02.start;

public class Task09 {
//	9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;

		double rez;

		a = 2.0;
		b = 3.0;
		c = 1.0;
		d = 2.0;

		rez = (a / c) * (b / d) - (a * b - c) / (c * d);
		System.out.println("Значение выражения = " + rez);
	}

}
