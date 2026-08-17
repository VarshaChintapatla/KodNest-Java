package track.JavaPractice;

class Finger {

}

class Face {

}

class Pattern {

}

class Mobile {
    void unlock(int n) {
        lockopen();
    }

    void unlock(String n) {
        lockopen();
    }

    void unlock(Finger finger) {
        lockopen();
    }

    void unlock(Face face) {
        lockopen();
    }

    void unlock(Pattern pattern) {
        lockopen();
    }

    void lockopen() {
        System.out.println("Mobile is unlocked ");
    }
}

public class Mobilelock {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        Finger finger = new Finger();
        Face face = new Face();
        Pattern pattern = new Pattern();
        m.unlock(123);
        m.unlock("123");
        m.unlock(finger);
        m.unlock(face);
        m.unlock(pattern);

    }

}
