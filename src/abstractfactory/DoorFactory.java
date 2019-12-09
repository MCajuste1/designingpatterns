package abstractfactory;

// Abstract factory - A factory of factories; a factory that groups the individual
// but related/dependent factories together without specifying their concrete classes.


public interface DoorFactory {
    Door makeDoor();
    DoorFittingExpert makeFittingExpert();
}
