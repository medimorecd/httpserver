package com.dmi.httpserver.config;

public class HttpConfigrationException extends RuntimeException {

    public HttpConfigrationException() {
    }

    public HttpConfigrationException(String message) {
        super(message);
    }

    public HttpConfigrationException(Throwable cause) {
        super(cause);
    }

    public HttpConfigrationException(String message, Throwable cause) {
        super(message, cause);
    }

}
