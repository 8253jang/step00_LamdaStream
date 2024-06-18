package ch13.sec05;

public class Course {
    //모든사람이면 등록
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"  Course1을 등록함.");
    }
    //학생만 등록
    public static  void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"  Course2을 등록함.");
    }

    //직장인 및 일반일만 등록가능
    public static  void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"  Course3을 등록함.");
    }
}
