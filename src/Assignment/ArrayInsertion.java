package Assignment;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,pos,x;
		n=sc.nextInt();
		int a[]=new int [n+1];
		System.out.println("Enter all the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position");
		pos=sc.nextInt();
		System.out.println("Enter the element want to insert");
		x=sc.nextInt();
		for(int i=(n-1);i>=(pos-1);i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("after inserting");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[n]);

	}

}
