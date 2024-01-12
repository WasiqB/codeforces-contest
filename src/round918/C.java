package round918;

import static java.lang.Math.sqrt;
import static java.lang.System.out;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public final class C {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static boolean isSquare (final long x) {
        if (x >= 0) {
            final long root = (long) sqrt (x);

            return ((root * root) == x);
        }
        return false;
    }

    private static void solve (final PrintWriter out) {
        final var t = IN.nextInt ();
        for (var i = 0; i < t; i++) {
            final var n = IN.nextInt ();
            var sumA = 0L;
            for (var j = 0; j < n; j++) {
                sumA += IN.nextLong ();
            }
            out.println (isSquare (sumA) ? "YES" : "NO");
        }
    }
}
