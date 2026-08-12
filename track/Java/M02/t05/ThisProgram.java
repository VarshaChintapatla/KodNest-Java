package track.Java.M02.t05;

class Student {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
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

class ThisProgram {
    public static void main(String[] args) {
        Student s = new Student();
        s.input("varsha", 21, 5.5);
        s.display();

    }
}

// this keyword is used when the local parameters names are same with instance
// variables names ,we can uses oaarmetrs and instance variables diff then tehre
// is no use of this keyword