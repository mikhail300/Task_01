package by.htp.les02.start;

public class Task_09 {
	// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	//
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		
		a = 3;
		b = 8;
		c = 5;
		d = 4;
						
		double res;

		res = ( a / c ) * ( b / d ) - ( a * b - c ) / (c * d);
		
		System.out.println ("Занчение выражения " + res);
	}

}
