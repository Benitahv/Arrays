package Assignment;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=1;
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				if(i!=j) {
					if(a[i][j]==0)
					{
						flag=0;
						
					}
					else
					{
						break;
					}
				}
		}
		if(flag==1) {
			System.out.println("Yes");
			
		}
		else {
			System.out.println("No");
		}
		
		

	}

}
