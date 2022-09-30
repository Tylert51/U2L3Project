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


//method for comparing students tests scores, third parameter takes a number as which student do you
// think is better and reports the boolean value accordingly
    public void compareStudents(Student student1, Student student2, int whichStudentBetter) {
        boolean student2Greater;
        boolean student1Greater;
        if (student1.averageTestScore() > student2.averageTestScore()) {
            student1Greater = true;
            student2Greater = false;
        } else {
            student1Greater = false;
            student2Greater = true;
        }
        if (whichStudentBetter == 1) {
            System.out.println(student1Greater);
        }else{
            System.out.println(student2Greater);
        }
    }


    public void printStudentInfo() {
        System.out.println("Student Name: " + firstName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Average Test Scores: " + averageTestScore());
        System.out.println("Number of Tests averaged: " + testScoreCount);
    }
}
