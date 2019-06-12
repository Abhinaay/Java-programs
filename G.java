//Right Trim

import java.util.Scanner;
class G
{
	public static String rightTrim(String str)
	{
		char ch[]=str.toCharArray();
		int i=ch.length-1;
		while(ch[i]==' ' || ch[i]=='\t')
		{
			ch[i]='\0';
			i--;
		}
		
		return new String(ch);
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		System.out.println("After Trim :"+rightTrim(a));
		
	}

}