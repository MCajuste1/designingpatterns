package abstractfactory;


// Abstract factory - A factory of factories; a factory that groups the individual
// but related/dependent factories together without specifying their concrete classes.


public class IronDoorFactory implements DoorFactory {

    public Door makeDoor(){

        return new IronDoor();
    }

    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
