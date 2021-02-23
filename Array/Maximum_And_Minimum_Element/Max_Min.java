
// Minimum and Maximum elements in an array using minimum comparisons.

import java.util.*;
public class Max_Min {
	public static void findMinandMax(int arr[])
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum is "+max);
		System.out.println("Minimum is "+min);
	}
	public static void main(String sr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements of Array ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		findMinandMax(arr);
		
		sc.close();
	}
}
