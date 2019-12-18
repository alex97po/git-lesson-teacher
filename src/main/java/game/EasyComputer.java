package game;

public class EasyComputer extends Computer {


    static {
        System.out.println("EASY STATIC");
    }

    {
        System.out.println("EASY NON-STATIC");
    }

    EasyComputer () {
        System.out.println("EASY CONSTRUCTOR");
    }

    @Override
    public int computerMove () {
        return (int) (Math.random() * 3 + 1);
    }

}
