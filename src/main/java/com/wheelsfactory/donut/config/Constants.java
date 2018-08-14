package com.wheelsfactory.donut.config;

public class Constants {

    public static final int RESPONSE_SUCCESS = 0;

    public static final int RESPONSE_EMPTY_RESULT = 1;

    private static Constants ourInstance = new Constants();

    public static Constants getInstance() {
        return ourInstance;
    }

    private Constants() {
    }
}
