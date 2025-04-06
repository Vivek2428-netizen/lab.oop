class Instrument {
    void play() {
        System.out.println("Playing an instrument.");
    }
}

class StringInstrument extends Instrument {
    void type() {
        System.out.println("It's a string instrument.");
    }
}

class Guitar extends StringInstrument {
    void brand() {
        System.out.println("Brand: Fender");
    }
}

public class MultilevelInheritanceInstrument {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.type();
        guitar.brand();
    }
}
