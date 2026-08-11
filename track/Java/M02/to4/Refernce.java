package track.Java.M02.to4;

class Employee {
    int id;
    String name;

    void work() {
        System.out.println("working");
    }
}

public class Refernce {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 21;
        e1.name = "varsha";
        System.out.println(e1.id);
        System.out.println(e1.name);
        Employee e2 = e1;
        e2.id = 22;
        e2.name = "chintapatla varsha";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);

    }

}
