//Space Count

import java.util.Scanner;
class B
{
	public static int spaceCount(String str)
	{
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				count++;
		}
		return count;
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		int total=spaceCount(a);
		System.out.print("Total Spaces = "+total);
	}

}