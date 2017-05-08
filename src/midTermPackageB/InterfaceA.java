package midTermPackageB;

// 11. Create me a class called ClassA that uses inheritance with ClassB
//     and implements InferfaceA. (5 points)
//     a. Requirements: Add Constants to Interface (at least one)

public interface InterfaceA {
    final double PIE = 3.14159;
    final double E = 2.718;

    static void displayAdd(double pieAndE){
        System.out.println("Pie + e = " + pieAndE);
    }

    static void displayMult(double pieMultE){
        System.out.println("Pie * e = " + pieMultE);
    }
}
