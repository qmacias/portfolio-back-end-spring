package org.example.portfolio.domain.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@UtilityClass
public class CustomDateFormatter {

    public static String formatInputString(String date) {
        return getCustomDateTimeFormatter().format(toLocalDate(date));
    }

    private static LocalDate toLocalDate(String date) {
        return LocalDate.parse(date, getLocalDateTimeFormatter());
    }

    private static DateTimeFormatter getLocalDateTimeFormatter() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    private static DateTimeFormatter getCustomDateTimeFormatter() {
        return DateTimeFormatter.ofPattern("MMM yyyy");
    }

}
