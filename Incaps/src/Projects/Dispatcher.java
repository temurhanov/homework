package Projects;

public class Dispatcher {
    public static void main(String[] args) {
        Model ml = new Model();
        ml.gallon = 4;


        Controller c = new Controller();
        ml.litr = c.convert(ml.gallon);

        View w = new View();
        w.display(ml.litr, ml.gallon);

    }
}
