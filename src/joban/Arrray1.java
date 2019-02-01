package joban;

import java.util.Scanner;

public class Arrray1 {
	public static void main(String []args){
	int[] arr=new int[10];
	int i,max;
	Scanner s=new Scanner(System.in);
 System.out.println("enter 10 number");
 for(i=0;i<arr.length;i++)
 {
 	arr[i]=s.nextInt();
 }
max=arr[0];
for(i=0;i<arr.length;i++)
{ if (arr [i]>max)
{
	max=arr[i];
}
}
System.out.println(max);
}
}     