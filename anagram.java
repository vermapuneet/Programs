package firs;

import java.util.Arrays;
import java.util.Scanner;

public class main
{  static boolean isAnagram(String a, String b)
   {
       char[] arrstr1=(a.toLowerCase()).toCharArray();
       char[] arrstr2=(b.toLowerCase()).toCharArray();
       for(int i=0;i<a.length();i++)
       {
           System.out.println(arrstr1[i]);
       }
       System.out.println("hhhh");
       Arrays.sort(arrstr1);
       Arrays.sort(arrstr2);
       a=a.valueOf(arrstr1);
       b=String.valueOf(arrstr2);

       if (a.equals(b))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str1=in.next();
        str1=str1.toLowerCase();
        String str2=in.next();
        str2=str2.toLowerCase();
        boolean i=isAnagram(str1,str2);
        //String a=(if==true)?System.out.println("Anagrams"):System.out.println("Not Anagrams");
        System.out.println(i?"Anagrams" : "Not Anagrams");
        //System.out.println(s);

    }

}
