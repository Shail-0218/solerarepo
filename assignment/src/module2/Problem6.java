package module2;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Value of row of array 1");
		int m=sc.nextInt();
		System.out.println("Value of column of array 1");
		int n=sc.nextInt();
		int[][] arr = new int[m][n];
        System.out.println(" int array1 element:");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Value of row of array2");
		int a=sc.nextInt();
		System.out.println("Value of column of array2");
		int b=sc.nextInt();
		if(m==a && n==b) {
		int[][] arr2 = new int[a][b];
        System.out.println(" int array2 element:");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		arr2[i][j]=sc.nextInt();
        	}
        }
        int arr3[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		arr3[i][j]=arr[i][j]+arr2[i][j];
        		System.out.println(arr3[i][j]);
        	}
        }
		}
		else
		{
			System.out.println("both array have different dimension so adding is not possible.");
		}

	}

}
