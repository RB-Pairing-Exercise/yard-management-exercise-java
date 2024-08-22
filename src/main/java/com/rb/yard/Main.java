package com.rb.yard;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String content = FileUtils.readFileToString(new File(fileName), Charset.defaultCharset());
        System.out.println(doSomething(content));
    }

    public static String doSomething(String input) {
        return "Hello %s".formatted(StringUtils.capitalize(input));
    }
}
