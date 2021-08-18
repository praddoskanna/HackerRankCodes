import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String delim="[ !,?.\\_'@]+";
        if(s.trim().length() == 0)
            System.out.println("0"); 
        //return;
        else
        {
            String[] strarray=s.trim().split(delim,0);
            //String strarray[]=s.trim().split("[ !,?.\\_'@]+");
            System.out.println(strarray.length);
            for(String str:strarray)
            System.out.println(str);
            scan.close();
        }    
    }
}
