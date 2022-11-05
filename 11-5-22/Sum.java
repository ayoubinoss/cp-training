import java.io.PrintStream;
import java.util.Scanner;

public class Sum {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);
        solve(scanner, printStream);
    }

    private static void solve(Scanner in, PrintStream out) {
        int t;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            boolean isSum = a == b + c || b == a + c || c == b + a;
            out.println(!isSum ? "NO" : "YES");
        }
    }
}
