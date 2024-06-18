package ch13.generic;

public class GenericExam {
    public  <T> Box<T> boixing(T t){
        Box<T> box = new Box<>();
        box.setT(t);

        return box;

    }
    public static void main(String[] args) {
        GenericExam genericExam = new GenericExam();
        Box<Integer> box= genericExam.boixing(100);
        System.out.println(box.getT());

        System.out.println("---------");
        Box<String> box2= genericExam.boixing("ddd");
        System.out.println(box2.getT());


    }
}
