package org.example.portfolio.domain.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

@UtilityClass
public class CustomDateFormatter {

    public static String calculatePeriod(String startDate, String finishDate) {
        Long period = ChronoUnit.MONTHS.between(
                LocalDate.parse(startDate, getLocalDateTimeFormatter()),
                LocalDate.parse(finishDate, getLocalDateTimeFormatter())
        );
        return period + " months";
    }

    public static Long calculatePeriodDto(String startDate, String finishDate) {
        return ChronoUnit.MONTHS.between(
                LocalDate.parse(startDate, getCustomDateTimeFormatter()),
                LocalDate.parse(finishDate, getCustomDateTimeFormatter())
        );
    }

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
