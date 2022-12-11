package org.example.portfolio.domain.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@UtilityClass
public class CustomDateFormatter {

    private DateTimeFormatter formatter = null;

    public static String formatInputString(String date, String from, String to) {
        return FormatterPatternSelector.CUSTOM_PATTERN.apply(from).format(toLocalDate(date, to));
    }

    private static LocalDate toLocalDate(String date, String format) {
        return LocalDate.parse(date, FormatterPatternSelector.LOCAL_PATTERN.apply(format));
    }

}
