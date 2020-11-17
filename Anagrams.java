//https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Boolean isAnagram = false;
   if(a != null && b != null) {
       char [] arrA = a.toLowerCase().toCharArray();
       char [] arrB = b.toLowerCase().toCharArray();
       java.util.Arrays.sort(arrA);
       java.util.Arrays.sort(arrB);
       isAnagram = java.util.Arrays.equals(arrA, arrB);
   }
   return isAnagram;

        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
