//all Trim

import java.util.Scanner;
class H
{
	public static String allTrim(String str)
	{
		char ch[]=str.toCharArray();
		int i=ch.length-1;			// for right trim
		while(ch[i]==' ' || ch[i]=='\t')
		{
			ch[i]='\0';
			i--;
		}

		
		while(ch[0]==' ' || ch[0]=='\t')		// for left trim
		{
			for(int k=0;k<=ch.length-2;k++)
				ch[k]=ch[k+1];
			if(ch[ch.length-1]!=' ')
				ch[ch.length-1]='\0';		// do this otherwise the last character will not get erased after being left shifted.
		}		

		
		for(int z=1;z<=ch.length-1;z++)			// to trim spaces between words.
		{
			if((ch[z]==' ' && ch[z-1]!=' ' && ch[z-1]!='\t') || (ch[z]=='\t' && ch[z-1]!=' ' && ch[z-1]!='\t'))
			{ 	if(ch[z-1]==' ' || ch[z-1]=='\t')
					break; 
				for(int x=z;x<=ch.length-2;x++)
				{
					ch[x]=ch[x+1];
				}
				ch[ch.length-1]='\0';
			}		
		}	

		return new String(ch);
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		System.out.println("After Trim :"+allTrim(a));
	}

}