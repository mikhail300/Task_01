package by.htp.les03.logic;

public class Task32 {
// 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59).
//  Какое время будут показывать часы через р ч q мин r с?
	public static void task() {
		System.out.println("32. Текущее показание электронных часов: m ч (0 ≤ т ≤23) n мин (0 ≤ п ≤59) k с (0 ≤к ≤59).");
		System.out.println("Какое время будут показывать часы через р ч q мин r с?");
		
		int m;
		int n;
		int k;
		
		m = 23;
		n = 59;
		k = 59;
		
		System.out.println("\t" + "Сейчас " + m + ":" + n + ":" + k);
		System.out.println();
		
		int p;
		int q;
		int r;
		
		p = 48;
		q = 121;
		r = 2;
		
		System.out.println("\t" + "Прибавляем " + p + "час., " + q + "мин., " + r + "сек.");
		System.out.println();
		
		int mRez = 0;
		int nRez = 0;
		int kRez;
		
		kRez = ((k + r)%60);
		nRez = (q + n + (k + r) / 60) % 60;
		mRez = (m + p + (q + n + (k + r) / 60) / 60) % 24;
		
		System.out.println("\t" + "Результат " + mRez + ":" + nRez + ":" + kRez);
		System.out.println();
	}
}
