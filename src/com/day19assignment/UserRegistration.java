package com.day19assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static boolean validate(String pattern, String input) {
        return Pattern.compile(pattern).matcher(input).matches();
    }

    public static void main(String[] args) {
        System.out.println("User Registration System needs to ensure all validations are in place during the User Entry.");

        // UseCase-1 Valid first name
        String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
        System.out.println("Enter your first name:");
        String firstName = new Scanner(System.in).next();

        boolean isMatched = validate(firstNameRegex, firstName);
        if (isMatched)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");

        // UseCase-2 Valid last name
        String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
        System.out.println("Enter your last name:");
        String lastName = new Scanner(System.in).next();
        isMatched = validate(lastNameRegex, lastName);
        if (isMatched)
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");

        // UseCase-3 Valid email-ID
        String emailIDRegex = "^[a-zA-Z0-9]{3,}[.]?[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]{3,}([_+-.][a-zA-Z])*$";
        System.out.println("Enter your email-ID:");
        String emailID = new Scanner(System.in).next();
        isMatched = validate(emailIDRegex, emailID);
        if (isMatched)
            System.out.println("Valid email-ID");
        else
            System.out.println("Invalid email-ID");
    }
}
