import java.io.PrintStream;
import java.util.Scanner;

public class CowardlyRooks {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);
        solve(scanner, printStream);
    }

    private static void solve(Scanner in, PrintStream out) {
        int t;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] pos = new int[n + 5][2];
            for (int j = 0; j < m; j++) {
                pos[j][0] = in.nextInt();
                pos[j][1] = in.nextInt();
            }
            System.out.println(m == n ? "NO" : "YES");
        }
    }
}
