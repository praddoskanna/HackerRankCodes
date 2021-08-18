import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length()!= b.length())
        return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        java.util.Map<Character,Integer> anag=new java.util.HashMap<>();
        for(int i=0;i<b.length();i++)// adding string to map
        {
            char letter=b.charAt(i);
            if(!anag.containsKey(letter))
            anag.put(letter,1);
            else
            {
                Integer frequency=anag.get(letter);
                anag.put(letter,++frequency);
            } 
        }
        //compare both string values
        for(int i=0;i<a.length();i++)
        {
            char letter=a.charAt(i);
            if(!anag.containsKey(letter))
            return false;
            Integer frequency=anag.get(letter);
            if(frequency == 0)
            return false;
            else
            anag.put(letter,--frequency);
            
        }
        return true;
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
