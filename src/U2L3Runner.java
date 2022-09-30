public class U2L3Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Tyler", "Tang",2024);
        student1.addTestScore(100);
        student1.addTestScore(50);
        student1.printStudentInfo();
        System.out.println();

        Student student2 = new Student("John","Doe",2024);
        student2.addTestScore(80);
        student2.addTestScore(60);
        student2.printStudentInfo();
        System.out.println();

        student1.compareStudents(student1,student2,1);



    }
}
