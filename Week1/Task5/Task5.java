public class Task5 {
    public static void main(String[] args) {
        int num = 100;
        double implicitValue = num;

        System.out.println("Implicit Type Casting:");
        System.out.println("Before Casting (int): " + num);
        System.out.println("After Casting (double): " + implicitValue);

        System.out.println();

        double decimalNum = 99.99;
        int explicitValue = (int) decimalNum;

        System.out.println("Explicit Type Casting:");
        System.out.println("Before Casting (double): " + decimalNum);
        System.out.println("After Casting (int): " + explicitValue);
    }
}