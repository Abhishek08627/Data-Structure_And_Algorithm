

// Largest Sum Contiguous Subarray problem.

//      or

//  Kadane's Algorithm

import java.util.*;
public class Kadane 
{
	public static int maxSubArray(int arr[])
	{
		int max_so_far=0;
		int max_ending_here=0;
		for(int i=0;i<arr.length;i++)
		{
			max_ending_here=max_ending_here+arr[i];
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
			if(max_so_far < max_ending_here)
			{
				max_so_far=max_ending_here;
			}
		}
	return max_so_far;
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
		System.out.println(maxSubArray(arr));
		
		sc.close();
	}
}
