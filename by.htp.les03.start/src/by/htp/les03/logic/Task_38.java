package by.htp.les03.logic;
// Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
public class Task_38 {
	
	public static void task() {
	System.out.println("Task 38 Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:");
	int x = 2;
	int y = 3;
	
	// задание 1
	if (y + Math.abs(x) <= 4 && y >= 0){
		System.out.print("\t" + "True: ");
	}
	else{
		System.out.print("\t" + "False: ");
	}
	System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
	
	// задание 2
	if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
		System.out.print("\t" + "True: ");
	}
	else{
		System.out.print("\t" + "False: ");
	}
	System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
	
	// задание 3
	if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)){
		System.out.print("\t" + "True: ");
	}
	else{
		System.out.print("\t" + "False: ");
	}
	System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
	
	System.out.println();
	}
}