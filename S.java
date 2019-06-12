//Equals.
//It is Case Sensitive.

import java.util.Scanner;
class S
{
	public static boolean equals(String str1, String str2)
	{	int a;
		int i=0;
		int j=0;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		if(ch1.length!=ch2.length)
			return false;
		
					
		while(i<=ch1.length)
		{		
			
			if(ch1[i]==ch2[j])
			{
				j++;
				i++;
				
			}
			else
				return false;
			
		}
		
		return true;
		
		
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1 :");
		String a=sc.nextLine();
		System.out.print("Enter String2 :");
		String b=sc.nextLine();
		
		boolean z=equals(a,b);
		
		if(z==true)
		System.out.println("String1 is Equals to String2");
		else if(z==false)
		System.out.println("String1 is Not Equals to String2");
	}

}