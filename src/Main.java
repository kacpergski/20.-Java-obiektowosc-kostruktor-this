public class Main {
    public static void main(String[] args) {
        Door d1 = new Door(2.0, 0.8);
        Door d2 = new Door(2.0, 0.9);
        Door d3 = new Door(2.0, 0.7);

        Door [] doors = new Door[3];
        doors[0] = d1;
        doors[1] = d2;
        doors[2] = d3;

        for (Door d :doors ) {
            System.out.println("Wysokość: " + d.height);
            System.out.println("Szerokość: " + d.width);

        }
    }
}
