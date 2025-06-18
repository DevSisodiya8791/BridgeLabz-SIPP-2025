import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double n = sc.nextDouble();
            if (n == 0) break;
            total += n;
        }
        System.out.println(total);
    }
}