//Char Count

import java.util.Scanner;
class C
{
	public static int charCount(String str)
	{
		int count=0;
		
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=' ' && ch[i]!='\t')
				count++;
			
		}
		return count;
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		int total=charCount(a);
		System.out.print("Total characters = "+total);
	}

}