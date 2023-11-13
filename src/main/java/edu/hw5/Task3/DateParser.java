package edu.hw5.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class DateParser {
    private static final DateTimeFormatter[] DATE_FORMATTERS = {
        DateTimeFormatter.ofPattern("yyyy-MM-dd"),
        DateTimeFormatter.ofPattern("yyyy-MM-d"),
        DateTimeFormatter.ofPattern("yyyy-M-dd"),
        DateTimeFormatter.ofPattern("yyyy-M-d"),
        DateTimeFormatter.ofPattern("d/M/yyyy"),
        DateTimeFormatter.ofPattern("d/M/yy"),
        DateTimeFormatter.ofPattern("MM/d/yyyy"),
        DateTimeFormatter.ofPattern("M/d/yyyy"),
        /*DateTimeFormatter.ofPattern("tomorrow"),
        DateTimeFormatter.ofPattern("today"),
        DateTimeFormatter.ofPattern("yesterday"),
        DateTimeFormatter.ofPattern("d 'day ago'"),
        DateTimeFormatter.ofPattern("d 'days ago'")*/
    };

    private DateTimeFormatter currentFormatter;
    private DateParser nextParser;

    public DateParser(DateTimeFormatter formatter, DateParser nextParser) {
        this.currentFormatter = formatter;
        this.nextParser = nextParser;
    }

    public Optional<LocalDate> parseDate(String string) {
        try {
            LocalDate date = LocalDate.parse(string, currentFormatter);
            return Optional.of(date);
        } catch (Exception e) {
            if (nextParser != null) {
                return nextParser.parseDate(string);
            }
            return Optional.empty();
        }
    }

    public static Optional<LocalDate> parseDateString(String string) {
        DateParser parser = createParserChain();
        return parser.parseDate(string);
    }

    private static DateParser createParserChain() {
        DateParser chain = new DateParser(DATE_FORMATTERS[0], null);
        DateParser currentParser = chain;

        for (int i = 1; i < DATE_FORMATTERS.length; i++) {
            DateParser nextParser = new DateParser(DATE_FORMATTERS[i], null);
            currentParser.nextParser = nextParser;
            currentParser = nextParser;
        }

        return chain;
    }
}
