package joban;

import java.util.Scanner;

public class joban1 {
public static void main(String args [])
{
	int  n,a=0,b=0 ,c=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("entr the fibonic series  limit");
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	
	{
		a=b;
	    b=c;
	    c=a+b;
	    System.out.println(c);
}
}
}