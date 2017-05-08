package midTermPackage5;

// 5. Create a method that returns a random number from 1-100 (3 points)

public class ClassQ5Main {
    public static void main(String[] args){
        System.out.println("Here is a random number from 1 to 100: " + generateRandomNumber() );
    }

    static int generateRandomNumber(){
        double number = (Math.random());
        int randomNumber = 0;
        randomNumber = (int) ((number * 100 ) + 1);
        return randomNumber;
    }
}
