import java.io.*;
import java.util.*;

/*

 *****************DAY 6: StringsAdvance*****************
 
*/

public class Day_6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        char[] input;
        for (int i=0;i<testCases;i++)
        {
           input= sc.next().toCharArray();
            StringBuilder oddString=new StringBuilder();
            StringBuilder evenString = new StringBuilder();
            for (int j=0;j< input.length;j++)
            {
                if ((j&1)==0)
                {
                    evenString.append(input[j]);
                }
                else
                {
                    oddString.append(input[j]);
                }
            }
            System.out.println(evenString+" "+oddString);
        }
        sc.close();
    }
}