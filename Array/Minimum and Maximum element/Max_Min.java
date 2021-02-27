

//  Minimum and Maximum element in an array using minimum Comparisons.

import java.util.*;
public class Max_Min 
{
	public static void find(int arr[])
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
		System.out.println("Maximum element is "+max);
		System.out.println("Minimum element is "+min);
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of Array : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		find(arr);
		
		sc.close();
	}
}
