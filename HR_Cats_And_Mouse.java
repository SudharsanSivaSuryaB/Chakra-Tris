import java.util.*;
public class HR_Cats_And_Mouse {
    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int dist = Math.abs(x-z);
            int dist2 = Math.abs(y-z);
            if (dist < dist2) {
                System.out.println("Cat A");
            }
            else if (dist > dist2){
                System.out.println("Cat B");
            }
            else {
                System.out.println("Mouse C");
            }
        }


    }
}
