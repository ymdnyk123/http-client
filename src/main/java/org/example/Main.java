package org.example;

public class Main {

    public static void main(String[] args) {

        String TARGET_URL = "https://www.google.co.jp/";

        SimpleRequest simpleRequest = new SimpleRequest();

        simpleRequest.get(TARGET_URL);
    }
}