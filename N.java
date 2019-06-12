//changeCase

import java.util.Scanner;
class N
{
	public static String changeCase(String str)
	{	
		char ch[]=str.toCharArray();
		int ascii[]=new int[str.length()];
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			ascii[i]=(int)ch[i]+32;
			else if(ch[i]>=97 && ch[i]<=122)
			ascii[i]=(int)ch[i]-32;
			
			ch[i]=(char)ascii[i];		
		}
		return new String(ch);
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		System.out.println("After changing case :"+changeCase(a));
	}

}