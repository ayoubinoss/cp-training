import java.io.*;
import java.util.*;

/** https://codeforces.com/problemset/problem/1744/A **/
public class Password {

    static InputReader in = new InputReader(System.in);

    public static void main(String[] args) {

        PrintStream printStream = new PrintStream(System.out);
        solve(printStream);
    }

    private static void solve(PrintStream out) {
        int t;
        t = in.nextInt();
        for (int j = 0; j < t; j++) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            String s = in.next();

            Map<Integer, HashSet<Character>> m = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                HashSet<Character> cur = m.getOrDefault(a[i], new HashSet<>());
                cur.add(s.charAt(i));
                m.put(a[i], cur);
            }
            for (int i = 0; i < s.length(); i++) {
                if (m.get(a[i]).size() > 1) {
                    out.println("NO");
                    return;
                }
            }

            out.println("YES");
        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 2048);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextLong();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextLong();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
