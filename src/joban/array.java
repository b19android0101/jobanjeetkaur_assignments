package joban;

import java.util.Scanner;

public class array {
public static void main(String []args){
int[] arr=new int[10];
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
for(i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
}
	System.out.println("array is");
	for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
}
}
}