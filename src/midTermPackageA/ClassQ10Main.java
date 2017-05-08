package midTermPackageA;

// 10. Create me an Interface that has one of each:
//          1 abstract method,
//          1 default method and
//          1 static method (10 points)
//     a. Requirements: Static method must be called from default method

public class ClassQ10Main implements InterfaceOuting{
    public static void main(String[] args) {
        ClassQ10Main myClassAMain = new ClassQ10Main();
        String move = myClassAMain.movingActivity();
        String climb = myClassAMain.climbingActivity();

        InterfaceOuting.displayOuting(move);
        InterfaceOuting.displayOuting(climb);

        // Note: This default method from the Interface does not need to be implemented
        myClassAMain.restingActivity();
    }

    // Note: These two abstract methods from the Interface must be implemented
    @Override
    public String movingActivity() {
        String moving = "Hiking";
        return moving;
    }

    @Override
    public String climbingActivity() {
        String climbing = "Rock Climbing";
        return climbing;
    }
}
