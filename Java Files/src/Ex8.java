class First {
    public First() {
        System.out.println("F");
    }
}

class Second extends First {
    public Second() {
        System.out.println("S");
    }
}

class Third extends Second {
    public Third() {
        System.out.println("T");
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Third c = new Third();
    }
}
