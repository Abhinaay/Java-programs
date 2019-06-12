//Reverse String

import java.util.Scanner;
class D
{
	public static String reverse(String str)
	{
		char ch1[]=str.toCharArray();
		char temp;
		if(ch1.length%2==0)
		{	for(int i=0;i<ch1.length/2;i++)
			{ 
				temp=ch1[i];
				ch1[i]=ch1[ch1.length-1-i];
				ch1[ch1.length-1-i]=temp;		
			}
		}
		else
		{	for(int i=0;i<(ch1.length-1)/2;i++)
			{ 
				temp=ch1[i];
				ch1[i]=ch1[ch1.length-1-i];
				ch1[ch1.length-1-i]=temp;		
			}
		}
		
		return new String(ch1);
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the String :");
		String a=sc.nextLine();
		
		System.out.print(reverse(a));
	}

}