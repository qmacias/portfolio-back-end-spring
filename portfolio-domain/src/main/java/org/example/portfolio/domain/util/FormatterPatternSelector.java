package org.example.portfolio.domain.util;

import java.util.function.Function;

import java.time.format.DateTimeFormatter;

public enum FormatterPatternSelector implements Function<String, DateTimeFormatter> {

    CUSTOM_PATTERN {
        @Override
        public DateTimeFormatter apply(String format) {
            return DateTimeFormatter.ofPattern(format); // custom spanish
        }
    },

    LOCAL_PATTERN {
        @Override
        public DateTimeFormatter apply(String format) {
            return DateTimeFormatter.ofPattern(format); // spanish local
        }
    }

}