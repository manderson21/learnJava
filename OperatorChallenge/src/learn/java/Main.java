package learn.java;

public class Main {

    public static void main(String[] args) {

        double value0 = 20.00;
        double value1 = 80.00;
        double expression = (value0 + value1) * 100;
        double remainder = expression % 40;
        boolean isRemainderZero = remainder == 0;
        System.out.println(isRemainderZero);

        if (isRemainderZero) System.out.println("No remainder here!");
        else System.out.println("Got some remainder");
    }
}
