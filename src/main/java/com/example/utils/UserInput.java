package com.example.utils;

import java.util.Scanner;

public class UserInput {
    public static String askForname() {
        System.out.println("Enter your name, wizard ! ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
