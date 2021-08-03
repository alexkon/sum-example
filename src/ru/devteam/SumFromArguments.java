package ru.devteam;

public class SumFromArguments {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please use only two arguments");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;

            System.out.println(String.format("Sum: %s", sum));
        }
    }
}
