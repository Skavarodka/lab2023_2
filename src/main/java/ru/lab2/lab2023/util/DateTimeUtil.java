package ru.lab2.lab2023.util;

import java.text.SimpleDateFormat;

public class DateTimeUtil {

    public static SimpleDateFormat getCustomFormat() {

        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:'Z'");
    }
}
