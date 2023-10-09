package edu.hw1;

public class Task1 {

    private Task1() {
    }

    @SuppressWarnings("MagicNumber")
    public static int minutesToSeconds(String time) {
        int res = 1;
        String[] timeArr = time.split(":");
        int[] times = new int[] {0, -1};
        int i = 0;
        for (String temp : timeArr) {
            if (i > 1 || time.isEmpty()) {
                res = -1;
                break;
            }
            times[i] = Integer.parseInt(temp);
            ++i;
        }
        res = (res != -1 && times[1] < 60 && times[1] >= 0 && times[0] >= 0) ? times[0] * 60 + times[1] : -1;

        return res;
    }
}
