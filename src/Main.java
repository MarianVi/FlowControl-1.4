import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int x = scanner.nextInt();
        int reverse = 0;
        while (x != 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        System.out.println(reverse);
    }
}