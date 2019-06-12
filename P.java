//SortedOrder

import java.util.Scanner;
class P
{
	public static String sortedOrder(String str)
	{	char temp;
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-2;i++)
		{	
			for(int j=i+1;j<=ch.length-1;j++)
			{	
				if(ch[j]<ch[i])
				{	temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}		
		}		

		return new String(ch);
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String a=sc.nextLine();
		
		System.out.println("After sorting :"+sortedOrder(a));
	}

}