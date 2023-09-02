package hw3.prog3;

public class Sparrow implements Fly {
    @Override
    public void sing() {
        System.out.println("Sparrow tweets-tweets");
    }

    @Override
    public void fly() {
        System.out.println("The Sparrow likes to fly");
    }
}
