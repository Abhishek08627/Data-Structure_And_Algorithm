

// Reverse an Array

import java.util.*;
public class Reverse_Array 
{
	static void reverse(int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
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
		reverse(arr,0,size-1);
		System.out.println("After Reversing the Array : ");
		printArr(arr,size);
		
		sc.close();
	}
}
