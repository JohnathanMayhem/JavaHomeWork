package edu.hw1;

public class Task3 {

    private Task3() {
    }

    private static long max(long[] arr) {
        long m = arr[0];
        for (long t : arr) {
            m = Math.max(t, m);
        }
        return m;
    }

    private static int max(int[] arr) {
        int m = arr[0];
        for (int t : arr) {
            m = Math.max(t, m);
        }
        return m;
    }

    private static double max(double[] arr) {
        double m = arr[0];
        for (double t : arr) {
            m = Math.max(t, m);
        }
        return m;
    }

    private static float max(float[] arr) {
        float m = arr[0];
        for (float t : arr) {
            m = Math.max(t, m);
        }
        return m;
    }

    private static long min(long[] arr) {
        long m = arr[0];
        for (long t : arr) {
            m = Math.min(t, m);
        }
        return m;
    }

    private static int min(int[] arr) {
        int m = arr[0];
        for (int t : arr) {
            m = Math.min(t, m);
        }
        return m;
    }

    private static double min(double[] arr) {
        double m = arr[0];
        for (double t : arr) {
            m = Math.min(t, m);
        }
        return m;
    }

    private static float min(float[] arr) {
        float m = arr[0];
        for (float t : arr) {
            m = Math.min(t, m);
        }
        return m;
    }

    public static boolean isNestable(int[] a, int[] b) {

        return (min(a) > min(b) && max(a) < max(b));
    }

    public static boolean isNestable(long[] a, long[] b) {

        return (min(a) > min(b) && max(a) < max(b));
    }

    public static boolean isNestable(double[] a, double[] b) {

        return (min(a) > min(b) && max(a) < max(b));
    }

    public static boolean isNestable(float[] a, float[] b) {

        return (min(a) > min(b) && max(a) < max(b));
    }
}
