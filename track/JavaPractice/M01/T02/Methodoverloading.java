package track.JavaPractice.M01.T02;

public class Methodoverloading {
    static void m(String a, String b) {
        System.out.println("Hi string");
    }

    static void m(Methodoverloading a, Methodoverloading b) {
        System.out.println("Hi object");
    }

    public static void main(String[] args) {
        Methodoverloading ml = new Methodoverloading();
        ml.m(null, null);
    }

}
