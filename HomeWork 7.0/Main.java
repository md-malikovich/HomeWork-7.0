public class Main {

    public static void main(String[] args) {

        System.out.println("________________________");
        Humanity h1 = new Warrior();
        h1.makeHit();
        h1.setHit(50);
        Warrior w1 = new Warrior();
        w1.applySuperpower();

        Humanity h2 = new Magical();
        h2.makeHit();
        h2.setHit(60);
        Magical m2 = new Magical();
        m2.applySuperpower();

        Humanity h3 = new Mental();
        h3.makeHit();
        h3.setHit(70);
        Mental w3 = new Mental();
        w3.applySuperpower();
        System.out.println("________________________");

        Humanity[] hum123 = {h1, h2, h3};
        for (int i = 0; i < hum123.length; i++) {
            printHit(hum123[i]);
            // hum123[i].makeHit();
        }
    }

    static void printHit(Humanity h3) {
        System.out.println(h3.getHit());

    }
}



/* Создать интерфейс с одним методом - применить суперСпособность - ApplySuperpower                 +
Реализовать этот интерфейс в классах Warrior, Magical, Mental.                                      +
Зарегаться на github.com, bitbucket.org и залить домашку в репозиторий, скинуть мне ссылку.         -          */

