import java.util.Scanner;

public class Upper_Case_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int uppercase=0;
        int v = str.length();
        for(int i=0;i<v;i++){
            char ch = str.charAt(i);
            if(ch>'A'&&ch<'Z'){
                uppercase++;
            }

        }
        System.out.println(uppercase);
    }
}
