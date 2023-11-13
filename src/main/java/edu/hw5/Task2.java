package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class Task2 {

    private static final int THIRTEEN = 13;

    private Task2() {

    }

    @SuppressWarnings("MagicNumber")
    public static List<LocalDate> fridaysThirteen(int year) {
        LocalDate date = LocalDate.of(year, Month.JANUARY, 13);
        List<LocalDate> fridays = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                fridays.add(date);
            }
            date = date.plusMonths(1);
        }
        return fridays;
    }



    public static LocalDate closeFridayTriteen(@NotNull LocalDate date) {
        LocalDate nextFridayThirteen = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));

        while (nextFridayThirteen.getDayOfMonth() != THIRTEEN) {
            nextFridayThirteen = nextFridayThirteen.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        }

        return nextFridayThirteen;
    }
}
