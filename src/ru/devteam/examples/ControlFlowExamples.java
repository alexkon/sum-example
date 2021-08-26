package ru.devteam.examples;

import java.util.Scanner;

public class ControlFlowExamples {

    private static void forEachLoopExample() {
        String[] names = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");

        // classic for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("" + (i + 1) + ") " + names[i]);
        }


        // for each loop
        for (String element: names) {
            System.out.println(element);
        }

//        // Infinite loop example: be careful with that
//        while (true) {
//            System.out.print("Hello");
//        }

    }

    private static void ifStatementExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");

        int age =  Integer.parseInt(scanner.nextLine());
        System.out.println("Your age: " + age);

        if (age > 18) {
            System.out.println("show adult content");
        } else {
            System.out.println("Sorry, you're too young for that");
        }
    }

    private static void switchCaseStatementExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter semaphore light:");

        String light =  scanner.nextLine();
        switch (light) {
            case "Green":
                System.out.println("You may go...");
                break;
            case "Red":
                System.out.println("Stop and wait...");
                break;
            case "Yellow":
                System.out.println("Please wail a little bit...");
                break;
            default:
                System.out.println(String.format("I don't know color: %s", light));
                break;
        }
    }

    public static void main(String[] args) {
        forEachLoopExample();
    }
}
