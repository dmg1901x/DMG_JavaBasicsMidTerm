package midTermPackage4;

// 4. Create a method that returns back the largest number in an array of integers (5 points)
//    a. The method should receive an array of integers

public class ClassQ4Main {
    public static void main(String[] args){
        // Set up a random array to exersize the test method
        int arraySizeSample = (int)((Math.random() * 100 ) + 1);
        int[] outArray = new int[arraySizeSample];

        for(int i=0; i<outArray.length; i++){
            outArray[i] = (int)((Math.random() * 100 ) + 1);
        }
        System.out.println("The largest value of the array is: " + largestNumber(outArray) );
    }

    static int largestNumber(int[] inArray){
        int largestValue = 0;
        for(int i=0; i < inArray.length; i++){
            if(largestValue < inArray[i]){
                largestValue = inArray[i];
            }
        }
        return largestValue;
    }
}
