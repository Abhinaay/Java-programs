//find

import java.util.Scanner;
class R
{
	public static boolean find(String str1, String str2)
	{	
		int a=0;
		int j=0;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
			while(j<=ch1.length-1)
			{
				if(ch2[a]==ch1[j])
				{
					j++;
					a++;
						
				}
				else
				{
					j++;
					a=0;
				}
			
				if(a==ch2.length)
				return true;	
			}
			
			
			
			return false;		

		
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		System.out.print("Enter the word to find :");
		String b=sc.nextLine();
		
		boolean z=find(a,b);
		
		if(z==true)
		System.out.println("The word is present in the given sentence.");
		else if(z==false)
		System.out.println("The word is NOT present in the given sentence.");
	}

}