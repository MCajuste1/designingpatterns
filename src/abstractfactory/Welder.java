package abstractfactory;

// Abstract factory - A factory of factories; a factory that groups the individual
// but related/dependent factories together without specifying their concrete classes.



public class Welder implements DoorFittingExpert {
    public void getDescription() {
        System.out.println("I can only fit iron doors");

    }
}
