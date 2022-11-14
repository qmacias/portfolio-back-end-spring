package org.example.portfolio.domain.exception;

public class ConflictException extends RuntimeException {

    private static final long serialVersionUID = 8531722550005549258L;

    private static final String DESCRIPTION = "Conflict Exception (409)";

    public ConflictException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

}