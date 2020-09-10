import java.util.Scanner;
import java.lang.Math;

public class introJAVA1_8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = (int)Math.sqrt(n);
        if (x * x == n) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}