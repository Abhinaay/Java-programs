//vowel Count

import java.util.Scanner;
class J
{
	public static int vowelCount(String str)
	{	int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			count++;
		}	
		
		return count;
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		System.out.println("Number of Vowels = "+vowelCount(a));
	}

}