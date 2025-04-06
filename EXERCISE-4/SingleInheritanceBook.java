class Book {
    void info() {
        System.out.println("This is a book.");
    }
}

class Novel extends Book {
    void genre() {
        System.out.println("Genre: Fiction");
    }
}

public class SingleInheritanceBook {
    public static void main(String[] args) {
        Novel novel = new Novel();
        novel.info();
        novel.genre();
    }
}
