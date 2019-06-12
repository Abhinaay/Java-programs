//SortedWord

import java.util.Scanner;
class Q
{
	public static void sortedWord(String[] str1)
	{	
		String temp=new String();
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].compareTo(str1[j])>0)
				{
					temp=str1[i];
					str1[i]=str1[j];
					str1[j]=temp;
				}	
			}
		}
	
		System.out.println("AFTER SORTING");

		for(int i=0;i<str1.length;i++)
		{	
			System.out.println(str1[i]);
		}	
		
	
		
					
				
	}

	public static void main(String... args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of words in String :");
		int n=sc.nextInt();
		String s1[]=new String[n+1];
		System.out.print("Enter all Words :");
		for(int i=0;i<=n;i++)
		{
			s1[i]=sc.nextLine();
		}
		

		sortedWord(s1);
	}

}