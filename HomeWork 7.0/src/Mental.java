public class Mental extends Humanity implements Defensible {

    @Override
    public void makeHit() {
        System.out.println("Mental make hit.");
    }

    @Override
    public void applySuperpower() {
        System.out.println("Mental apply Superpower.");
    }
}
