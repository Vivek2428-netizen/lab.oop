class Employee {
    void work() {
        System.out.println("Employee working...");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer is writing code.");
    }
}

class Designer extends Employee {
    void design() {
        System.out.println("Designer is creating UI/UX.");
    }
}

public class HierarchicalInheritanceEmployee {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();
        dev.code();

        Designer des = new Designer();
        des.work();
        des.design();
    }
}
