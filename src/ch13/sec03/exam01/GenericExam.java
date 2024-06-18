package ch13.sec03.exam01;

public class GenericExam {
    public <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        GenericExam ge = new GenericExam();
        Box<Integer> box1 = ge.boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        Box<String> box2 = ge.boxing("희정");
        String strValue = box2.getT();
        System.out.println(strValue);
    }
}
