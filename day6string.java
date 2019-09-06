import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        
        for (int i=1;i<=T+1;i++){
            String s=scanner.nextLine();
            String s1="",s2="";

            char[] myCharArray=s.toCharArray();
            
            for (int j=0;j<s.length();j++){
                if (j%2==0){
                    s1 += myCharArray[j];
                }
                else{
                    s2 += myCharArray[j];
                }
            }
            System.out.println(s1+" "+s2);

            
        }
    }
}

