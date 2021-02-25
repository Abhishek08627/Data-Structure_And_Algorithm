

// Reverse the String.

import java.util.Scanner;
class Reverse_String
{
    // Using StringBuffer Method.

//        public static void main(String ar[])
//    	  {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String : ");
//        String st= sc.nextLine();
//        StringBuffer sb=new StringBuffer(st);
//        System.out.println(sb.reverse());
//		  sc.close();
//    	  }

    // Using CharAt Method.

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st= sc.nextLine();
        String str="";
        for(int i=st.length()-1; i>=0 ;i--)
        {
            str = str+st.charAt(i);
        }
        System.out.println(str);
        
        sc.close();
    }
}