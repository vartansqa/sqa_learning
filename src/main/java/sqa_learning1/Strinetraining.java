package sqa_learning1;

public class Strinetraining {

	public static void main(String args[]){
		String str1 = "Soccer";
		String str2 = "Football";
		String str3 = "Cricket";
		
		
		int length = str2.length();
		System.out.println("lenght of srt1 is :"+length);
		
		
		// Compare 1 with 2, 1 with 3 and 2 with 3 for equality and memory address.
		
		System.out.println("Comaring references of string1 and str2:  "+(str1 ==str2));
		System.out.println("Comaring references of string1 and str3:  "+(str1 ==str3));
		System.out.println("Comaring references of string1 and str3:  "+(str2 ==str3));
		
		//Print out the total characters in 2.
		System.out.println("Print out the total characters in str2): "+str2.substring(0,8));
		
		System.out.println("Print second last character  str3: "+str3.substring(5,6));
		
		System.out.println("Print second last character  str3: "+str3.substring(6,7));
		System.out.println("Print the position of first “c”  str1: "+str1.indexOf("c"));
		
		
	
		
				
		}
}
