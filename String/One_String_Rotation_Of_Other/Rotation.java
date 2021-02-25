

// Check String are rotations of each-other or not. 

import java.util.*;
public class Rotation {
	static boolean areRotation(String str1,String str2)
	{
		return ((str1.length()==str2.length()) && ((str1+str1).indexOf(str2) != -1));
	}
	public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String st1= sc.next();
        System.out.println("Enter the String2 : ");
        String st2= sc.next();
        if(areRotation(st1,st2))
        {
        	System.out.println("Strings are rotations of each-other ");
        }
        else
        {
        	System.out.println("Strings are not rotations of each-other ");
        }
        
        sc.close();
    }
}
