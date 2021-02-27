

// Cyclically rotate an array by One . 

import java.util.*;
public class rotate
{
	public static void rotate(int arr[])
	{
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
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
		
		
		rotate(arr);
		System.out.println("Rotated Array is : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
		// print Rotated array without for loop.
		
//		rotate(arr);
//		System.out.println("Rotated Array is : ");
//		System.out.println(Arrays.toString(arr));
		
		
		sc.close();
	}
}
