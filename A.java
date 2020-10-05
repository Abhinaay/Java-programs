// word Count

import java.util.Scanner;
class A
{
	static int wordCount(String str)	
	{
		 int totalwords = 0;
	for(int i=0;i<str.length();i++)
	{
	    if(str.charAt(i)==' ')
	    {
	        totalwords +=1;
	    }
	}
	return totalwords+1;


	}

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String a=sc.nextLine();
		int tw=wordCount(a);
		System.out.println("Total Words : "+tw);
	}
}
