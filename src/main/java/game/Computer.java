package game;

public class Computer {

    static {
        System.out.println("COMPUTER STATIC");
    }

    {
        System.out.println("COMPUTER NON-STATIC");
    }

    Computer () {
        System.out.println("COMPUTER CONSTRUCTOR");
    }


    public int computerMove() {
        return 0;
    }
}
