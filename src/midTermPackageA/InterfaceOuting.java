package midTermPackageA;

// 10. Create me an Interface that has one of each:
//          1 abstract method,
//          1 default method and
//          1 static method (10 points)
//     a. Requirements: Static method must be called from default method

interface InterfaceOuting {
    abstract String movingActivity();
    abstract String climbingActivity();

    default void restingActivity(){
        String rest = "Napping";
        displayOuting(rest);
    }

    static void displayOuting(String activity){
        System.out.println("This outing will involve " + activity);
    }
}
