package com.samples.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// exit with cntrl + D
public class BufferedReaderEx {

    // https://stackoverflow.com/questions/13405822/using-bufferedreader-readline-in-a-while-loop-properly
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (null != (line = reader.readLine())) {
            System.out.println(line);
        }
    }
}
