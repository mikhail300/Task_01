package by.htp.les02.start;

public class Task_01 {
// ƒаны два действительных числа, вычислить их сумму, разность, произведение и частное.
	public static void main(String[] args) {
		double x;
		double y;
		
		x = 4;
		y = -1.25;
		
		double sum_x_y;
		double dif_x_y;
		double mul_x_y;
		double div_x_y;
		
		sum_x_y = x + y;
		dif_x_y = x - y;
		mul_x_y = x * y;
		div_x_y = x / y;
		
		System.out.println ("X + Y = " + sum_x_y);
		System.out.println ("X - Y = " + dif_x_y);
		System.out.println ("X * Y = " + mul_x_y);
		System.out.println ("X / Y = " + div_x_y);
	}

}
