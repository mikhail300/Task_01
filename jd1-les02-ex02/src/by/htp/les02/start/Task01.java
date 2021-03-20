package by.htp.les02.start;

//	1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
public class Task01 {

	public static void main(String[] args) {
		double x;
		double y;

		x = 4;
		y = -1.25;

		double sumXY;
		double difXY;
		double mulXY;
		double divXY;

		sumXY = x + y;
		difXY = x - y;
		mulXY = x * y;
		divXY = x / y;

		System.out.println(x + " + " + y + " = " + sumXY);
		System.out.println(x + " - " + y + " = " + difXY);
		System.out.println(x + " * " + y + " = " + mulXY);
		System.out.println(x + " / " + y + " = " + divXY);
	}

}
