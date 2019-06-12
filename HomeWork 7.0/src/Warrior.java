public class Warrior extends Humanity implements Defensible {

    @Override
    public void makeHit() {
        System.out.println("Warrior make hit.");
    }

    @Override
    public void applySuperpower() {
        System.out.println("Warrior apply Superpower.");
    }


}
