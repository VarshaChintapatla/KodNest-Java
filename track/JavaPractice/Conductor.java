package track.JavaPractice;

class Bus {

}

class Money {
    int money = 50;

}

class Ticket {

}

class Conductor {
    void collect(Money m) {
        System.out.println("Money is collected from the passenger");
    }

    Ticket issueTicket() {
        Ticket t = new Ticket();
        return t;
    }
}

class Passenger {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money();
        c.collect(m);
        Ticket t = c.issueTicket();
        if (t != null) {
            System.out.println("Ticket is issued to the passenger");
        } else {
            System.out.println("Ticket is not issued to the passenger");
        }
    }

}
