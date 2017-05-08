package midTermPackage8;

// 8. Create a method (no need for a main or class) that replaces all vowels
//    inside an array with a character (10 points)
//    a. Requirements: String and character need to be passed to the method as arguments
//    b. Requirements: method should print the new string and return the number of characters that got replaced

public class ClassQ8Main {
    public static void main(String[] args){
        char replaceChar = '%';
        String outString = "This is a string that has a bunch of vowels that will be replaced";
        System.out.println("There were " + replaceVowels(outString, replaceChar) + " characters replaced in the below sentence");
    }

    static int replaceVowels(String inString, char replacementChar){
        int replacedCnt = 0;
        char[] arrayX = inString.toCharArray();
        for(int i=0; i < arrayX.length; i++){
            if(Character.toString(arrayX[i]).matches("[aeiouy]|[AEIOUY]")){
                arrayX[i] = replacementChar;
                replacedCnt++;
            }
        }
        inString = String.valueOf(arrayX);
        System.out.println(inString);

        return replacedCnt;
    }
}

