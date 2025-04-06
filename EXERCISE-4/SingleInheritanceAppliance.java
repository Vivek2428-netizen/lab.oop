class Appliance {
    void powerOn() {
        System.out.println("Appliance is now ON.");
    }
}

class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing clothes...");
    }
}

public class SingleInheritanceAppliance {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.powerOn();
        wm.washClothes();
    }
}
