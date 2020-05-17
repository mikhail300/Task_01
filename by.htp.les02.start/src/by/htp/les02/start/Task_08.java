package by.htp.les02.start;

public class Task_08 {
// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// 
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		a = 3;
		b = 8;
		c = 5;
				
		double res;
		
		res = ( b + Math.sqrt ( Math.pow(b, 2) + 4 * a * c ) ) / ( 2 * a ) - Math.pow(a, 3) * c + Math.pow(b, -2);  
		
		System.out.println ("Занчение выражения " + res);
	}

}
