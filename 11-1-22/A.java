import java.io.PrintStream;
import java.util.Scanner;

/** https://codeforces.com/contest/1754/problem/A */
public class A {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);
        solve(scanner, printStream);
    }

    private static void solve(Scanner in, PrintStream out) {
        int t;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            String s = in.next();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'Q') {
                    ++count;
                } else {
                    count = Math.max(0, count -1);
                }
            }

            out.println(count <= 0 ? "Yes" : "No");
        }
    }
}
