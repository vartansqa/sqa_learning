
package sqa_learning1;

public class ExStringComparison {
 
 public static void main(String[] args) {
  
  String str = new String("abc"); //2.
  String test = "abc";   //3.
  String test1 = "abc";   //4.
  String test2 = new String("abc"); //5.
  
  System.out.println("Comparing references(memory address) of line2 and line3 : "+ (str == test));
        System.out.println("Comparing values of line2 and line3 : "+str.equals(test));
        
        System.out.println("Comparing references of line2 and line4 : "+ (test == test1));
        System.out.println("Comparing values of line2 and line4 : "+test.equals(test1));
        
        System.out.println("Comparing references of line2 and line5 : "+ (test == test2));
        System.out.println("Comparing values of line2 and line5 : "+test.equals(test2));
 
        System.out.println("Comparing references of line3 and line4 : "+ (test == test1));
        System.out.println("Comparing values of line3 and line4 : "+test.equals(test1));
  
        System.out.println("Comparing references of line4 and line5 : "+ (test1 == test2));
        System.out.println("Comparing values of line4 and line5 : "+test1.equals(test2));
  
 }



}
