package by.htp.les03.logic;
// ������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3). ����� ��� �������� � �������.
public class Task_13 {
	
	public static void task() {
		System.out.println("Task 13 ������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3). ����� ��� �������� � �������.");
		
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		x1 = 1;
		y1 = 1;
		x2 = 4;
		y2 = 5;
		x3 = 1;
		y3 = 5;
		System.out.println("\t" + "x1 = " + x1 + ", y1 = "+ y1 );
		System.out.println("\t" + "x2 = " + x2 + ", y2 = "+ y2 );
		System.out.println("\t" + "x3 = " + x2 + ", y3 = "+ y3 );
		
		double a;
		double b;
		double c;
		
		a = Math.sqrt( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) );
		System.out.println("\t" + "������� A = " + a);
		b = Math.sqrt( ( x2 - x3 ) * ( x2 - x3 ) + ( y2 - y3 ) * ( y2 - y3 ) );
		System.out.println("\t" + "������� B = " + b);
		c = Math.sqrt( ( x3 - x1 ) * ( x3 - x1 ) + ( y3 - y1 ) * ( y3 - y1 ) );
		System.out.println("\t" + "������� C = " + c);
		
		double p;
		p = a + b + c;
		
		System.out.println("\t�������� ������������ " + p + " ��.");
		
		double s;
		s = ( ( x1 - x3 ) * ( y2 - y3 ) - ( x2 - x3 ) * ( y1 - y3 ) ) * 0.5;
		
		System.out.println("\t" + "������� ������������ " + s + " ��.��.");
		System.out.println();
	}
}
