import de.htwberlin.fiw.profiler.Element;
import de.htwberlin.fiw.profiler.List;
import de.htwberlin.fiw.profiler.ProfiledClass;

public class Main extends ProfiledClass {
    public void run() {
        long ergebnis = 1;
        for (long i = 1; i < 1000000000; i++) {
            ergebnis += i;
        }
        System.out.println("Ergebnis ist: " + ergebnis);
    }

    public static void main(String[] args) {
        // Profiler profiler = new Profiler(Main.class);
        //profiler.start();
        //profiler.printResults();

        List list = new List();
        list.prepend(7);
        list.prepend(8);
        list.prepend(9);
        list.append(10);
        list.prepend(12);
        list.append(6);

        Element a= new Element(55,null);
        Element b= new Element(45,a);
        list.insert(2,b);
    }

}

