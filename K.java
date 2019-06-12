//String Length

import java.util.Scanner;
class K
{
	public static int stringLength(String str)
	{	int count=0;
		
		char ch[]=str.toCharArray();
		for(int i:ch)
		{	
			count++;	
				
		}	
		
		return count;
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		System.out.println("String Length = "+stringLength(a));
	}

}