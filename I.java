//squeeze

import java.util.Scanner;
class I
{
	public static String squeeze(String str)
	{
		char ch[]=str.toCharArray();
		for(int z=1;z<=ch.length-1;z++)
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
		System.out.println("After squeeze :"+squeeze(a));
	}

}