package joban;

import java.util.Scanner;

public class trio {
public static void main(String args [])
{
	int  a=0,b=1,c=2,d,n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("entr the limit of series");
	n=sc.nextInt();
	System.out.println(+a + "\n");
	for( i=1;i<=n-3;i++)
	
	{
		d=a+b+c;
		System.out.println(+d);
		a=b;
		
	    b=c;
	    c=d;
	    
}
}}