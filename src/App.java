

public class App {
    public static void main(String[] args) {
        Horse horse1 = new Horse('\u265E', "PIPI LONGSTOCKING", 0.65);
        Horse horse2 = new Horse('\u2658', "KOKOMO", 0.6);
        Horse horse3 = new Horse('\u2655', "EL JEFE", 0.5);
        //System.out.println("The confidence of " + horse2.getName() + " is " + horse2.getConfidence());

        Race r = new Race(20);
        r.addHorse(horse1, 1);
        r.addHorse(horse2, 2);
        r.addHorse(horse3, 3);

        r.startRace();
    }
}
