interface Student {
    void study();
}

interface Athlete {
    void play();
}

class Scholar implements Student, Athlete {
    public void study() {
        System.out.println("Scholar is studying...");
    }

    public void play() {
        System.out.println("Scholar is playing football...");
    }

    void project() {
        System.out.println("Scholar is working on a project.");
    }
}

public class HybridInheritanceScholar {
    public static void main(String[] args) {
        Scholar s = new Scholar();
        s.study();
        s.play();
        s.project();
    }
}
