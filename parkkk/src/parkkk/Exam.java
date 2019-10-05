package parkkk;

import java.util.Scanner;
//°ú¸ñº° Æò±ÕÁ¡¼ö±¸ÇÏ±â //Î¡ÙÍÜ¬øÁĞ³ïÃ
public class Exam {
	public static void main(String[] args) {
	String name =""; 
	int ksum =0; 
	int esum =0; 
	int msum =0; 
	System.out.print("insert number of student : "); 
	Scanner scanner = new Scanner(System.in); 
	int p = scanner.nextInt();
	int intArray[][] = new int[3][p]; 
	String stu[] = new String[p];    
	
	System.out.print("insert "+stu.length + " student's name");
	for(int i=0; i<stu.length; i++)
		stu[i] = scanner.next(); 
	
	for(int i=0; i<stu.length; i++)
		name += stu[i]; 
	
	System.out.print("insert "+intArray.length + " student's korean grade(0~100)");
	for(int i =0; i<intArray.length; i++)
		intArray[0][i] = scanner.nextInt(); 
	
	for(int i=0; i<intArray.length; i++)
		ksum += intArray[0][i]; 
	
	System.out.print("insert "+intArray.length + " student's English grade(0~100)");
	for(int i=0; i<intArray.length; i++)
		intArray[1][i] = scanner.nextInt(); 
	
	for(int i=0; i<intArray.length; i++)
		esum += intArray[1][i]; 
	
	System.out.print("insert "+intArray.length + " student's Math grade(0~100)");
	for(int i=0; i<intArray.length; i++)
		intArray[2][i] = scanner.nextInt(); 
	
	for(int i=0; i<intArray.length; i++)
		msum += intArray[2][i]; 
	
	System.out.println("Korean's point average is " + (double)ksum/intArray.length); 
	System.out.println("English's point average is " + (double)esum/intArray.length); 
	System.out.println("Math's point average is " + (double)msum/intArray.length); 
	System.out.println("Total point average is " + (double)(ksum+esum+msum)/p/intArray.length); 
	
	
	}
	
}