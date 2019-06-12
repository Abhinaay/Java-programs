//Palindrome

import java.util.Scanner;
class E
{
	public static boolean palindrome(String str)
	{
		char ch1[]=str.toCharArray();
		int count=0;
		if(ch1.length%2==0)
		{
			for(int i=0;i<ch1.length/2;i++)
			{
				if(ch1[i]==ch1[ch1.length-1-i])
				count=1;
			}
		}
		else
		{
			for(int i=0;i<(ch1.length-1)/2;i++)
			{
				if(ch1[i]==ch1[ch1.length-1-i])
				count=1;
			}
		}
		
		if(count==1)
		return true;
		else
		return false;
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		if(palindrome(a)==true)
		System.out.print(a+" is a Palindrome");
		else
		System.out.print(a+" is NOT a Palindrome");
	}

}