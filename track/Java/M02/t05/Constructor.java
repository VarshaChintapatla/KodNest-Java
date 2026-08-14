package track.Java.M02.t05;

class Studs {
    String name;
    int age;
    double height;

    Studs(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Studs s1 = new Studs("varsha", 18, 5.6);
        s1.display();

    }

}
