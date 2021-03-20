package by.htp.les02.start;

public class Task06 {
//	6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
//	если в каждом большом бидоне на 12 л. больше, чем в малом?

	public static void main(String[] args) {
		int n;
		int m;

		double rez;

		n = 6;
		m = 3;

		rez = ((80.0 / n) + 12) * m;

		System.out.println("В m больших бидонах " + rez + " литров молока");
	}

}
