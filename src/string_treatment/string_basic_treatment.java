package string_treatment;
import java.io.*;
import java.util.*;	

public class string_basic_treatment {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+ B.length());
        int is_lex = A.compareToIgnoreCase(B);
        if (is_lex < 0){
            System.out.println("No");
        } else{
            System.out.println("Yes");
        }
        System.out.print(A.substring(0,1).toUpperCase()+ A.substring(1) + " ");
        System.out.print(B.substring(0,1).toUpperCase() + B.substring(1));
        
    }
}


//input:
//	hello
//	java
//expected output:
//	9
//	No
//	Hello Java