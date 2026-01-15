package com.dmi.http;

public enum HttpMethod {
    GET, HEAD;

    public final static int MAX_LENGTH;

    static {
        int tempMaxLength = -1;
        for (HttpMethod method : values()) {
            if (method.name().length() > tempMaxLength) {
                tempMaxLength = method.name().length();
            }
        }

        MAX_LENGTH = tempMaxLength;
    }
}
