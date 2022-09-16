import java.util.Scanner;


import java.util.*;
public class HR_Divisible_Sum_Pairs {

    public static void main(String[] args) {


        long sum = 0, b, u;
        int count=0;
        int n;

        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();
        b = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                int e=i+j;

                if(e%b==0){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}