

//  Union and Intersection of two unsorted Array.  

import java.util.*;
public class Union_Intersection 
{
	public static void printUnion(int arr1[],int arr2[])
	{
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			hs.add(arr2[i]);
		}
		System.out.println(hs);
	}
	public static void printIntersection(int arr1[],int arr2[])
	{
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(hs.contains(arr2[i]))
			{
				System.out.print(arr2[i]+" ");
			}
		}
		
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array1 : ");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter the elements of Array1 : ");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of Array2 : ");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter the elements of Array2 : ");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		printUnion(arr1,arr2);
		printIntersection(arr1,arr2);
		
		
		sc.close();
	}
}



//  Time Complexity = O(m+n)



//



