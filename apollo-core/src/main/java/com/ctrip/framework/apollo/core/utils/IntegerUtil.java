package com.ctrip.framework.apollo.core.utils;

public class IntegerUtil {
    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}
