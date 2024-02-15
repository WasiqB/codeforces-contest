package round926;

import static java.lang.System.out;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class A {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void solve (final PrintWriter out) {
        final var t = IN.nextInt ();
        for (var i = 0; i < t; i++) {
            final var n = IN.nextInt ();
            final var a = new ArrayList<Integer> ();
            for (var j = 0; j < n; j++) {
                a.add (IN.nextInt ());
            }
            final var sortedtA = a.stream ()
                .sorted ()
                .toList ();
            var ans = 0;
            for (var j = 1; j < n; j++) {
                ans += sortedtA.get (j) - sortedtA.get (j - 1);
            }
            out.println (ans);
        }
    }
}
