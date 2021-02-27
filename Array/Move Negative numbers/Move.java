

//  Move all Negative numbers to beginning and positive to end with constant space.

import java.util.*;
public class Move 
{
	static void arrange(int arr[],int size)
	{
		int j=0;
		int temp;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			j++;
			}
		}
	}
	static void printArr(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
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
		arrange(arr,size);
		System.out.println("Array after seggregation : ");
		printArr(arr,size);
		
		sc.close();
	}
	
}
