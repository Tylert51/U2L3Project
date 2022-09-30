import java.util.Objects;

public class Student {

    //Instance variables
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        testScoreCount = 0;
    }

    public void updateGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void addTestScore(double testScore) {
        accumulatedTestScores += testScore;
        testScoreCount++;
    }

    public double getTestScoreCount() {
        return accumulatedTestScores;
    }

    public double averageTestScore() {
        return accumulatedTestScores/testScoreCount;
    }


    //method for comparing students tests scores, second parameter you enter the student who you think is better
    // and the code outputs if you are right or wrong (false or true)
    public void compareToStudent(Student student2, Student whichStudentBetter) {
        boolean student2Greater;
        boolean student1Greater;
        if (averageTestScore() > student2.averageTestScore()) {
            student1Greater = true;
            student2Greater = false;
        } else {
            student1Greater = false;
            student2Greater = true;
        }
        if (whichStudentBetter == student2) {
            System.out.println(student2Greater);
        }else{
            System.out.println(student1Greater);
        }
    }


    public void printStudentInfo() {
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Average Test Scores: " + averageTestScore());
        System.out.println("Number of Tests averaged: " + testScoreCount);
        System.out.println();
    }
}
