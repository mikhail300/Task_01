package by.htp.les03.logic;

public class Task38 {
// 38. Для данных областей составить линейную программу, которая печатает true, 
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
	public static void part1() {
		System.out.println("38. Для данных областей составить линейную программу, которая печатает true,");
		System.out.println("если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:");
		
		int x = 2;
		int y = 3;
		
		System.out.println("\t" + "1 Точка с координатами (x = " + x + ", y = " + y + ") принадлежит закрашенной области.");
		
		if (y + Math.abs(x) <= 4 && y >= 0){
			
			System.out.println("\t" + "true");
		
		}else{
			
			System.out.println("\t" + "false");
			
		}
		System.out.println();
	}

	public static void part2() {
		System.out.println("38. Для данных областей составить линейную программу, которая печатает true,");
		System.out.println("если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:");
		
		int x = 2;
		int y = 3;
		
		System.out.println("\t" + "2 Точка с координатами (x = " + x + ", y = " + y + ") принадлежит закрашенной области.");
		
		if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
			
			System.out.println("\t" + "true");
		
		}else{
			
			System.out.println("\t" + "false");
		
		}
		System.out.println();
		}

	public static void part3() {
		System.out.println("\t" + "38. Для данных областей составить линейную программу, которая печатает true,");
		System.out.println("если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:");

	}
}
