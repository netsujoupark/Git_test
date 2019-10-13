import java.util.Random;
import java.util.Scanner;

public class BaseballGame{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] num_ran = new int[3];
		int strike =0;
		int ball = 0;
		
		for(int i =0; i<num_ran.length; i++)
		{
			num_ran[i] =(int)r.nextInt(9)+1;
			for(int j =0; j<i; j++)
			{
				if(num_ran[i] == num_ran[j])
				{
					i--;
				}
			}
		}
		
		String num2 ="";
		for(int i =0; i<num_ran.length; i++)
		{
			num2 +=num_ran[i];
		}
		
		while(true)
		{
			System.out.println("Insert Number ex)145, 376");
			String num = sc.nextLine();
			
			if(num.length()>3 || num.length() <3)
			{
				System.out.print("You Must Insert Number(1-9)");
				continue;
			}
			
			if(num.charAt(0) == num.charAt(1)||num.charAt(0)==num.charAt(2)||num.charAt(1)==num.charAt(2))
			{
				System.out.print("Overlap Numbers exist.");
				continue;
			}
			
			for(int i=0; i<num.length(); i++)
			{
				if(num2.charAt(i) == num.charAt(i))
				{
					strike++;
					ball--;
				}
				for(int j =0; j<num.length(); j++)
				{
					if(num2.charAt(i) == num.charAt(j)) {
						ball++;
						
					}
					
				}
			}
		
		
		System.out.printf("strike: ");
		
		for(int i = 0; i<strike; i++)
		{
			System.out.printf("O");
		}
		
		System.out.printf("ball:");
		
		for(int i =0; i<ball; i++)
		{
			System.out.printf("¡â");
		}
		System.out.println();
		
		System.out.printf("%dS-%dB\n",strike,ball);
		
		if(strike ==3)
		{
			System.out.println("Congratulation!");
			break;
		}
		
		System.out.println("===================");
		
		strike =0;
		ball = 0;
	}
}
}