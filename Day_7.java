import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Day_7 {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Size of an array");
        int n= sc.nextInt();
        int[] array=new int[n];
       // System.out.println("Array contents input");
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
       // System.out.println("Array contents output");
        for (int i=array.length-1;i>=0;i--)
        {
            int item=array[i];
            System.out.print(item+" ");
        }
    }
}