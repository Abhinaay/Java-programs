//SingleOccurrence

import java.util.Scanner;
class O
{
	public static void singleOccurrence(String str1)
	{	
		int count=0,k=0;
		char ch1[]=str1.toCharArray();
		char ch2[]=new char[128];		//For Only 128 characters. write 256 for 256 characters.
		char ch3[]=new char[ch1.length];
		for(int i=0;i<ch1.length;i++)
		{
			ch2[ch1[i]]++;
		}
		for(int j=0;j<ch1.length;j++)
		{
			if(ch2[ch1[j]]==1)
			{
				ch3[k]=ch1[j];
				k++;
			}
		}
		System.out.print("Single occurred characters are :");
		System.out.println(ch3);		
					
		
		
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1 :");
		String a=sc.nextLine();
		
		singleOccurrence(a);
	}

}