package by.htp.les02.start;

public class Task_10 {
// ��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������):
//
	public static void main(String[] args) {
		double x;
		double y;
		
		double res;
		
		x = 1;
		y = 1;
		
		res = ( Math.sin( x ) + Math.cos( y ) ) / ( Math.cos( x ) - Math.asin( y ) ) * Math.tan( x * y );
		System.out.println ("�������� ��������� " + res);
	}

}
