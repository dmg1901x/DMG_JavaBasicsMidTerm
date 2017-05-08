package midTermPackageC;

// 12. Create a method that returns the division of two numbers.
//     Implements try/catch for the ArithmeticException. (5 points)
//     a. Requirements: both numbers have to be passed as arguments

public class ClassQ12Main {
    static int value1 = 555;
    static int value2 = -333;

    public static void main(String[] args) {
        double divResult = divisionResult(value1, value2);
        System.out.println("The result of " + value1 + " divided by " + value2 + " is: " + divResult);
    }

    static double divisionResult(int v1, int v2){
        double divResult = 0;
        try {
            divResult = (double)v1 / (double)v2;
        }
        catch (ArithmeticException ae){
            System.out.println("An Arithmetic Exception has resulted " + ae.getMessage());
        }
        return divResult;
    }
}
