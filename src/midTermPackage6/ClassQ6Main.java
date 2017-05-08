package midTermPackage6;

// 6. Create a method that receives an integer argument from 0-100 and
//    returns your test grade in a String format. (10 points)

public class ClassQ6Main {
    public static void main(String[] args){
        int score = (int)((Math.random() * 100) + 1);
        System.out.println("Based on your score of: " + score + " your grade is: " + generateGrade(score));
    }

    static String generateGrade(int inScore){
        String grade = "Incomplete";
        if(inScore < 60){
            grade = "F";
        } else {
            if(inScore < 70){
                grade = "D";
            } else {
                if(inScore < 80){
                    grade = "C";
                } else {
                    if(inScore < 90){
                        grade = "B";
                    } else {
                        grade = "A";
                    }
                }
            }
        }
        return grade;
    }
}
