package midTermPackage2;

// 2. Create a class called MyClass, with a main method that prints in new lines the following array of values (5 points)
//    a. Apple, Orange, Pineapple, Banana, Berry, Peach

public class MyClass{
    public static void main(String[] args){
        String[] inValues = { "Apple", "Orange", "Pineapple", "Banana", "Berry", "Peach" };

        // The length of the array 'inValues' is 6
        for(int i=0; i < inValues.length; i++) {
            System.out.println(inValues[i]);
        }
    }
}
