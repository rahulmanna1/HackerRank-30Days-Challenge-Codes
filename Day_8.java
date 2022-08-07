import java.io.*;
import java.util.*;
public class Day_8 {

    public static void main(String[] args) {
        Map<String,Integer> phoneBook = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//number of entries in the phonebook
        for (int i=0;i<n;i++) {
                String name = sc.next();
               int phoneNumber = sc.nextInt();
                phoneBook.put(name,phoneNumber);
        }
        String S1=new String();
        while (sc.hasNext())
        {
            String s= sc.next();
            if(phoneBook.get(s)!=null)
            {
                System.out.println(s+"="+phoneBook.get(s));
            }
            else {
                System.out.println("Not found");
            }
    // System.out.println((phoneBook.get(s)!=null)?s+"="+phoneBook.get(s):"Not found");
        }
    }
}