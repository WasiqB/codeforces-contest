package round918;

import static java.lang.System.out;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public final class B {
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
            var result = "";
            for (var j = 0; j < 3; j++) {
                final var l = IN.next ();
                final var isA = l.contains ("A");
                final var isB = l.contains ("B");
                final var isC = l.contains ("C");
                if (isA && isB && isC)
                    continue;
                if (!isA) {
                    result = "A";
                }
                if (!isB) {
                    result = "B";
                }
                if (!isC) {
                    result = "C";
                }
            }
            out.println (result);
        }
    }
}
