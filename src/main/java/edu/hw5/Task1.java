package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {

    private static final String PATTERN = "yyyy-MM-dd, HH:mm";
    private static final int TO_SECONDS = 1000;

    private Task1() {

    }

    public static String meanDuration(List<String> datas) {
        Long totalAmountOfSeconds = 0L;
        int count = 0;
        for (String s: datas) {
            String[] beginEnd = s.split(" - ");
            LocalDateTime begin = LocalDateTime.parse(beginEnd[0], DateTimeFormatter.ofPattern(PATTERN));
            LocalDateTime end = LocalDateTime.parse(beginEnd[1], DateTimeFormatter.ofPattern(PATTERN));
            Duration difference = Duration.between(begin, end);
            totalAmountOfSeconds += (difference.getSeconds());
            ++count;
        }
        Long meanValue = totalAmountOfSeconds / count * TO_SECONDS;
        final long hours = TimeUnit.MILLISECONDS.toHours(meanValue);
        final long minutes = TimeUnit.MILLISECONDS.toMinutes(meanValue - TimeUnit.HOURS.toMillis(hours));
        return String.format("%dч %dм", hours, minutes);

    }
}
