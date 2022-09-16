
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class HR_Save_The_Prisoner{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rounds = input.nextInt();
        for(int i = 0; i < rounds; i++)
        {
            int num = input.nextInt();
            int candy = input.nextInt();
            int seat= input.nextInt() - 1;
            while(candy != 0)
            {
                candy--;
                seat++;
                if(seat > num) {
                    seat = 1;
                }
            }
            System.out.println(seat);
        }
    }
}


