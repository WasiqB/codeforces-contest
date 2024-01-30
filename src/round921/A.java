package round921;

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
            final var k = IN.nextInt ();
            final var resultString = new StringBuilder ();
            for (var j = 0; j < k; j++) {
                resultString.append (Character.toString ('a' + j));
            }
            final var ans = String.valueOf (resultString)
                .repeat (Math.max (0, n));
            out.println (ans);
        }
    }
}
