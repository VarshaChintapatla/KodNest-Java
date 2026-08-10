package track.Java.M02.to4;

public class StudentAplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "varsha";
        s1.age = 21;
        s1.height = 5.4;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
        s1.sleep();
        s1.run();

    }

}
