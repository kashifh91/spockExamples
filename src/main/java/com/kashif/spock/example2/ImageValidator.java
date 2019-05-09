package com.kashif.spock.example2;

public class ImageValidator {
    public static boolean validate(String fileName) {

        String words[] = fileName.split("\\.");
        String format = words[words.length - 1];
        if (format.equalsIgnoreCase("jpg") ||
                format.equalsIgnoreCase("jpeg") ||
                format.equalsIgnoreCase("png")) {
            return true;
        }
        return false;
    }
}
