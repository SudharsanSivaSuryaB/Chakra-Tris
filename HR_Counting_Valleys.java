import java.util.*;
import java.io.*;
import java.math.*;
public class HR_Counting_Valleys {
    public static void main(String[]args){


        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        String str=sc.next();
        String G = new String(str);

        int A=0,V=0;
        for(int i=0;i<a;i++){
            char ch=G.charAt(i);
            if(ch=='U'){
                A++;

                if(A==0){
                    V++;
                }
            }

            if(ch=='D')
                A--;

        }
        System.out.println(V);
    }
}
