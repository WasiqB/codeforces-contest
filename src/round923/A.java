package round923;

import static java.lang.System.out;

import java.io.OutputStream;
import java.io.PrintWriter;
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
            final var s = IN.next ();
            var ans = 0;
            final var firstB = s.indexOf ('B');
            final var lastB = s.lastIndexOf ('B');
            if (firstB > -1) {
                ans = lastB - firstB + 1;
            }
            out.println (ans);
        }
    }
}
