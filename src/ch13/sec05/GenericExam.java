package ch13.sec05;

public class GenericExam {
    public static void main(String[] args) {
        //모든사람 신청
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HightStudent>(new HightStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        System.out.println();
        //학생만신청
       // Course.registerCourse2(new Applicant<Person>(new Person()));
       // Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HightStudent>(new HightStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        //직장인 및 일반인만 신청
        System.out.println();
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));

       // Course.registerCourse3(new Applicant<Student>(new Student()));
       // Course.registerCourse3(new Applicant<HightStudent>(new HightStudent()));
       // Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
    }
}
