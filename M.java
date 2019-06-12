//Frequency Count

import java.util.Scanner;
class M
{
	public static int frequencyCount(String str1, char c)
	{	
		int count=0;
		
		char ch1[]=str1.toCharArray();
		
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i]==c)
				count++;
		}
			
		
		return count;		
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sentence :");
		String a=sc.nextLine();
		System.out.print("Enter the character :");
		char b=sc.next().charAt(0);
		
		System.out.println("Frequency Count = "+frequencyCount(a,b));
	}

}