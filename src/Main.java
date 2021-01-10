import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Door d1 = new Door(2.0, 0.8);
        Door d2 = new Door(2.0, 0.9);
        Door d3 = new Door(2.0, 0.7);

        Door[] doors = new Door[3];
        doors[0] = d1;
        doors[1] = d2;
        doors[2] = d3;

        for (Door d : doors) {
            System.out.println("Wysokość: " + d.height);
            System.out.println("Szerokość: " + d.width);

            // Zadanie 2

            System.out.println();
            System.out.println("----------zadanie 2-----------");
            System.out.println();

            char[] title1 = {'u', 'm', 'y', 'j'};
            char[] desc1 = {'p', 'o', 'd', 'l', 'o', 'g', 'e', ' ', 'w', ' ', 'k', 'u', 'c', 'h', 'n', 'i'};
            Task t1 = new Task(title1, desc1, false);

            char[] title2 = {'p', 'r', 'z', 'e', 'c', 'z', 'y', 't', 'a', 'j'};
            char[] desc2 = {'k', 'o', 'm', 'p', 'e', 'n', 'd', 'i', 'u', 'm', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 's', 't', 'y'};
            Task t2 = new Task(title2, desc2, true);

            Task[] tasks = new Task[2];
            tasks[0] = t1;
            tasks[1] = t2;


            for (Task t : tasks) {
                System.out.print("Nazwa zadania: ");
                for (char c : t.title) {
                    System.out.print(c);

                }
                System.out.println();
                System.out.print("Nazwa miejsca: ");
                for (char de : t.desc) {
                    System.out.print(de);
                }
                System.out.println();
                if(t.done){
                System.out.println("Status: done");}
                else {
                    System.out.println("Status: to do");
                    System.out.println();
                }



            }
        }

        // Zadanie 3

        System.out.println();
        System.out.println("----------zadanie 3-----------");
        System.out.println();

        Car car1 = new Car("Fiat",164000.23);
        Car car2 = new Car("Honda",257000.44);
        Car car3 = new Car("Mazda", 400345.77);

            Car[] cars=new Car[3];
        cars[0]=car1;
        cars[1]=car2;
        cars[2]=car3;

        for (Car cL: cars){
            System.out.println("Marka pojazdu: " + cL.brand);
            System.out.println("Cena pojazdu: " + cL.price);
            System.out.println();
        }

    }
}
