package midTermPackageD;

// 13. Create a class called ClassA with a main method.
//     Create a second class called ClassB that contains a method called indentifyClass.
//     ClassA calls for identifyClass. If you do not wrap ClassB’s method with a try/catch
//     how else can you catch the exception?
//     Hint: be the lazy developer and the pro-active developer. (15 points)

public class ClassB {
    static void identifyClass() throws Exception{
        System.out.println("This is ClassB");
    }

    static void identifyClassForcedError() throws Exception{
        double x = 1/0;
        System.out.println("This is ClassB");
    }
}

