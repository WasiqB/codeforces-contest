package round920;

import static java.lang.System.out;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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
            final Map<Integer, int[]> coords = new HashMap<> ();
            for (var j = 0; j < 4; j++) {
                final var x = IN.nextInt ();
                final var y = IN.nextInt ();
                if (coords.containsKey (x)) {
                    final var newY = coords.get (x);
                    newY[1] = y;
                    coords.put (x, newY);
                } else {
                    coords.put (x, new int[] { y, 0 });
                }
            }
            var ans = 1;
            for (final var coord : coords.entrySet ()) {
                final var value = coord.getValue ();
                ans *= Math.abs (value[0] - value[1]);
            }
            out.println (ans);
        }
    }
}
