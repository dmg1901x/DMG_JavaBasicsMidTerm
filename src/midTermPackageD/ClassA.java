package midTermPackageD;

// 13. Create a class called ClassA with a main method.
//     Create a second class called ClassB that contains a method called indentifyClass.
//     ClassA calls for identifyClass. If you do not wrap ClassB’s method with a try/catch
//     how else can you catch the exception?
//     Hint: be the lazy developer and the pro-active developer. (15 points)

public class ClassA extends ClassB{
    public static void main(String[] args) {
        try {
            identifyClass();
        }
        catch (ArithmeticException ae){
            System.out.println("A math exception error has been caught : " + ae);
        }
        catch (Exception e){
            System.out.println("An error has been caught : " + e);
        }


        try {
            identifyClassForcedError();
        }
        catch (ArithmeticException ae){
            System.out.println("A math exception error has been caught : " + ae);
        }
        catch (Exception e){
            System.out.println("An error has been caught : " + e);
        }
    }
}
