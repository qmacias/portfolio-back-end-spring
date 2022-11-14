package org.example.portfolio.domain.exception;

public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3386657746826010748L;

    private static final String DESCRIPTION = "Not Found Exception (404)";

    public NotFoundException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

}