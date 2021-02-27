

// Kth Smallest/Largest Element in Unsorted Array.

import java.util.*;
public class KthSmallest 
{
	public static int kthSmallest(int arr[],int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
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
		System.out.println("Enter the value of K : ");
		int k=sc.nextInt();
		System.out.println(k+" Smallest/Largest Element is : " + kthSmallest(arr,k));
		
		
		sc.close();
	}
}


//  Time Complexity = O(nlogn)
//  Space Complexity = O(n)




//