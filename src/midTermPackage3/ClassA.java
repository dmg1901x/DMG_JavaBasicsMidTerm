package midTermPackage3;

// 3. Create two classes: ClassA and ClassB.
//    ClassA will contain the main method while ClassB has a method called identifyClass.
//    (identifyClass returns no value)
//    a. Use instantiation to reach out to the identifyClass method (4 points)
//    b. Use inheritance to reach out to the identifyClass method (3 points)

public class ClassA extends ClassB{
//public class ClassA {
    public static void main(String[] args){
        // Using instantiation:
        ClassB myClassB = new ClassB();
        myClassB.identifyClass();

        // Using inheritance:
        identifyClass2();
    }
}
