public class Hello {

    public static void main(String[] args ) {
        System.out.println("Hello World!");

        int myFirstNumber = (5 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("This is my first number: " + myTotal);
        int myLastOne = 1_000 - myTotal;
        System.out.println("This is my last number: " + myLastOne);
    }
}
