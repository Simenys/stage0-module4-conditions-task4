package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(first > second && second > third ? "1. Greatest from 3": "1. Not greatest from 3");
    }
}

//Rewrite "1. Greatest from 3." from this task using ternary operator
