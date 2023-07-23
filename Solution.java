import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner mn=new Scanner(System.in);
        
        int a = mn.nextInt();
        int[] a1= new int[a];
        for(int j=0;j<a;j++){
            a1[j]=mn.nextInt();
        }
        int c=0;
        for(int k=0;k<a;k++){
            int sum=0;
            
            for(int l=k;l<a;l++){
                sum=a1[l]+sum;
                if(sum<0){
                    c++;
                }
            }
            
        }
        System.out.println(c);    
        
   
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}