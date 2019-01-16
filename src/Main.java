public class Main {
    public static void main(String[] args) {

        OpisPrzedmiotu drukarka1 = new OpisPrzedmiotu("Drukarka Minolta", "Laserowa",
                true, 1.2, 60, 50);

        OpisPrzedmiotu drukarka2 = new OpisPrzedmiotu("Drukarka HP", "Laserowa",
                false, 24, 35, 30);

        int nrDrukarki = 0;
        System.out.println("Drukarki w pokoju 123");
        System.out.println("Drukarka nr " + ++nrDrukarki);
        drukarka1.wydruk();
        System.out.println("Drukarka nr " + ++nrDrukarki);
        drukarka2.wydruk();

    }
}

