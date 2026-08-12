import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int intValue = in.nextInt();
        System.out.print("Enter a float value: ");
        float floatValue = in.nextFloat();
        System.out.print("Enter a double value: ");
        double doubleValue = in.nextDouble();
       
        System.out.println("\n--- Original Values ---");
        System.out.println("Integer : " + intValue);
        System.out.println("Float   : " + floatValue);
        System.out.println("Double  : " + doubleValue);

        float intToFloat = intValue;
        double intToDouble = intValue;
        double floatToDouble = floatValue;

        System.out.println("\n--- Implicit Type Casting (Widening) ---");
        System.out.println("int to float   : " + intValue + " -> " + intToFloat);
        System.out.println("int to double  : " + intValue + " -> " + intToDouble);
        System.out.println("float to double: " + floatValue + " -> " + floatToDouble);

        int floatToInt = (int) floatValue;
        int doubleToInt = (int) doubleValue;
        float doubleToFloat = (float) doubleValue;

        System.out.println("\n--- Explicit Type Casting (Narrowing) ---");
        System.out.println("float to int   : " + floatValue + " -> " + floatToInt);
        System.out.println("double to int  : " + doubleValue + " -> " + doubleToInt);
        System.out.println("double to float: " + doubleValue + " -> " + doubleToFloat);
        
    }
}