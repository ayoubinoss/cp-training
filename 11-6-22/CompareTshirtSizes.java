import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CompareTshirtSizes {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);
        solve(scanner, printStream);
    }

    private static void solve(Scanner in, PrintStream out) {
        int t;
        t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            String s1, s2;
            String line = in.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            s1 = stringTokenizer.nextToken();
            s2 = stringTokenizer.nextToken();
            //s < m < l
            char last1 = s1.charAt(s1.length() - 1);
            char last2 = s2.charAt(s2.length() - 1);
            if (last1 == last2) {
                if (s1.length() == s2.length()) {
                    out.println("=");
                } else {
                    if (last1 == 'S') {
                        out.println(s1.length() > s2.length() ? "<" : ">");
                    } else {
                        out.println(s1.length() > s2.length() ? ">" : "<");
                    }
                }
            } else if (last1 == 'S') {
                out.println("<");
            } else if (last1 == 'L') {
                out.println(">");
            } else {
                if (last2 == 'S') {
                    out.println(">");
                } else {
                    out.println("<");
                }
            }
        }
    }
}
