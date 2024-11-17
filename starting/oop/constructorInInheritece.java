class Base {

    Base() {
        System.out.println("Hello base");
    }

    Base(int i) {
        System.out.println("Overloadingss base");
    }
}

class PBase extends Base {
    PBase() {
        super(45); // eta na dile 1st base constructor print hot..eivbei krte hy sob
        System.out.println("Hello Pbase");
    }
}

public class constructorInInheritece {
    public static void main(String[] args) {
        PBase n = new PBase();
    }
}
