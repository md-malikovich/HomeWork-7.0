public class Magical extends Humanity implements Defensible {

    @Override
    public void makeHit() {
        System.out.println("Magic make hit.");
    }

    @Override
    public void applySuperpower() {
        System.out.println("Magic apply Superpower.");
    }
}
