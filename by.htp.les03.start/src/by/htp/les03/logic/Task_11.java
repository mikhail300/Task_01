package by.htp.les03.logic;
// ��������� �������� � ������� �������������� ������������ �� ������ � � b ���� �������.
public class Task_11 {

	public static void task() {
		System.out.println("Task 11 ��������� �������� � ������� �������������� ������������ �� ������ � � b ���� �������.");
		
		double a;
		double b;
		
		a = 3;
		b = 4;
		System.out.println("\t" + "������� a = " + a + " ��.");
		System.out.println("\t" + "������� b = " + b + " ��.");
		
		double s; // �������
		double p; // ��������
		
		s = 0.5 * a *b ;
		p = a + b + Math.sqrt( a * a + b * b );
		
		System.out.println("\t" + "������� ������������ " + s + " ��.��.");
		System.out.println("\t" + "�������� ������������ " + p + " ��.");
		System.out.println();
	}
}
