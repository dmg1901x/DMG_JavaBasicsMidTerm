package midTermPackage7;

// 7. Create a main method that loops through a double array of integers.
//    The loop should output the value of the greatest number. (10 points)
//    a. Requirements: Row > 5 and Col > 5
//    b. Define your double array

public class ClassQ7Main {

    public static void main(String[] args){
        int largestNumber = 0;
        int columns = 0;
        int rows = 0;
        Utils7 myUtils7 = new Utils7();
        columns = myUtils7.getColumn();
        rows = myUtils7.getRows();

        int doubleArraySample[][] = new int[columns][rows];
        Utils7.populateDoubleArray(doubleArraySample);

        for(int col=0; col < doubleArraySample.length; col++){
            for(int row=0; row < doubleArraySample[col].length; row++){
                if(largestNumber < doubleArraySample[col][row]){
                    largestNumber = doubleArraySample[col][row];
                }
            }
        }
        System.out.println("The largest number in the double array[" + columns + "][" + rows + "] is: " + largestNumber);
    }
}
