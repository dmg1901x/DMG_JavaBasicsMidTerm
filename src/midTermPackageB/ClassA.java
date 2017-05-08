package midTermPackageB;

// 11. Create me a class called ClassA that uses inheritance with ClassB
//     and implements InferfaceA. (5 points)
//     a. Requirements: Add Constants to Interface (at least one)

public class ClassA extends ClassB implements InterfaceA{
    public static void main(String[] args) {
        double pieAndE = resultAdd(PIE, E);
        InterfaceA.displayAdd(pieAndE);

        double pieTimesE = resultMult(PIE, E);
        InterfaceA.displayMult(pieTimesE);
    }
}
