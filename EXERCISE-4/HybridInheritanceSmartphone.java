interface SmartDevice {
    void connect();
}

abstract class Electronic {
    void battery() {
        System.out.println("Battery: 4000mAh");
    }
}

class Smartphone extends Electronic implements SmartDevice {
    public void connect() {
        System.out.println("Smartphone connected to Wi-Fi");
    }

    void brand() {
        System.out.println("Brand: Samsung");
    }
}

public class HybridInheritanceSmartphone {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.battery();
        phone.connect();
        phone.brand();
    }
}
