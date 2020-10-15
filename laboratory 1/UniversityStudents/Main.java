class Student{
    String studentName;
    int age;
    double mark;
    public Student(String studentName, int age, double mark){
        this.studentName = studentName;
        this.age = age;
        this.mark = mark;
    }
}
class University{
    String universityName;
    int foundationYear;
    private Student[] universityStudent;


    public University(String universityName, int foundationYear, Student[] universityStudent){
        this.universityName = universityName;
        this.foundationYear = foundationYear;
        this.setUniversityStudent(universityStudent);
    }

    public Student[] getUniversityStudent() {
        return universityStudent;
    }
    public void setUniversityStudent(Student[] universityStudent) {
        this.universityStudent = universityStudent;
    }

    public double average(){
        double totalMarks = 0;
        for(int i=0; i<universityStudent.length; i++){
            totalMarks = totalMarks + getUniversityStudent()[i].mark;
        }
        return totalMarks/ universityStudent.length;
    }
}

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ana", 20, 9);
        Student student2 = new Student("Dan", 21, 10);
        Student student3 = new Student("Max", 20, 9.5);
        Student student4 = new Student("Ala", 20, 8.9);
        Student student5 = new Student("Alex", 20, 9.2);

        University university1 = new University("University1", 1991, new Student[]{student1, student2, student3});
        University university2 = new University("University2", 1992, new Student[]{student4, student5});
        University university3 = new University("University3", 1993, new Student[]{student1, student5});

        System.out.println(university1.average());
        System.out.println(university2.average());
        System.out.println(university3.average());

    }
}
