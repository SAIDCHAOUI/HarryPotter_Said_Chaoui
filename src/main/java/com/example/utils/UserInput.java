package com.example.utils;

import java.util.Scanner;

public class UserInput {
    private static final UserInput instance = new UserInput();

    private final Scanner scanner = new Scanner(System.in);

    public static UserInput getInstance()
    {
        return instance;
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        return scanner.nextInt();
    }

}
