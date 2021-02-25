
// Why String are immutable in Java ?

// In java, String Object are immutable. Because java uses the concept of 
// string literal. Suppose There are five reference variables, all refers to one 
// object . If one reference variable changes the value of the object, it will be
// affected to all the reference variable.
// That is why string objects are immutable in java.

class Immutable
{
	public static void main(String ar[])
	{
		String str="Abhishek";
		str.concat("Rathore");
		
		System.out.println(str); //  will print "Abhishek" because string are immutable. 
		
	}
}


