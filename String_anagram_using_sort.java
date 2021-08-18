import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the functio
        
     char[]str1=a.toLowerCase().toCharArray();
     char[]str2=b.toLowerCase().toCharArray();
     java.util.Arrays.sort(str1);
     java.util.Arrays.sort(str2);
     boolean flag=java.util.Arrays.equals(str1,str2);
     if(flag)
     return true;
     else 
     return false;   
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
