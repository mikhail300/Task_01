package by.htp.les02.start;

public class Task_06 {
// написать код для решения задачи. В n малых бидонах 80 литров молока. 
// Сколько литров молока в m больших бидонах, 
// если в каждом большом бидоне на 12 литров молока больше, чем в малом.
	public static void main(String[] args) {
		int n;
		int m;
		
		int res;
		
		n = 4;
		m = 5;
		
		res = (80 / n + 12 ) * m;
		
		System.out.println ("В " + n + " больших бидонах " + res + " литров молока.");
	}

}
