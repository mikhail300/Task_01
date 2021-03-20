package by.htp.les02.start;

public class Task10 {
//	10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	public static void main(String[] args) {
		double x;
		double y;

		double rez;

		x = Math.PI / 2;
		y = Math.PI ;

		rez = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		System.out.println("Значение выражения = " + rez);
	}

}
