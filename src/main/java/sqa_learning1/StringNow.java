package sqa_learning1;

public class StringNow {
	
	public static void main(String args[]){

String str1 = "Test1";
String str2 = new String ("Test2");
String str3 = str1+str2;
String str4 = "Test1";

	
System.out.println("Comaring references of string1 and str2:  "+str1 ==str2);
System.out.println("Comaring values of string1 and str2:  "+str1.equals(str2));
System.out.println("Testing string pool for string1 and str4:  "+ (str1 == str4));
System.out.println("Testing value equality for str1 and str4:  "+ (str1 == str4));




  }
}
