package com.samples.console;

public class ConsoleEx {
    public static void main(String[] args) {
       // https://stackoverflow.com/questions/13894892/primitive-boolean-to-string-concatenation-conversion#13894939
        System.out.println("Do I have a console? " + (System.console() != null));
        String text = "init";
        while (System.console() != null && !text.isEmpty()) {
            text = System.console().readLine();
            System.out.println(text);
        }
    }
}
