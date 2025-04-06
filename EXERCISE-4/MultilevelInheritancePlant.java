class Plant {
    void grow() {
        System.out.println("Plant is growing...");
    }
}

class Tree extends Plant {
    void height() {
        System.out.println("Tree is 10 meters tall.");
    }
}

class FruitTree extends Tree {
    void fruitType() {
        System.out.println("This tree grows mangoes.");
    }
}

public class MultilevelInheritancePlant {
    public static void main(String[] args) {
        FruitTree ft = new FruitTree();
        ft.grow();
        ft.height();
        ft.fruitType();
    }
}
