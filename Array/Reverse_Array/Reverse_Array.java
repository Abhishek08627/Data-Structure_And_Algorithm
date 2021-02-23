//Program to Reverse an Array

import java.util.*;
public class Reverse_Array {
	static void reversearray(int arr[],int start,int end)
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
	static void printArray(int arr[],int size)
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
		System.out.println("Enter Number of Element in Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter Elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		reversearray(arr,0,arr.length-1);
		System.out.print("Reverse array is\n");
		printArray(arr,arr.length);

		sc.close();
	}
}