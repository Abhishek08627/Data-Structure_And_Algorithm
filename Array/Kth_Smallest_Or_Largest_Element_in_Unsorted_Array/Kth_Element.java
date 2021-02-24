
//  Kth Smallest/Largest Element in Unsorted Array.

import java.util.*;
public class Kth_Element {
	public static int Kth(int arr[],int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size=sc.nextInt();
		System.out.println("Enter the elements of Array : ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of K : ");
		int K=sc.nextInt();
		System.out.println("Kth Smallest/Largest Elements is "+ Kth(arr,K));
		
		sc.close();
	}
}
