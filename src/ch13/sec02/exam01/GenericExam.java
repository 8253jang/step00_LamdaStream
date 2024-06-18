package ch13.sec02.exam01;

public class GenericExam {
    public static void main(String[] args) {
        Product<Tv,String> p = new Product<>();
        p.setKind(new Tv());
        p.setModel("스마트TV");

       Tv tv = p.getKind();
       String tvModel = p.getModel();

        System.out.println("---------------");
        Product<Car,String> p2 = new Product<>();
        p2.setKind(new Car());
        p2.setModel("suv자동차");
        Car car = p2.getKind();
        String carModel = p2.getModel();
    }
}
