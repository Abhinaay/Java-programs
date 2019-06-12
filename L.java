//Sequence Count

import java.util.Scanner;
class L
{
	public static int sequenceCount(String str1, String str2)
	{	
		int count=0,a=0;
		int i=0;
		int j=0;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		while(i<=ch1.length-1)
		{
			if(ch1[i]==ch2[j])
			{
				i++;
				j++;
				a++;
			}
			else
			{
				i++;
				a=0;
				j=0;
			}

			if(a==ch2.length)
				{	count++;
					j=0;
				}			
		}
		return count;		
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String WITHOUT GIVING SPACES AND TABS :");
		String a=sc.next();
		System.out.print("Enter String2 :");
		String b=sc.next();
		
		System.out.println("Sequence Count = "+sequenceCount(a,b));
	}

}