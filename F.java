//Left Trim

import java.util.Scanner;
class F
{
	public static String leftTrim(String str)
	{	
		int i=0;
		char ch[]=str.toCharArray();
		
		while(ch[i]==' ')
		{
			for(int j=0;j<=ch.length-2;j++)
			{
				ch[j]=ch[j+1];
			}
			if(ch[ch.length-1]!=' ')
				ch[ch.length-1]='\0';		// do this otherwise the last character will not get erased after being left shifted.
			
		}
		
		return new String(ch);
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		System.out.println(leftTrim(a));
		
	}

}