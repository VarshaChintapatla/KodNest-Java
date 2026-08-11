package track.Java.M02.to4;

class Student {
    String name;
    int age;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.run();
        s.sleep();
    }
}