//CompareTo

import java.util.Scanner;
class T
{
	public static int compareTo(String str1, String str2)
	{	int a,c;
		int i=0;
		int j=0;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		if(ch1.length>=ch2.length)
			a=ch1.length;
		else
			a=ch2.length;
			
		while(i<=a-1)
		{
			if(ch1[i]==ch2[j])
			{	i++;
				j++;
			}
			else
			{	c=(int)ch1[i]-(int)ch2[j];
				return c;
			}
			if(i>=ch1.length && j<ch2.length)
			{
				c=-ch2.length;
				return c;
			}
			if(i<ch1.length && j>=ch2.length)
			{
				c=ch1.length-ch2.length;
				return c;
			}
		}
					
		
		return 0;
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1 :");
		String a=sc.nextLine();
		System.out.print("Enter String2 :");
		String b=sc.nextLine();
		
		System.out.println("Result : "+compareTo(a,b));
	}

}