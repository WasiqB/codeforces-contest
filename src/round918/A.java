package round918;

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
            final var a = IN.nextInt ();
            final var b = IN.nextInt ();
            final var c = IN.nextInt ();
            final int result;
            if ((a == b)) {
                result = c;
            } else {
                if (b == c)
                    result = a;
                else
                    result = b;
            }
            out.println (result);
        }
    }
}
