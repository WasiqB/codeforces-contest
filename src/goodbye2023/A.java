package goodbye2023;

import static java.lang.String.join;
import static java.lang.System.out;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public final class A {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static boolean is2023 (final int[] b, final String[] a) {
        final var target = 2023;
        var totalProductB = 1L;
        for (final int j : b) {
            totalProductB *= j;
        }
        final var result = target % totalProductB == 0;
        if (result) {
            for (int i = 0; i < a.length; i++) {
                if (i == a.length - 1) {
                    a[i] = Long.toString (target / totalProductB);
                    continue;
                }
                a[i] = Integer.toString (1);
            }
        }
        return result;
    }

    private static void solve (final PrintWriter out) {
        final var t = IN.nextInt ();
        for (var i = 0; i < t; i++) {
            final var n = IN.nextInt ();
            final var k = IN.nextInt ();
            final var b = new int[n];
            for (var j = 0; j < n; j++) {
                b[j] = IN.nextInt ();
            }
            final var a = new String[k];
            final var result = is2023 (b, a);
            out.println (result ? "YES" : "NO");
            if (result) {
                out.println (join (" ", a));
            }
        }
    }
}