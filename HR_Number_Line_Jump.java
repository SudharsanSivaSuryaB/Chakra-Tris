import java.util.*;
public class HR_Number_Line_Jump {
    public static void main(String[]args) {
        int a, b, x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        a = sc.nextInt();
        y = sc.nextInt();
        b = sc.nextInt();

        for (x = 0, y = 0; x < 10000 && y < 10000; x++, y++) {
            for (a = 1, b = 1; a < 10000 && b < 10000; a++, b++) {
                if (x > y) {

                    if (a < b) {
                        x += a;
                        y += b;
                        if (x == y) {
                            System.out.println("pp");
                        } else {
                            if (x > y) {
                                System.out.println("gg");
                            }
                        }
                    }
                }
                else{
                    System.out.println("yy");
                }
            }

        }
        for(x=0,y=0;x<10000&y<10000;x++,y++) {
            for (a = 1, b = 1; a < 10000 && b < 10000; a++, b++) {
                if(x<y){

                            if (a > b) {
                                x += a;
                                y += b;
                                if (x == y) {
                                    System.out.println("rr");
                                } else {
                                    if (x < y) {
                                        System.out.println("tt");
                                    }
                                }
                            }
                        }
                else{
                    System.out.println("ee");
                }
                    }
                }


            }

        }


