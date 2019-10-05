package parkkk;

import java.util.Scanner;

public class githubtest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insert Your korean point(0~100) : ");
		int Korean = scanner.nextInt();
		System.out.print("Insert Your English point(0~100) : ");
		int English = scanner.nextInt();
		System.out.print("Insert Your Math point(0~100) : ");
		int Math = scanner.nextInt();
		int Ar =(Korean+English+Math)/3;
				
		System.out.println("Your Average is" + " " +Ar);
		scanner.close();
	}
}