// word Count

import java.util.Scanner;
class A
{
	static int wordCount(String str)	
	{
		int totalwords=1;
		
	//for trimming left spaces.

		int i=0;
		char ch[]=str.toCharArray();
		
		while(ch[i]==' ')
		{
			for(int j=0;j<=ch.length-2;j++)
			{
				ch[j]=ch[j+1];
			}
						
			
		}
		
	//for counting words after trimming left spaces.

		for(i=0;i<=ch.length-1;i++)
		{
			
			if((ch[i]==' ' && ch[i+1]!=' ' && ch[i+1]!='\t' )||(ch[i]=='\t' && ch[i+1]!='\t' && ch[i+1]!=' ')) 
			totalwords++;
			
		}	
			
			return totalwords;
			

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