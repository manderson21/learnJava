package learn.java;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MIN_VALUE;
        System.out.println("Float min value: "  + myMinFloatValue);
        System.out.println("Float max value: "  + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MIN_VALUE;
        System.out.println("Double min value: "  + myMinDoubleValue);
        System.out.println("Double max value: "  + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);


        double KILOGRAMS_PER_POUND = 0.45359237d;
        double pounds = 2d;
        double poundToKilogram = pounds * KILOGRAMS_PER_POUND;
        System.out.println(poundToKilogram);
    }
}
