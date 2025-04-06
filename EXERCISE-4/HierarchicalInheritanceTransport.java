class Transport {
    void move() {
        System.out.println("Transport is moving...");
    }
}

class Bus extends Transport {
    void capacity() {
        System.out.println("Bus can carry 50 people.");
    }
}

class Train extends Transport {
    void speed() {
        System.out.println("Train runs at 120 km/h.");
    }
}

public class HierarchicalInheritanceTransport {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.capacity();

        Train train = new Train();
        train.move();
        train.speed();
    }
}
