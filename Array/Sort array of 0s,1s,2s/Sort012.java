

// Sort an array of 0s,1s,2s.

import java.util.*;
public class Sort012 
{
	public static void sort(int arr[], int size)
	{
		int low=0;
		int high=size-1;
		int mid=0;
		int temp=0;
		while(mid<=high)
		{
			switch(arr[mid])
			{
				case 0:
				{
					temp=arr[low];
					arr[low]=arr[mid];
					arr[mid]=temp;
					low++;
					mid++;
					break;
				}
				case 1 :
				{
					mid++;
					break;
				}
				case 2:
				{
					temp=arr[mid];
					arr[mid]=arr[high];
					arr[high]=temp;
					high--;
					break;
				}
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
		sort(arr,size);
		System.out.println("Array after seggregation : ");
		printArr(arr,size);
		
		sc.close();
	}
}
