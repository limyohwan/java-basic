package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        return Arrays.stream(values).sum();
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        return Arrays.stream(values).min().orElse(0);
    }
    public static int max(int[] values) {
        return Arrays.stream(values).max().orElse(0);
    }

}
