import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_Breaking_Records {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }

        int most = score[0];
        int least = score[0];
        int mr = 0;
        int lr = 0;
        for( int i = 1; i < n; i++ ){
            if( score[i] > most ){
                mr++;
                most = score[i];
            }
            if( score[i] < least ){
                lr++;
                least = score[i];
            }
        }

        System.out.print(mr + " " + lr);
    }
}
