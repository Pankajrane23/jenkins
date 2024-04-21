package auto;

import java.util.Scanner;

public class pa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num=1234;
//int rev=0;
//while(num>0)
//{
//	rev=rev*10+num%10;
//	num=num/10;
//}
//System.out.println(rev);
//		int a=9; int b=10;
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println(a+""+b);
//		int a[]= {10,20,40,60};
//		int search=20;
//		boolean flag=false;
//		for(int i=0;i<=a.length-1;i++)
//		{
//			if(search==a[i])
//			{
//				System.out.println(i);
//				flag=true;
//			}
//		}
//		if(flag==false)
//		{
//			System.out.println("not found");
//		}
//		String a="ABCD";
//		int p=a.length();
//		String rev="";
//		for (int i=p-1;i>=0;i--)
//		{
//			rev=rev+a.charAt(i);
//		}
//		System.out.println(rev);
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a string:");
//		String p=sc.next();
//		String s=p;
//		int o=s.length();
//		String rev=" ";
//		for(int i=o-1;i>=0;i--)
//		{
//			rev= rev+p.charAt(i)	;	
//		}
//		if(p.equals(rev))
//		{
//			System.out.println("palindrome");
//			
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int p=sc.nextInt();
//		int num=p;
//		
//	int rev=0;
//	while(num>0)
//	{
//		rev=rev*10+num%10;
//		num=num/10;
//	}
//		if(rev==p)
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//		int num=5;
//		long factorial=1;
//		for(int i=1;i<=5;i++)
//		{
//			factorial=factorial*i;
//			System.out.println(factorial);
//		int n1=0; int n2=1; int sum=0;
//		System.out.print(n1+" "+n2);
//		for(int i=2;i<10;i++)
//		{
//			sum=n1+n2;
//			System.out.print(" "+sum);
//			n1=n2;
//			n2=sum;
		//}
//		int num=1234;
//		int even=0;
//		int odd=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			if(rem%2==0)
//			{
//				even++;
//			}
//			if(rem%2!=0)
//			{
//			odd++;
//			}
//			num=num/10;
//		}
//		System.out.println(even);
//		System.out.println(odd);
//		
//		int a[]= {10,20,30};
//		int max=a[0];
//		for(int i=1;i<a.length-1;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//			
//		}
//		System.out.println(max);
		int a[]= {12,30,60};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
	}

}
