package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int answer = (first >= second) ? ((first >= third) ? first : third) : ((second >= third) ? second : third);
        System.out.println(answer);
    }
}



//    Implement the program that will consume 3 numbers from method arguments and it will print the print greatest out of three.
//    In case if there are more than 1 biggest -> print any of them.(Libraries are forbidden)
