import java.io.PrintStream;
import java.util.Scanner;

public class MaxMina {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);
        solve(scanner, printStream);
    }

    private static void solve(Scanner in, PrintStream out) {
        int t;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt(), k = in.nextInt();
            int[] a = new int[n + 1];
            boolean containsOne = false;
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
                if (a[j] == 1) {
                    containsOne = true;
                }
            }
            System.out.println(!containsOne ? "NO" : "YES");
        }
    }
}
