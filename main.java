package firs;

import java.util.Arrays;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {   Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        //System.out.println("1"+s);
        //s = s.replaceAll("  ", " ");
        String regex = "\\s+";
        s = s.replaceAll(regex, " ");
        s=s.trim();
        //System.out.println("spacr"+s);
        //System.out.println(s.length());
        //System.out.println(m.charAt(0));

        //System.out.println("string m "+s);
        //System.out.println("string m "+m);
        //System.out.println(m.length);
        //System.out.println("string m "+m[1]);
        /*for(String k:m)
        {
            System.out.println(k);
        }*/
        if(s.length()==0)
        {
            System.out.println("0");
        }
        else
        { String[] m=s.split(" ");
            System.out.println(m.length);
            for(int i=0;i<m.length;i++)
            {
                System.out.println(m[i]);
            }
        }
    }

}
