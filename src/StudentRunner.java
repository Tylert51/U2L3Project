public class StudentRunner {
    public static void main(String[] args) {
        Student tyler = new Student("Tyler", "Tang",2024);
        tyler.addTestScore(100);
        tyler.addTestScore(50);
        tyler.printStudentInfo();

        Student john = new Student("John","Doe",2024);
        john.addTestScore(80);
        john.addTestScore(60);
        john.printStudentInfo();

        Student jake = new Student("Jake", "Wall", 2024);
        jake.addTestScore(100);
        jake.addTestScore(0);
        jake.printStudentInfo();


        jake.compareToStudent(tyler, jake);

    }
}
